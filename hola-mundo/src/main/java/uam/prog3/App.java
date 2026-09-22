package uam.prog3;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
        Persona[] personas = new Persona[10];
        personas[0] = new Estudiante("Alice", "123", "Ingeniería");
        personas[1] = new Colaborador("Bob", "456", "Rector");
        personas[2] = new Estudiante("Charlie", "789", "Medicina");
        personas[3] = new Colaborador("David", "012", "Guarda");
        personas[4] = new Estudiante("Eve", "345", "Arquitectura");
        personas[5] = new Estudiante("Alicia", "123", "Ingeniería");
        personas[6] = new Colaborador("Roberto", "456", "Rector");
        personas[7] = new Estudiante("Carlos", "789", "Medicina");
        personas[8] = new Colaborador("Ricardo", "012", "Guarda");
        personas[9] = new Estudiante("Katherine", "345", "Arquitectura");



        Estudiante estudiante1 = (Estudiante) personas[0];
        System.out.println(estudiante1.describirRol());

        for (Persona persona : personas){
            System.out.println(persona.getNombre() + " con el numero de cedula " + persona.getCedula() + " y " + persona.describirRol());
        }

        for (Persona persona : personas) {
            if (persona instanceof Evaluable) {
                System.out.println(((Evaluable) persona).getEvaluacion());
            }
        }

    }
}
