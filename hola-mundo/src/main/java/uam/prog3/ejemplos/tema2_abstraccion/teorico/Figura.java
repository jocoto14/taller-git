package uam.prog3.ejemplos.tema2_abstraccion.teorico;

public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularArea();

    public void describir() {
        System.out.println("Figura " + color + " de área " + calcularArea());
    }
}
