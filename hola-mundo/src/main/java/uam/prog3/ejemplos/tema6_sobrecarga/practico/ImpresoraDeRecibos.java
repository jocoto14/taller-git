package uam.prog3.ejemplos.tema6_sobrecarga.practico;

import java.util.List;

public class ImpresoraDeRecibos {

    public void imprimir(String encabezado) {
        System.out.println("=== " + encabezado + " ===");
    }

    public void imprimir(String producto, double precio) {
        System.out.println(producto + " ..... $" + precio);
    }

    public void imprimir(List<String> lineas) {
        for (String linea : lineas) {
            System.out.println(linea);
        }
    }

    public static void main(String[] args) {
        ImpresoraDeRecibos impresora = new ImpresoraDeRecibos();

        impresora.imprimir("Recibo de compra");
        impresora.imprimir("Teclado", 15000);
        impresora.imprimir("Mouse", 6000);
        impresora.imprimir(List.of("Gracias por su compra", "Vuelva pronto"));

        // Una impresora de recibos real necesita formatear distintos tipos de línea:
        // sobrecargar imprimir() evita inventar tres nombres distintos para lo mismo.
    }
}
