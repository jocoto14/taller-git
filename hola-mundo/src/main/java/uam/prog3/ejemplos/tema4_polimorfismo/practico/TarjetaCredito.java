package uam.prog3.ejemplos.tema4_polimorfismo.practico;

public class TarjetaCredito extends MetodoPago {
    public TarjetaCredito(double monto) {
        super(monto);
    }

    @Override
    public void procesar() {
        System.out.println("Cobrando " + monto + " a la tarjeta de crédito");
    }
}
