package uam.prog3.ejemplos.tema7_sobreescritura.practico;

public class Guerrero extends PersonajeJuego {
    public Guerrero(String nombre, int puntosDeVida) {
        super(nombre, puntosDeVida);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con su espada (daño alto, corto alcance)");
    }
}
