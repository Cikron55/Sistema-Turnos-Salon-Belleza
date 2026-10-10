package ar.edu.unahur.obj2.peluqueria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.peluqueria.categorias.CategoriaFrecuente;
import ar.edu.unahur.obj2.peluqueria.servicios.Coloracion;

public class ColoracionConRetoqueTest {

    @Test
    public void dadaUnaColoracionConfirmada_registraAvisoDeRetoqueYFormatoComprobante(){
        Cliente cliente = new Cliente("Mateo", new CategoriaFrecuente());
        Coloracion coloracion = new Coloracion(10_000.0, 5);

        Turno turno = new Turno(cliente, coloracion, 1);

        assertTrue(turno.getComprobante().startsWith("TRN-COL-"));
        assertTrue(coloracion.tieneAvisoRetoque());
        assertEquals(1, cliente.getHistorialTurnos().size());
    }
}
