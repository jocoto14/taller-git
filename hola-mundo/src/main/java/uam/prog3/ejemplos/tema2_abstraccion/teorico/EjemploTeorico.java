package uam.prog3.ejemplos.tema2_abstraccion.teorico;

public class EjemploTeorico {
    public static void main(String[] args) {
        Figura circulo = new Circulo("rojo", 5);
        Figura rectangulo = new Rectangulo("azul", 4, 6);

        circulo.describir();
        rectangulo.describir();

        double areaCirculo = circulo.calcularArea();
        double areaRectangulo = rectangulo.calcularArea();

        // new Figura("verde"); // no compila: una clase abstracta no se puede instanciar
    }
}
