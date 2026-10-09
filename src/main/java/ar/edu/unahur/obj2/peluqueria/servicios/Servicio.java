package ar.edu.unahur.obj2.peluqueria.servicios;

import ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones.CantidadInvalidaException;
import ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones.CuposInsuficientesException;
import ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones.PrecioNegativoException;

public abstract class Servicio {
    public final Double precioBase;
    public Integer cuposDisponibles;

    public Servicio(Double precioBase, Integer cuposDisponibles){
        if (precioBase < 0){
            throw new PrecioNegativoException("El precio base no puede ser negativo.");
        }
        this.precioBase = precioBase;
        this.cuposDisponibles = cuposDisponibles;
    }

    public void reducirCupos(Integer cantidad){
        if (cantidad > this.cuposDisponibles){
            throw new CuposInsuficientesException("Cupos insuficientes.");
        }
        this.cuposDisponibles -= cantidad;
    }

    public void validarSesiones(Integer sesiones){
        if (sesiones != 1){
            throw new CantidadInvalidaException("Este servicio solo permite validar 1 sesion.");
        }
    }

    public abstract String generarComprobante();

    public void aplicarEfectoSecundario(){

    }

    public Double getPrecioBase(){
        return precioBase;
    }

    public Integer getCuposDisponibles(){
        return cuposDisponibles;
    }
}
