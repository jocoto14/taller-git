package uam.prog3.ejemplos.tema7_sobreescritura.teorico;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}
