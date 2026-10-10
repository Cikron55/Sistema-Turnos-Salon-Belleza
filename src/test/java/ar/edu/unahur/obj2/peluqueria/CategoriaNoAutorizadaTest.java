package ar.edu.unahur.obj2.peluqueria;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.peluqueria.categorias.CategoriaOcasional;
import ar.edu.unahur.obj2.peluqueria.categorias.CategoriaVIP;
import ar.edu.unahur.obj2.peluqueria.salonDeBellezaExcepciones.CategoriaNoAutorizadosException;

public class CategoriaNoAutorizadaTest {
    
    @Test
    public void dadoUnClienteSinTurnos_alIntentarAsignarVIP_lanzaExcepcion(){
        Cliente cliente = new Cliente("Leandro", new CategoriaOcasional());

        assertThrows(CategoriaNoAutorizadosException.class, () -> {cliente.cambiarCategoria(new CategoriaVIP());});
    }
}
