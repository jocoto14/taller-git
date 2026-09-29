package uam.prog3.ejemplos.tema3_herencia.practico;

public class EjemploPractico {
    public static void main(String[] args) {
        Notificacion correo = new EmailNotificacion("ana@correo.com", "Tu pedido fue enviado");
        Notificacion sms = new SmsNotificacion("8888-8888", "Tu código es 4521");

        correo.enviar();
        sms.enviar();

        // Situación real: un sistema de notificaciones agrega canales nuevos (push, WhatsApp...)
        // heredando de Notificacion, sin tocar el código que ya envía correos o SMS.
    }
}
