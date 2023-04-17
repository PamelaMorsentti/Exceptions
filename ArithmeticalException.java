package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticalException {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        /*System.out.println("Ingrese un numero: ");
        float num1 = entrada.nextFloat();
        System.out.println("Ingrese otro numero: ");
        float num2 = entrada.nextFloat();*/

        float resultado = 0;
        try {
            System.out.println("Ingrese un numero: ");
            float num1 = entrada.nextFloat();
            System.out.println("Ingrese otro numero: ");
            float num2 = entrada.nextFloat();

            /* La ubicación de las líneas de System.out.println y la declaración de num1 y num2 puede afectar
            la forma en que se manejan las excepciones en el programa.
            Si estas líneas estaban fuera del try, cualquier excepción que se produzca antes de entrar en el try
            (por ejemplo, una excepción de entrada/salida si la entrada del usuario falla) no será manejada por el try-catch
            y provocará que el programa se detenga abruptamente.
            En cambio, si estas líneas se colocan dentro del try, cualquier excepción que se produzca durante la entrada de datos
            (como una excepción de entrada/salida o una excepción de tipo) se capturará en el catch correspondiente y se manejará adecuadamente.
            En resumen, es importante colocar cualquier código que pueda generar una excepción dentro del try para asegurarse de que cualquier
            excepción se maneje adecuadamente. */

            // Verificar si el primer número es cero
            if (num1 == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }
            resultado = num1 / num2;
            System.out.println("Resultado : " + resultado);

            // las excepciones van de la mas especifica a la mas general
        } catch (InputMismatchException e) {
            System.out.println("Datos ingresados incorrectos");
        } catch (Exception e) {
            System.out.println("No se puede dividir byZero");
        } finally {
            System.out.println("Ejecutado");
        }
    }
}
