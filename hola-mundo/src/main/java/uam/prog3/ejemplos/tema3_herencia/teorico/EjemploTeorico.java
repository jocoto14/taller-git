package uam.prog3.ejemplos.tema3_herencia.teorico;

public class EjemploTeorico {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Ana", 800000);
        Gerente gerente = new Gerente("Beto", 900000, 300000);

        System.out.println(empleado.getNombre() + " gana " + empleado.calcularSalario());
        System.out.println(gerente.getNombre() + " gana " + gerente.calcularSalario());

        // Gerente "es un" Empleado: reutiliza nombre y salarioBase, y solo agrega el bono.
    }
}
