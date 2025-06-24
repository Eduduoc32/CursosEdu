package com.Proyecto.Cursos.Controller;

import com.Proyecto.Cursos.Model.Pago;
import com.Proyecto.Cursos.Service.PagoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagos")
@Tag(name="Controlador Pagos",description = "Servicios Rest para gestion de pagos")
public class PagosController {

    @Autowired
    private PagoService pagoService;

    @GetMapping
    @Operation(summary = "Obtener Pagos",description = "Obtiene la lista completa de pagos registrados en el sistema")
    @ApiResponse(responseCode = "200", description = "¡Consulta Exitosa!")
    public String getPagos(){
        return pagoService.ListarPagos();
    }


    @PostMapping
    @Operation(summary = "Agregar Pagos",description = "Obtiene la lista completa de pagos agregados en el sistema")
    public String addPago(@RequestBody Pago pago) {
        return pagoService.addPago(pago);
    }


    @GetMapping("/{id}")
    @Operation(summary = "Obtener Pagos con (id)",description = "Obtiene la lista completa de pagos con (id) registrados en el sistema")
    public String getPago(@PathVariable int id) {
        return pagoService.obtenerPago(id);
    }



    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar Pagos con (id)",description = "Obtiene la lista completa de pagos con (id) eliminados en el sistema")
    public String eliminarPago(@PathVariable int id) {
        return pagoService.eliminarPago(id);
    }


    @PutMapping("/{id}")
    @Operation(summary = "Actualizar Pagos con (id)",description = "Obtiene la lista completa de pagos actualizados en el sistema")
    public String actualizarPago(@PathVariable int id, @RequestBody Pago pago) {
        return pagoService.actualizarPago(id,pago);
    }












































}
