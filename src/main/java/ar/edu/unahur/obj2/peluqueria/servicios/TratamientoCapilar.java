package ar.edu.unahur.obj2.peluqueria.servicios;

import ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones.CantidadInvalidaException;

public class TratamientoCapilar extends Servicio{
    public TratamientoCapilar(Double precioBase, Integer cuposDisponibles){
        super(precioBase, cuposDisponibles);
    }

    @Override
    public String generarComprobante(){
        return "TRN-TRA-" + System.nanoTime();
    }

    @Override
    public void validarSesiones(Integer sesiones){
        if (sesiones <= 0) {
            throw new CantidadInvalidaException("La cantidad de sesiones debe ser mayor a cero.");
        }
    }
}
