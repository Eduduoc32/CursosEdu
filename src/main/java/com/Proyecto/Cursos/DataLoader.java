package com.Proyecto.Cursos;

import com.Proyecto.Cursos.Model.Carrito;
import com.Proyecto.Cursos.Model.Cursos;
import com.Proyecto.Cursos.Model.Pago;
import com.Proyecto.Cursos.Model.Usuarios;
import com.Proyecto.Cursos.Repository.CarritoRepository;
import com.Proyecto.Cursos.Repository.CursosRepository;
import com.Proyecto.Cursos.Repository.PagoRepository;
import com.Proyecto.Cursos.Repository.UsuariosRepository;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import java.util.Random;

@Profile("dev")
@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private CarritoRepository carritoRepository;
    @Autowired
    private CursosRepository cursosRepository;
    @Autowired
    private PagoRepository pagoRepository;
    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public void run(String... args) throws Exception  {

        Faker faker = new Faker();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            Cursos curso = new Cursos();
            curso.setNombre(faker.educator().course());
            curso.setDescripcion(faker.lorem().sentence());
            cursosRepository.save(curso);
        }

        for (int i = 0; i < 10; i++) {
            Usuarios usuario = new Usuarios();
            usuario.setNombre(faker.name().firstName());
            usuario.setApellido(faker.name().lastName());
            usuario.setCorreo(faker.internet().emailAddress());
            usuario.setContrasenia(faker.internet().password());
            usuariosRepository.save(usuario);
        }

        for (int i = 0; i < 7; i++) {
            Carrito carrito = new Carrito();
            carrito.setNombre(faker.commerce().productName());
            carrito.setDescripcion(faker.lorem().sentence());
            carrito.setCantidad(faker.number().numberBetween(1, 10));
            carritoRepository.save(carrito);
        }

        for (int i = 0; i < 5; i++) {
            Pago pago = new Pago();
            pago.setNombre(faker.name().fullName());
            pago.setCantidad(faker.number().numberBetween(1000, 10000));
            pagoRepository.save(pago);
        }


    }



}
