package ar.edu.unahur.obj2.peluqueria;

public class Salon {
    private static int totalTurnosConfirmados = 0;

    public static void registrarTurnoConfirmado() {
        totalTurnosConfirmados++;
    }

    public static int getTotalTurnosConfirmados(){
        return totalTurnosConfirmados;
    }
}
