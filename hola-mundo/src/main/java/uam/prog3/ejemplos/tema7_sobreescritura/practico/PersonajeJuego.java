package uam.prog3.ejemplos.tema7_sobreescritura.practico;

public class PersonajeJuego {
    protected String nombre;
    protected int puntosDeVida;

    public PersonajeJuego(String nombre, int puntosDeVida) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
    }

    public void atacar() {
        System.out.println(nombre + " ataca con un golpe básico");
    }
}
