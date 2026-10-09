package ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones;

public class ClienteSinTurnosException extends RuntimeException{
    public ClienteSinTurnosException(String mensaje){
        super(mensaje);
    }
}
