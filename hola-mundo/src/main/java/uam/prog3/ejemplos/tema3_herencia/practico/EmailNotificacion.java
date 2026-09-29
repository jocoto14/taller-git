package uam.prog3.ejemplos.tema3_herencia.practico;

public class EmailNotificacion extends Notificacion {
    public EmailNotificacion(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
    }
}
