package uam.prog3.ejemplos.tema8_visibilidad.teorico;

public class MismoPaquete {
    public static void main(String[] args) {
        Visibilidad v = new Visibilidad();

        // Mismo paquete: se ve todo menos lo private.
        System.out.println(v.atributoPaquete + ", " + v.atributoProtegido + ", " + v.atributoPublico);
        v.metodoPaquete();
        v.metodoProtegido();
        v.metodoPublico();

        // System.out.println(v.atributoPrivado); // no compila: private solo se ve dentro de Visibilidad
        // v.metodoPrivado(); // no compila: private solo se ve dentro de Visibilidad
    }
}
