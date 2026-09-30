package uam.prog3.ejemplos.tema8_visibilidad.teorico;

/*
 * Quién puede acceder (atributos y métodos siguen las mismas reglas):
 *
 *                   | misma clase | mismo paquete | subclase (otro paquete) | cualquier otra clase
 *  private          |     sí      |      no       |           no            |         no
 *  (sin modificador)|     sí      |      sí       |           no            |         no
 *  protected        |     sí      |      sí       |           sí            |         no
 *  public           |     sí      |      sí       |           sí            |         sí
 */
public class Visibilidad {
    private String atributoPrivado = "privado";
    String atributoPaquete = "paquete";
    protected String atributoProtegido = "protegido";
    public String atributoPublico = "público";

    private void metodoPrivado() {
        System.out.println("metodoPrivado()");
    }

    void metodoPaquete() {
        System.out.println("metodoPaquete()");
    }

    protected void metodoProtegido() {
        System.out.println("metodoProtegido()");
    }

    public void metodoPublico() {
        System.out.println("metodoPublico()");
    }

    public static void main(String[] args) {
        Visibilidad esta = new Visibilidad();
        Visibilidad otra = new Visibilidad();

        // Dentro de la propia clase se ve todo, incluso lo private.
        System.out.println(esta.atributoPrivado + ", " + esta.atributoPaquete + ", "
                + esta.atributoProtegido + ", " + esta.atributoPublico);
        esta.metodoPrivado();
        esta.metodoPaquete();
        esta.metodoProtegido();
        esta.metodoPublico();

        // private es por CLASE, no por objeto: aquí se accede al private de OTRA instancia.
        // Por eso "cuenta.saldo = -5000" compila si el main está dentro de CuentaBancaria.
        otra.atributoPrivado = "modificado desde el main de la misma clase";
        System.out.println(otra.atributoPrivado);
        otra.metodoPrivado();
    }
}
