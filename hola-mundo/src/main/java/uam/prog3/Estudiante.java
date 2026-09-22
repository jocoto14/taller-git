package uam.prog3;

public class Estudiante extends Persona implements Evaluable {
    private String carrera;

    public Estudiante(String nombre, String cedula, String carrera) {
        super(nombre, cedula);
        this.carrera = carrera;
    }

    @Override
    public String describirRol() {
        return "Soy un estudiante de la carrera de " + this.carrera + ".";
    }

    @Override
    public String getEvaluacion() {
        return "El estudiante " + this.getNombre() + " ha sido evaluado.";
    }
}
