package uam.prog3.ejemplos.tema3_herencia.practico;

public class SmsNotificacion extends Notificacion {
    public SmsNotificacion(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }
}
