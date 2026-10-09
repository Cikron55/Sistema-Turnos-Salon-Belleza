package ar.edu.unahur.obj2.peluqueria.categorias;

public class CategoriaOcasional implements CategoriaCliente{
    @Override
    public Double aplicarDescuento(Double subtotal){
        return subtotal;
    }
}
