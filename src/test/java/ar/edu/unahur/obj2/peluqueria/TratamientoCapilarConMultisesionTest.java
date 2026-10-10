package ar.edu.unahur.obj2.peluqueria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.peluqueria.categorias.CategoriaOcasional;
import ar.edu.unahur.obj2.peluqueria.servicios.TratamientoCapilar;

public class TratamientoCapilarConMultisesionTest {
    @Test 
    public void dadoUnTratamientoCpilarConMultiplesSesiones_calcularElImporteYRestaCupones(){
        Cliente cliente = new Cliente("Briana", new CategoriaOcasional());
        TratamientoCapilar tratamiento = new TratamientoCapilar(4_500.0, 10);

        Turno turno = new Turno(cliente, tratamiento, 3);

        assertTrue(turno.getComprobante().startsWith("TRN-TRA-"));
        assertEquals(14_000.0, turno.getImporteTotal(), 0.01);
        assertEquals(7, tratamiento.getCuposDisponibles());
    }
}
