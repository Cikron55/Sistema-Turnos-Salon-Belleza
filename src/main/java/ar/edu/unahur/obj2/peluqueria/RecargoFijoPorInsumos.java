package ar.edu.unahur.obj2.peluqueria;

public class RecargoFijoPorInsumos {
    private static final RecargoFijoPorInsumos INSTANCIA = new RecargoFijoPorInsumos();
    private Double valor;

    private RecargoFijoPorInsumos(){
        this.valor = 500.0;
    }

    public static RecargoFijoPorInsumos getInstancia(){
        return INSTANCIA;
    }

    public Double getValor(){
        return valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }
}
