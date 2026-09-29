package uam.prog3.ejemplos.tema1_encapsulamiento.practico;

public class Termostato {
    private static final double TEMPERATURA_MINIMA = 16.0;
    private static final double TEMPERATURA_MAXIMA = 30.0;
    private double temperaturaActual;

    public Termostato(double temperaturaInicial) {
        this.temperaturaActual = ajustarDentroDeRango(temperaturaInicial);
    }

    public double getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperatura(double nuevaTemperatura) {
        this.temperaturaActual = ajustarDentroDeRango(nuevaTemperatura);
    }

    private double ajustarDentroDeRango(double temperatura) {
        if (temperatura < TEMPERATURA_MINIMA) {
            System.out.println("Temperatura " + temperatura + " fuera de rango, se ajusta al mínimo permitido");
            return TEMPERATURA_MINIMA;
        }
        if (temperatura > TEMPERATURA_MAXIMA) {
            System.out.println("Temperatura " + temperatura + " fuera de rango, se ajusta al máximo permitido");
            return TEMPERATURA_MAXIMA;
        }
        return temperatura;
    }

    public static void main(String[] args) {
        Termostato termostato = new Termostato(22);
        System.out.println("Temperatura inicial: " + termostato.getTemperaturaActual());

        termostato.setTemperatura(45); // un sensor con ruido intenta pasarse del rango
        System.out.println("Temperatura tras intentar poner 45: " + termostato.getTemperaturaActual());

        termostato.setTemperatura(-5);
        System.out.println("Temperatura tras intentar poner -5: " + termostato.getTemperaturaActual());
    }
}
