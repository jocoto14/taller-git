package uam.prog3.ejemplos.tema7_sobreescritura.teorico;

public class EjemploTeorico {
    public static void main(String[] args) {
        Animal animal = new Animal("Un animal cualquiera");
        Animal perro = new Perro("Rex");
        Animal gato = new Gato("Michi");

        animal.hacerSonido();
        perro.hacerSonido();
        gato.hacerSonido();

        // Aunque las tres variables son de tipo Animal, Java ejecuta la versión
        // redefinida (@Override) de cada subclase: eso es redefinición en tiempo de ejecución.
    }
}
