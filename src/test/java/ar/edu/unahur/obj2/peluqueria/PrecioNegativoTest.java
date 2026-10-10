package ar.edu.unahur.obj2.peluqueria;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones.PrecioNegativoException;
import ar.edu.unahur.obj2.peluqueria.servicios.CorteDeCabello;

public class PrecioNegativoTest {
    @Test 
    public void dadoUnPrecioBaseNegativo_alInstanciarElServicio_lanzaException(){
        assertThrows(PrecioNegativoException.class, () -> {new CorteDeCabello(-1000.0, 5);});
    }
}
