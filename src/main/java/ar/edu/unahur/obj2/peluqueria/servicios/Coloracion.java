package ar.edu.unahur.obj2.peluqueria.servicios;

public class Coloracion extends Servicio{
    private Boolean avisoRetoqueRegistrado = false;

    public Coloracion(Double precioBase, Integer cuposDisponibles){
        super(precioBase, cuposDisponibles);
    }

    @Override 
    public String generarComprobante(){
        return "TRN-COL-" + System.nanoTime();
    }

    @Override
    public void aplicarEfectoSecundario(){
        this.avisoRetoqueRegistrado = true;
    }

    public Boolean tieneAvisoRetoque(){
        return avisoRetoqueRegistrado;
    }
}
