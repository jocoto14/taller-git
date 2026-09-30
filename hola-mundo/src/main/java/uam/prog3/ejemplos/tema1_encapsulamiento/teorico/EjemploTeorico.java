package uam.prog3.ejemplos.tema1_encapsulamiento.teorico;

public class EjemploTeorico {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        cuenta.depositar(500);
        System.out.println("Saldo tras depositar 500: " + cuenta.getSaldo());

        cuenta.retirar(2000);
        System.out.println("Saldo tras intentar retirar 2000: " + cuenta.getSaldo());

        cuenta.retirar(300);
        System.out.println("Saldo tras retirar 300: " + cuenta.getSaldo());

        // cuenta.saldo = -5000; // no compila: saldo es private y esta clase es distinta de CuentaBancaria
    }
}
