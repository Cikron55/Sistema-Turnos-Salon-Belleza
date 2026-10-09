package ar.edu.unahur.obj2.peluqueria.servicios;

public class CorteDeCabello extends Servicio{
    public CorteDeCabello(Double precioBase, Integer cuposDisponibles){
        super(precioBase, cuposDisponibles);
    }

    @Override 
    public String generarComprobante(){
        return "TRN-COR-" + System.nanoTime();
    }
}
