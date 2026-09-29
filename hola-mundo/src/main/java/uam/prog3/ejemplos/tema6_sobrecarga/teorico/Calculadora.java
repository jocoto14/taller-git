package uam.prog3.ejemplos.tema6_sobrecarga.teorico;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.sumar(2, 3));
        System.out.println(calculadora.sumar(2.5, 3.1));
        System.out.println(calculadora.sumar(1, 2, 3));

        // Java elige cuál sumar() llamar según los argumentos, en tiempo de compilación.
    }
}
