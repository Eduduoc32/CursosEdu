package Service;

import Model.Usuarios;
import Repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuariosRepository usuariosRepository;
    public String AgregarUsuario(Usuarios usuario) {
        usuariosRepository.save(usuario);
        return "Registro Agregado";
    }

    public String ListarUsuarios() {

        String output = "";
        for (Usuarios usuario : usuariosRepository.findAll()) {
            output += "Id Usuario: " + usuario.getIdUsuario() + "\n";
            output += "Nombre Usuario: " + usuario.getNombre() + "\n";
            output += "Apellido Usuario: " + usuario.getApellido() + "\n";
            output += "Correo Usuario: " + usuario.getCorreo() + "\n";
            output += "Contrasenia Usuario: " + usuario.getContrasenia() + "\n";

        } if (output.isEmpty()) {
            return "No se encontro el usuario";
        }else{
            return output;
        }
    }

    public String obtenerUsuario(int idUsuario) {
        String output = "";
        for (Usuarios usuario : usuariosRepository.findAll()) {
            output += "Id Usuario: " + usuario.getIdUsuario() + "\n";
            output += "Nombre Usuario: " + usuario.getNombre() + "\n";
            output += "Apellido Usuario: " + usuario.getApellido() + "\n";
            output += "Correo Usuario: " + usuario.getCorreo() + "\n";
            output += "Contrasenia Usuario: " + usuario.getContrasenia() + "\n";

        }if (output.isEmpty()) {
            return "No se encontro el usuario";
        }else{
            return "No existe el usuario";
        }
    }

    public String EliminarUsuario(int idUsuario) {
            String output = "";
            for (Usuarios usuario : usuariosRepository.findAll()) {
                output += "Id Usuario: " + usuario.getIdUsuario() + "\n";
                output += "Nombre Usuario: " + usuario.getNombre() + "\n";
                output += "Apellido Usuario: " + usuario.getApellido() + "\n";
                output += "Correo Usuario: " + usuario.getCorreo() + "\n";
                output += "Contrasenia Usuario: " + usuario.getContrasenia() + "\n";

            }if (output.isEmpty()) {
                return "No se encontro el usuario";
        }else{
                return "No existe el usuario";
        }
    }

    public String ActualizarUsuario(int id, Usuarios usuario) {
        String output = "";
        for (Usuarios usuarios : usuariosRepository.findAll()) {
            output += "Id Usuario: " + usuarios.getIdUsuario() + "\n";
            output += "Nombre Usuario: " + usuarios.getNombre() + "\n";
            output += "Apellido Usuario: " + usuarios.getApellido() + "\n";
            output += "Correo Usuario: " + usuarios.getCorreo() + "\n";
            output += "Contrasenia Usuario: " + usuarios.getContrasenia() + "\n";

        }if (output.isEmpty()) {
            return "No se encontro el usuario";
        }else{
            return "No Existe el usuario";
        }
    }













































}
