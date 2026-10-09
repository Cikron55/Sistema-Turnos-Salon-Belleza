package ar.edu.unahur.obj2.peluqueria;

import ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones.CantidadInvalidaException;
import ar.edu.unahur.obj2.peluqueria.servicios.Servicio;

public class Turno {
    private final Cliente cliente;
    private final Servicio servicio;
    private final Integer sesiones;
    private final Double importeTotal;
    private final String comprobante;
    public Object getImporteTotal;

    public Turno(Cliente cliente, Servicio servicio, Integer sesiones){
        if (sesiones <= 0){
            throw new CantidadInvalidaException("La cantidad de sesiones debe ser mayor a cero.");
        }
        servicio.validarSesiones(sesiones);
        servicio.reducirCupos(sesiones);

        this.cliente = cliente;
        this.servicio = servicio;
        this.sesiones = sesiones;
        this.comprobante = servicio.generarComprobante();

        Double subtotalBase = servicio.getPrecioBase() * sesiones;
        Double subtotalConDescuento = cliente.getCategoria().aplicarDescuento(subtotalBase);
        Double recargoFijoPorInsumos = RecargoFijoPorInsumos.getInstancia().getValor();

        this.importeTotal = subtotalConDescuento + recargoFijoPorInsumos;

        servicio.aplicarEfectoSecundario();
        cliente.agregarTurno(this);
        Salon.registrarTurnoConfirmado();
    }

    public Cliente getCliente(){
        return cliente;
    }

    public Servicio getServicio(){
        return servicio;
    }

    public Integer getSesiones(){
        return sesiones;
    }

    public Double getImporteTotal() {
        return importeTotal;        
    }

    public String getComprobante(){
        return comprobante;
    }
}
