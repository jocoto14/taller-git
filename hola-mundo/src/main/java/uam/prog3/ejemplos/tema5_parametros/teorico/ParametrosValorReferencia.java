package uam.prog3.ejemplos.tema5_parametros.teorico;

public class ParametrosValorReferencia {

    public static void intentarDuplicar(int numero) {
        numero = numero * 2; // solo cambia la copia local
    }

    public static void festejarCumpleanos(Mascota mascota) {
        mascota.cumplirAnios(); // modifica el objeto apuntado
    }

    public static void main(String[] args) {
        int edad = 5;
        intentarDuplicar(edad);
        System.out.println("Edad tras intentarDuplicar: " + edad);

        Mascota firulais = new Mascota("Firulais", 5);
        System.out.println(firulais.getEdad());
        festejarCumpleanos(firulais);
        System.out.println(firulais.getNombre() + " ahora tiene " + firulais.getEdad() + " años");

        // Java siempre copia. Con un int copia el valor; con un objeto copia la referencia.
    }
}
