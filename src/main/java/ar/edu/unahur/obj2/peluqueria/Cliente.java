package ar.edu.unahur.obj2.peluqueria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ar.edu.unahur.obj2.peluqueria.categorias.CategoriaCliente;
import ar.edu.unahur.obj2.peluqueria.categorias.CategoriaVIP;
import ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones.CategoriaNoAutorizadosException;
import ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones.ClienteSinTurnosException;

public class Cliente {
    private final String nombre;
    private CategoriaCliente categoria;
    private final List<Turno> historialTurnos;

    public Cliente(String nombre, CategoriaCliente categoria){
        this.nombre = nombre;
        this.categoria = categoria;
        this.historialTurnos = new ArrayList<>();
    }

    public void cambiarCategoria(CategoriaCliente nuevaCategoria){
        if (nuevaCategoria instanceof CategoriaVIP && this.historialTurnos.isEmpty()){
            throw new CategoriaNoAutorizadosException("No se puede asignar la categoria VIP a un cliente que no tiene un historial de turnos.");
        }
        this.categoria = nuevaCategoria;
    }

    public void agregarTurno(Turno turno){
        this.historialTurnos.add(turno);
    }

    public List<Turno> getHistorialTurnos(){
        if (historialTurnos.isEmpty()) {
            throw new ClienteSinTurnosException("El cliente todavia no tiene ningun turno");
        }
        return Collections.unmodifiableList(historialTurnos);
    }

    public Double consultarCostoTotalTurnos() {
    return getHistorialTurnos().stream().mapToDouble(t -> t.getImporteTotal()).sum();
}

    public CategoriaCliente getCategoria(){
        return categoria;
    }

    public String getNombre(){
        return nombre;
    }
}
