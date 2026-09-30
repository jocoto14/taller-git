package uam.prog3.ejemplos.tema8_visibilidad.teorico.otropaquete;

import uam.prog3.ejemplos.tema8_visibilidad.teorico.Visibilidad;

public class ClaseExterna {
    public static void main(String[] args) {
        Visibilidad v = new Visibilidad();

        // Otro paquete y sin herencia: solo se ve lo public.
        System.out.println(v.atributoPublico);
        v.metodoPublico();

        // System.out.println(v.atributoProtegido); // no compila: protected exige ser subclase o estar en el mismo paquete
        // v.metodoProtegido(); // no compila: protected exige ser subclase o estar en el mismo paquete
        // System.out.println(v.atributoPaquete); // no compila: acceso de paquete, esta clase está en otro paquete
        // v.metodoPaquete(); // no compila: acceso de paquete, esta clase está en otro paquete
        // System.out.println(v.atributoPrivado); // no compila: private solo se ve dentro de Visibilidad
        // v.metodoPrivado(); // no compila: private solo se ve dentro de Visibilidad
    }
}
