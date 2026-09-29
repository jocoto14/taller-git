package uam.prog3.ejemplos.tema7_sobreescritura.practico;

public class Mago extends PersonajeJuego {
    public Mago(String nombre, int puntosDeVida) {
        super(nombre, puntosDeVida);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza una bola de fuego (daño medio, largo alcance)");
    }
}
