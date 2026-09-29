package uam.prog3.ejemplos.tema5_parametros.teorico;

public class Mascota {
    private String nombre;
    private int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void cumplirAnios() {
        this.edad++;
    }
}
