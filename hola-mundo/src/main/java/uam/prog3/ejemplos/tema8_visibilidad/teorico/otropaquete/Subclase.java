package uam.prog3.ejemplos.tema8_visibilidad.teorico.otropaquete;

import uam.prog3.ejemplos.tema8_visibilidad.teorico.Visibilidad;

public class Subclase extends Visibilidad {

    public void probar() {
        // Subclase en otro paquete: ve public y protected (a través de this).
        System.out.println(this.atributoProtegido + ", " + this.atributoPublico);
        this.metodoProtegido();
        this.metodoPublico();

        // System.out.println(this.atributoPaquete); // no compila: acceso de paquete, esta clase está en otro paquete
        // this.metodoPaquete(); // no compila: acceso de paquete, esta clase está en otro paquete
        // System.out.println(this.atributoPrivado); // no compila: private no se hereda como accesible
        // this.metodoPrivado(); // no compila: private no se hereda como accesible

        // protected solo se ve a través de this (o de otra Subclase), no de un Visibilidad cualquiera.
        Visibilidad otro = new Visibilidad();
        System.out.println(otro.atributoPublico);
        // System.out.println(otro.atributoProtegido); // no compila: otro es un Visibilidad, no una Subclase
        // otro.metodoProtegido(); // no compila: otro es un Visibilidad, no una Subclase
    }

    public static void main(String[] args) {
        new Subclase().probar();
    }
}
