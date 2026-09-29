package uam.prog3.ejemplos.tema4_polimorfismo.practico;

public class Efectivo extends MetodoPago {
    public Efectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesar() {
        System.out.println("Recibiendo " + monto + " en efectivo");
    }
}
