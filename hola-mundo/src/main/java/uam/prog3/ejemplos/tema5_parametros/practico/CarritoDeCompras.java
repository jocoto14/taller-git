package uam.prog3.ejemplos.tema5_parametros.practico;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {

    public static void vaciarCarritoMalHecho(List<Producto> carrito) {
        carrito = new ArrayList<>(); // BUG: solo reasigna la copia local de la referencia
    }

    public static void vaciarCarritoBienHecho(List<Producto> carrito) {
        carrito.clear(); // esto sí modifica el contenido del carrito original
    }

    public static void main(String[] args) {
        List<Producto> carrito = new ArrayList<>();
        carrito.add(new Producto("Teclado", 15000));
        carrito.add(new Producto("Mouse", 6000));

        vaciarCarritoMalHecho(carrito);
        System.out.println("Después de vaciarCarritoMalHecho, tamaño: " + carrito.size()); // sigue en 2

        vaciarCarritoBienHecho(carrito);
        System.out.println("Después de vaciarCarritoBienHecho, tamaño: " + carrito.size()); // 0

        // Este es el bug real más común: reasignar la referencia dentro de un método
        // (carrito = new ArrayList<>()) nunca se ve reflejado afuera. Hay que mutar el contenido.
    }
}
