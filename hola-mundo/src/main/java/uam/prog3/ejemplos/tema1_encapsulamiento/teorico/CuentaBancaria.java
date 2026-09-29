package uam.prog3.ejemplos.tema1_encapsulamiento.teorico;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
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

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        cuenta.depositar(500);
        System.out.println("Saldo tras depositar 500: " + cuenta.getSaldo());

        cuenta.retirar(2000);
        System.out.println("Saldo tras intentar retirar 2000: " + cuenta.getSaldo());

        cuenta.retirar(300);
        System.out.println("Saldo tras retirar 300: " + cuenta.getSaldo());

        // cuenta.saldo = -5000; // no compila: el atributo es private, esa es la idea del encapsulamiento
    }
}
