package uam.prog3.ejemplos.tema4_polimorfismo.teorico;

public class EjemploTeorico {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo("rojo", 5),
            new Rectangulo("azul", 4, 6),
            new Triangulo("verde", 3, 8),
        };

        for (Figura figura : figuras) {
            System.out.println(figura.color + ": " + figura.calcularArea());
        }

        // El ciclo no sabe qué figura concreta tiene: cada una responde calcularArea() a su manera.
        // Se podría agregar Pentagono mañana sin tocar una línea de este ciclo.
    }
}
