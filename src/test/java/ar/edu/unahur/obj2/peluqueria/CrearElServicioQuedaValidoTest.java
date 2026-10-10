package ar.edu.unahur.obj2.peluqueria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.peluqueria.servicios.CorteDeCabello;
import ar.edu.unahur.obj2.peluqueria.servicios.Servicio;

public class CrearElServicioQuedaValidoTest {
    @Test
    public void dadoPrecioBaseYCuposValidos_alCrearElServicio_quedanRegistrados() {
        Servicio servicio = new CorteDeCabello(5_000.0, 10);

        assertEquals(5_000.0, servicio.getPrecioBase(), 0.01);
        assertEquals(10, servicio.getCuposDisponibles());
    }
}
