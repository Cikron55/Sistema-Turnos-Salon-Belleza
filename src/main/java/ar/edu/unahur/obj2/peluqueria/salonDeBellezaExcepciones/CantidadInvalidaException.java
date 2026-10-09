package ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones;

public class CantidadInvalidaException extends RuntimeException{
    public CantidadInvalidaException(String mensaje){
        super(mensaje);
    }
}
