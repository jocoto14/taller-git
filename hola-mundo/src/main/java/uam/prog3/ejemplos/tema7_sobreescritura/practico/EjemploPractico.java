package uam.prog3.ejemplos.tema7_sobreescritura.practico;

public class EjemploPractico {
    public static void main(String[] args) {
        PersonajeJuego[] equipo = {
            new Guerrero("Thorin", 120),
            new Mago("Elandra", 80),
        };

        for (PersonajeJuego personaje : equipo) {
            personaje.atacar();
        }

        // Situación típica en desarrollo de videojuegos: cada clase de personaje
        // redefine atacar() con su propia lógica, y el motor del juego solo llama al método base.
    }
}
