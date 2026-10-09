package ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones;

public class CategoriaNoAutorizadosException extends RuntimeException{
    public CategoriaNoAutorizadosException (String mensaje){
        super(mensaje);
    }
}
