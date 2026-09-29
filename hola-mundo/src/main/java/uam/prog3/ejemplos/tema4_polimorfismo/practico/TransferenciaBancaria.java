package uam.prog3.ejemplos.tema4_polimorfismo.practico;

public class TransferenciaBancaria extends MetodoPago {
    public TransferenciaBancaria(double monto) {
        super(monto);
    }

    @Override
    public void procesar() {
        System.out.println("Procesando transferencia bancaria de " + monto);
    }
}
