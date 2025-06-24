package com.Proyecto.Cursos.Service;

import com.Proyecto.Cursos.Model.Pago;
import com.Proyecto.Cursos.Repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoService {
    @Autowired
    PagoRepository pagoRepository;

    public String  addPago(Pago pago) {
        pagoRepository.save(pago);
        return "pago Agregado";
    }

    public String ListarPagos(){
        String output = "";
        for (Pago pago : pagoRepository.findAll()) {
            output +="IdPago" + pago.getIdPago()+"\n";
            output += "Nombre"+pago.getNombre()+"\n";
            output += "Cantidad"+pago.getCantidad()+"\n";

        }if (output.isEmpty()) {
            return "No hay pagos";
        }else{
            return output;
        }
    }

    public String obtenerPago(int id){
        String output = "";
        for (Pago pago : pagoRepository.findAll()) {
            output += "IdPago"+pago.getIdPago()+"\n";
            output += "Nombre"+pago.getNombre()+"\n";
            output += "Cantidad"+pago.getCantidad()+"\n";

        }if (output.isEmpty()) {
            return "No hay pagos";
        }else{
            return output;
        }
    }

    public String eliminarPago(int id){
        String output = "";
        for (Pago pago : pagoRepository.findAll()) {
            output += "IdPago"+pago.getIdPago()+"\n";
            output += "Nombre"+pago.getNombre()+"\n";
            output += "Cantidad"+pago.getCantidad()+"\n";
        } if (output.isEmpty()) {
            return "No hay pagos";
        }else{
            return output;
        }
    }

    public String actualizarPago(int id, Pago pago){
        String output = "";
        for (Pago pago2 : pagoRepository.findAll()) {
            output += "IdPago"+pago2.getIdPago()+"\n";
            output += "Nombre"+pago2.getNombre()+"\n";
            output += "Cantidad"+pago2.getCantidad()+"\n";
        }if (output.isEmpty()) {
            return "No hay pagos";
        }else{
            return output;
        }
    }














































}
