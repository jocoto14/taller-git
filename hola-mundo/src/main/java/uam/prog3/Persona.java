package uam.prog3;

public abstract class Persona {
    private String nombre;
    private String cedula;


    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getCedula(){
        return this.cedula;
    }

    public abstract String describirRol();
}
