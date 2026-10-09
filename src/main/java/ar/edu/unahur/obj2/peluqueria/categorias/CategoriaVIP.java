package ar.edu.unahur.obj2.peluqueria.categorias;

public class CategoriaVIP implements CategoriaCliente{
    @Override
    public Double aplicarDescuento (Double subtotal){
        return subtotal * 0.80;
    }
}
