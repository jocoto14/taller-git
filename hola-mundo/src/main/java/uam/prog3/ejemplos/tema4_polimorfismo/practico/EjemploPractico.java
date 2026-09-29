package uam.prog3.ejemplos.tema4_polimorfismo.practico;

import java.util.List;

public class EjemploPractico {
    public static void main(String[] args) {
        List<MetodoPago> carritoDePagos = List.of(
            new TarjetaCredito(15000),
            new Efectivo(5000),
            new TransferenciaBancaria(32000)
        );

        double total = 0;
        for (MetodoPago pago : carritoDePagos) {
            pago.procesar();
            total += pago.monto;
        }

        System.out.println("Total procesado: " + total);

        // Un sistema de cobro real (POS, pasarela de pagos) hace exactamente esto:
        // recorre distintos métodos de pago sin un if/else por cada tipo concreto.
    }
}
