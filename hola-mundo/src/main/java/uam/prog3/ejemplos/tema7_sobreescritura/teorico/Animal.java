package uam.prog3.ejemplos.tema7_sobreescritura.teorico;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico");
    }
}
