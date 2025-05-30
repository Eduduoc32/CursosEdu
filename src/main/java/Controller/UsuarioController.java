package Controller;

import Model.Usuarios;
import Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public String getUsuario() {
        return usuarioService.ListarUsuarios();

    }

    @PostMapping
    public String postUsuario(@RequestBody Usuarios usuario) {
        return usuarioService.AgregarUsuario(usuario);
    }

    @GetMapping("/{id}")
    public String getUsuarioById(@PathVariable int id) {
        return usuarioService.obtenerUsuario(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUsuarioById(@PathVariable int id) {
        return usuarioService.EliminarUsuario(id);
    }

    @PutMapping("/{id}")
    public String updateUsuarioById(@PathVariable int id, @RequestBody Usuarios usuario) {
        return usuarioService.ActualizarUsuario(id,usuario);
    }











































}
