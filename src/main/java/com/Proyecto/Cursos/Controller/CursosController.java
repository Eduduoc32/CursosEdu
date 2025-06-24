package com.Proyecto.Cursos.Controller;

import com.Proyecto.Cursos.Model.Cursos;
import com.Proyecto.Cursos.Service.CursosService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursos")
@Tag(name="Controlador Cursos",description = "Servicios Rest para gestion de cursos")
public class CursosController {
    @Autowired
    private CursosService cursosService;

    @GetMapping
    @Operation(summary = "Obtener cursos",description = "Obtiene la lista completa de cursos registrados en el sistema")
    @ApiResponse(responseCode = "200", description = "¡Consulta Exitosa!")
    public String getCursos(){
        return cursosService.ListarCursos();
    }

    @PostMapping
    @Operation(summary = "Agregar cursos",description = "Obtiene la lista completa de cursos agregados en el sistema")
    public String addCursos(@RequestBody Cursos cursos){
        return cursosService.agregarCursos(cursos);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener cursos con (id)",description = "Obtiene la lista completa de curso con (id) registrados en el sistema")
    public String getCursos(@PathVariable int id){
        return cursosService.obtenerCurso(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar cursos con (id)",description = "Obtiene la lista completa de cursos con (id) eliminados en el sistema")
    public String deleteCursos(@PathVariable int id){
        return cursosService.eliminarCurso(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar cursos con (id)",description = "Obtiene la lista completa de cursos con (id) actualizados en el sistema")
    public String updateCursos(@PathVariable int id, @RequestBody Cursos cursos){
        return cursosService.actualizarCurso(id,cursos);
    }


























}
