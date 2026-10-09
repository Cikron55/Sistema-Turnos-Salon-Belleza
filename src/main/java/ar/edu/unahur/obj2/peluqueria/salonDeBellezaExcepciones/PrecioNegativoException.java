package ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones;

public class PrecioNegativoException extends RuntimeException{
    public PrecioNegativoException(String mensaje){
        super(mensaje);
    }
}
