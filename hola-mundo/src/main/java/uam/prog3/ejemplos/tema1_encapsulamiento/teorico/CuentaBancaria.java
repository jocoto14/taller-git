package uam.prog3.ejemplos.tema1_encapsulamiento.teorico;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial < 0) {
            System.out.println("El saldo inicial no puede ser negativo, se inicia en 0");
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser positivo");
            return;
        }
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser positivo");
            return;
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes");
            return;
        }
        saldo -= monto;
    }
}
