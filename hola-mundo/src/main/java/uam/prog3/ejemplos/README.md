# Ejemplos de POO — Programación III

Cada tema tiene dos ejemplos independientes, cada uno con su propio `main`:
un **ejemplo teórico** (la analogía clásica de libro) y un **ejemplo práctico**
(una situación que se enfrenta programando de verdad). La excepción es el tema 8
(Visibilidad), que solo tiene ejemplo teórico porque su caso práctico es el mismo
del tema 1.

| Tema | Versión | Clase para ejecutar | Idea central |
|---|---|---|---|
| **Encapsulamiento** | Teórico | `tema1_encapsulamiento.teorico.EjemploTeorico` | El `saldo` de `CuentaBancaria` es `private`; solo se puede cambiar a través de `depositar()`/`retirar()`, que validan antes de tocar el estado. Desde otra clase nadie puede dejarlo negativo asignándolo directo (`cuenta.saldo = -5000` no compila). |
| **Encapsulamiento** | Práctico | `tema1_encapsulamiento.practico.Termostato` | `setTemperatura()` nunca deja que el valor interno salga de un rango válido, aunque quien llame le pase un número fuera de rango (ej. un sensor con ruido, o un usuario mal intencionado). |
| **Abstracción** | Teórico | `tema2_abstraccion.teorico.EjemploTeorico` | `Figura` es abstracta y declara `calcularArea()` sin decir cómo; `Circulo` y `Rectangulo` implementan el cómo. El código que llama a `describir()` no necesita saber la fórmula de cada figura. |
| **Abstracción** | Práctico | `tema2_abstraccion.practico.EjemploPractico` | `MetodoPago` expone solo `pagar()`; el código que cobra no sabe (ni le importa) si por dentro se verifica una tarjeta o se redirige a PayPal. Eso es esconder el detalle de implementación. |
| **Herencia** | Teórico | `tema3_herencia.teorico.EjemploTeorico` | `Gerente extends Empleado`: reutiliza `nombre` y `salarioBase` sin copiarlos, y solo agrega lo que le falta (`bono`). Cumple la prueba "un Gerente **es un** Empleado". |
| **Herencia** | Práctico | `tema3_herencia.practico.EjemploPractico` | `EmailNotificacion` y `SmsNotificacion` heredan de `Notificacion`. Si mañana se agrega `PushNotificacion`, ningún código existente cambia: solo se extiende. |
| **Polimorfismo** | Teórico | `tema4_polimorfismo.teorico.EjemploTeorico` | Un `Figura[]` mezcla `Circulo`, `Rectangulo` y `Triangulo`. El `for` llama `calcularArea()` sin preguntar el tipo concreto; Java resuelve cuál versión ejecutar en tiempo de ejecución. |
| **Polimorfismo** | Práctico | `tema4_polimorfismo.practico.EjemploPractico` | Una `List<MetodoPago>` con tarjeta, efectivo y transferencia se procesa con un solo `for`, sin un `if/else` por cada tipo. Así funciona una pasarela de pagos real. |
| **Parámetros (valor/referencia)** | Teórico | `tema5_parametros.teorico.ParametrosValorReferencia` | Java siempre copia. Con un `int` copia el **valor** (el original no cambia); con un objeto (`Mascota`) copia la **referencia** (el original sí se modifica si se toca su contenido). |
| **Parámetros (valor/referencia)** | Práctico | `tema5_parametros.practico.CarritoDeCompras` | El bug más común: `carrito = new ArrayList<>()` dentro de un método solo reemplaza la copia local de la referencia, el carrito original sigue intacto. `carrito.clear()` sí lo vacía de verdad. |
| **Sobrecarga (overloading)** | Teórico | `tema6_sobrecarga.teorico.Calculadora` | Tres métodos `sumar()` con distinta lista de parámetros (`int,int` / `double,double` / `int,int,int`). Java elige cuál llamar según los argumentos, en tiempo de compilación. |
| **Sobrecarga (overloading)** | Práctico | `tema6_sobrecarga.practico.ImpresoraDeRecibos` | `imprimir()` tiene tres formas (encabezado, línea de producto con precio, lista de líneas) porque un recibo real necesita formatear distintos tipos de contenido sin inventar tres nombres distintos. |
| **Sobreescritura (overriding)** | Teórico | `tema7_sobreescritura.teorico.EjemploTeorico` | `Perro` y `Gato` redefinen `hacerSonido()` de `Animal` con `@Override`. Aunque las variables son de tipo `Animal`, Java ejecuta la versión de la subclase real. |
| **Sobreescritura (overriding)** | Práctico | `tema7_sobreescritura.practico.EjemploPractico` | `Guerrero` y `Mago` redefinen `atacar()` de `PersonajeJuego`, cada uno con su propia lógica de combate. El motor del juego solo conoce `PersonajeJuego`, nunca pregunta el tipo concreto. |
| **Visibilidad** | Teórico | `tema8_visibilidad.teorico.Visibilidad`, `MismoPaquete`, `otropaquete.Subclase` y `otropaquete.ClaseExterna` | Los cuatro niveles (`private`, paquete, `protected`, `public`) en atributos y métodos, vistos desde la misma clase, el mismo paquete, una subclase de otro paquete y una clase externa. `private` es por **clase**, no por objeto: por eso un `main` dentro de `CuentaBancaria` sí puede hacer `cuenta.saldo = -5000`. |

## Cómo ejecutar un ejemplo

```bash
mvn compile
java -cp target/classes uam.prog3.ejemplos.<paquete-completo-de-la-clase>
```

O desde el IDE: clic derecho sobre el archivo → **Run**, ya que cada clase de la tabla tiene su propio `main`.
