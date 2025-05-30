package Service;

import Model.Pago;
import Repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoService {
    @Autowired
    PagoRepository pagoRepository;

    public int addPago(Pago pago) {
        pagoRepository.save(pago);
        return 0;
    }

    public String ListarPagos(){
        String output = "";
        for (Pago pago : pagoRepository.findAll()) {
            output +="IdPago" + pago.getIdPago()+"\n";
            output += "Nombre"+pago.getNombre()+"\n";
            output += "Cantidad"+pago.getCantidad()+"\n";

        }if (output.isEmpty()) {
            output += "No hay pagos";
        }else{
            return output;
        }
    }











































}
