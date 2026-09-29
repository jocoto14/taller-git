package uam.prog3.ejemplos.tema2_abstraccion.practico;

public class PayPalPago extends MetodoPago {
    private String correo;

    public PayPalPago(double monto, String correo) {
        super(monto);
        this.correo = correo;
    }

    @Override
    public boolean procesarPago() {
        System.out.println("Redirigiendo a PayPal para la cuenta " + correo);
        return true;
    }
}
