package com.Proyecto.Cursos.Controller;

import com.Proyecto.Cursos.Model.Carrito;
import com.Proyecto.Cursos.Service.CarritoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carrito")
@Tag(name="Controlador Carrito",description = "Servicios Rest para gestion del carrito")
public class CarritoController {
    @Autowired
    private CarritoService carritoService;

    @GetMapping
    @Operation(summary = "Obtener carrito",description = "Obtiene la lista completa de carrito registrados en el sistema")
    @ApiResponse(responseCode = "200", description = "¡Consulta Exitosa!")
    public String getCarrito() {
        return carritoService.listarCarritos();
    }

    @PostMapping
    @Operation(summary = "Agregar carrito",description = "Obtiene la lista completa de carrito agregado en el sistema")
    public String addCarrito(@RequestBody Carrito carrito) {
        return carritoService.agrregarCarrito(carrito);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener carrito con (id)",description = "Obtiene la lista completa de carrito con (id) registrados en el sistema")
    public String obtenerCarrito(@PathVariable int id) {
        return carritoService.obtenerCarrito(id);
    }


    @DeleteMapping("/{id}")
    @Operation(summary = "eliminar carrito con (id)",description = "Obtiene la lista completa de cursos con (id) eliminados  en el sistema")
    public String deleteCarrito(@PathVariable int id) {

        return carritoService.eliminarCarrito(id);
    }


    @PutMapping("/{id}")
    @Operation(summary = "Actualizar carrito con (id)",description = "Obtiene la lista completa de pagos registrados en el sistema")
    public String updateCarrito(@PathVariable int id, @RequestBody Carrito carrito) {
        return carritoService.actualizarCarrito(id,carrito);
    }














































}
