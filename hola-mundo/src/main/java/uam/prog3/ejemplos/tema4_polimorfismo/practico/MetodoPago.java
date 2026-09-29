package uam.prog3.ejemplos.tema4_polimorfismo.practico;

public abstract class MetodoPago {
    protected double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    public abstract void procesar();
}
