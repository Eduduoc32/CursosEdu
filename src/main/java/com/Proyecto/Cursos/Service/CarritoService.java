package com.Proyecto.Cursos.Service;

import com.Proyecto.Cursos.Model.Carrito;
import com.Proyecto.Cursos.Repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoService {
    @Autowired
    CarritoRepository carritoRepository;
    public String agrregarCarrito(Carrito carrito) {
        carritoRepository.save(carrito);
        return "Carrito agregado";

    }
    public String obtenerCarrito(int id) {
        String output = "";
        for (Carrito carrito : carritoRepository.findAll()) {
            output += "id" + carrito.getIdCarrito() + "\n";
            output += "nombre" + carrito.getNombre() + "\n";
            output += "descripcion" + carrito.getDescripcion() + "\n";
            output += "Cantidad" + carrito.getCantidad() + "\n";
        }if (output != ""){
            return "No se encontro el carrito";
        }else{
            return output;
        }
    }



    public String listarCarritos() {
       String output = "";
       for (Carrito carrito : carritoRepository.findAll()) {
           output += "id" + carrito.getIdCarrito() + "\n";
           output += "nombre" + carrito.getNombre() + "\n";
           output += "descripcion" + carrito.getDescripcion() + "\n";
           output += "Cantidad" + carrito.getCantidad() + "\n";
       }if(output == ""){
           return "No se encontro el carrito";
        }else{
           return output;
        }
    }

    public String eliminarCarrito(int id) {
        String output = "";
        for (Carrito carrito : carritoRepository.findAll()) {
            output += "id" + carrito.getIdCarrito() + "\n";
            output += "nombre" + carrito.getNombre() + "\n";
            output += "descripcion" + carrito.getDescripcion() + "\n";
            output += "Cantidad" + carrito.getCantidad() + "\n";
        }if(output == ""){
            return "No se encontro el carrito";
        }else{
            return output;
        }
    }

    public String actualizarCarrito(int id, Carrito carrito) {
        String output = "";
        for (Carrito carrito2 : carritoRepository.findAll()) {
            output += "id" + carrito2.getIdCarrito() + "\n";
            output += "nombre" + carrito2.getNombre() + "\n";
            output += "descripcion" + carrito2.getDescripcion() + "\n";
            output += "Cantidad" + carrito2.getCantidad() + "\n";
        }if(output == ""){
            return "No se encontro el carrito";
        }else{
            return output;
        }
    }









































}
