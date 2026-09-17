"""
@author Johnny Coto

Calculadora de consola, a propósito incompleta.

Sirve como proyecto de utilería para el taller de Git de la clase 3: la suma
ya funciona, el resto de operaciones se completa en vivo durante la demo
(ver demo-git-taller.md), una por rama.
"""


def sumar(a, b):
    return a + b


def restar(a, b):
    return a - b


def multiplicar(a, b):
    return a * b


def dividir(a, b):
    if b == 0:
        raise ZeroDivisionError("No se puede dividir entre cero.")
    return a / b


def pedir_numero(mensaje):
    while True:
        texto = input(mensaje)
        try:
            return float(texto)
        except ValueError:
            print("Ingresa un número válido.")


def menu():
    print("\nCalculadora")
    print("  1. Sumar")
    print("  2. Restar")
    print("  3. Multiplicar")
    print("  4. Dividir")
    print("  5. Salir")
    return input("Elige una opción: ")


def main():
    while True:
        opcion = menu()

        if opcion == "5":
            print("Hasta luego.")
            break

        if opcion not in ("1", "2", "3", "4"):
            print("Opción inválida.")
            continue

        a = pedir_numero("Primer número: ")
        b = pedir_numero("Segundo número: ")

        try:
            if opcion == "1":
                print(f"Resultado: {sumar(a, b)}")
            elif opcion == "2":
                print(f"Resultado: {restar(a, b)}")
            elif opcion == "3":
                print(f"Resultado: {multiplicar(a, b)}")
            elif opcion == "4":
                print(f"Resultado: {dividir(a, b)}")
        except NotImplementedError as error:
            print(f"Esa operación aún no está implementada: {error}")
        except ZeroDivisionError:
            print("No se puede dividir entre cero.")


if __name__ == "__main__":
    main()
