package uam.prog3.ejemplos.tema4_polimorfismo.teorico;

public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
}
