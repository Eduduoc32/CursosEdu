package com.Proyecto.Cursos.Controller;

import com.Proyecto.Cursos.Model.Usuarios;
import com.Proyecto.Cursos.Service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@Tag(name="Controlador Usuarios",description = "Servicios Rest para gestion de usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    @Operation(summary = "Obtener Usuarios",description = "Obtiene la lista completa de usuarios registrados en el sistema")
    @ApiResponse(responseCode = "200", description = "¡Consulta Exitosa!")
    public String getUsuario() {
        return usuarioService.ListarUsuarios();

    }

    @PostMapping
    @Operation(summary = "Agregar Usuarios",description = "Obtiene la lista completa de usuarios agregados en el sistema")
    public String postUsuario(@RequestBody Usuarios usuario) {
        return usuarioService.AgregarUsuario(usuario);
    }


    @GetMapping("/{id}")
    @Operation(summary = "Obtener Usuarios con (id)",description = "Obtiene la lista completa de usuarios registrados en el sistema")
    public String getUsuarioById(@PathVariable int id) {
        return usuarioService.obtenerUsuario(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "eliminar Usuarios con (id)",description = "Obtiene la lista completa de usuarios eliminados en elsistema")
    public String deleteUsuarioById(@PathVariable int id) {
        return usuarioService.EliminarUsuario(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar Usuarios con (id)",description = "Obtiene la lista completa de usuarios actualizados en el sistema")
    public String updateUsuarioById(@PathVariable int id, @RequestBody Usuarios usuario) {
        return usuarioService.ActualizarUsuario(id,usuario);
    }











































}
