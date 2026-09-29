package uam.prog3.ejemplos.tema2_abstraccion.practico;

public abstract class MetodoPago {
    protected double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    public abstract boolean procesarPago();

    public void pagar() {
        if (procesarPago()) {
            System.out.println("Pago de " + monto + " procesado correctamente");
        } else {
            System.out.println("El pago de " + monto + " fue rechazado");
        }
    }
}
