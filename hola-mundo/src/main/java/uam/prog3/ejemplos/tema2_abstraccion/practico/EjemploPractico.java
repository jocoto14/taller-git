package uam.prog3.ejemplos.tema2_abstraccion.practico;

public class EjemploPractico {
    public static void main(String[] args) {
        MetodoPago pagoConTarjeta = new TarjetaCredito(4500, "4111111111111234");
        MetodoPago pagoConPaypal = new PayPalPago(2000, "cliente@correo.com");

        pagoConTarjeta.pagar();
        pagoConPaypal.pagar();

        // El código que llama a pagar() no necesita saber cómo procesa cada método el pago:
        // esa es la esencia de la abstracción, expone lo esencial y esconde el detalle.
    }
}
