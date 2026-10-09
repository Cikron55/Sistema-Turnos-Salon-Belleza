package ar.edu.unahur.obj2.peluqueria.categorias;

public class CategoriaFrecuente implements CategoriaCliente{
    @Override
    public Double aplicarDescuento(Double subtotal){
        return subtotal * 0.90;
    }
}
