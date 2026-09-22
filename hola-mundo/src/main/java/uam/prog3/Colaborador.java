package uam.prog3;

public class Colaborador extends Persona {
    private String puesto;


    public Colaborador(String nombre, String cedula, String puesto) {
        super(nombre, cedula);
        this.puesto = puesto;
    }


    @Override 
    public String describirRol() {
        return "Soy un colaborador con el puesto de " + this.puesto + ".";
    }
}
