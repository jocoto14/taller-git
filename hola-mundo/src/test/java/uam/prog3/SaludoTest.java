package uam.prog3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SaludoTest {

    @Test
    public void saludaConElNombreRecibido() {
        assertEquals("Hola, Alice. Bienvenido a Programación III.", Saludo.personalizado("Alice"));
    }
}
