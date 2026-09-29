package uam.prog3.ejemplos.tema2_abstraccion.practico;

public class TarjetaCredito extends MetodoPago {
    private String numeroTarjeta;

    public TarjetaCredito(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean procesarPago() {
        String ultimosCuatro = numeroTarjeta.substring(numeroTarjeta.length() - 4);
        System.out.println("Verificando fondos de la tarjeta terminada en " + ultimosCuatro);
        return true;
    }
}
