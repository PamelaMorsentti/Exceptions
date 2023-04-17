package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x; //Variable numerica
        System.out.println("Dane un valor numerico:");
        try {
            x = scanner.nextInt(); //obtener un numero del teclado
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("No me diste un valor numerico: "+ e);
        } finally {
            System.out.println("Proceso terminado");

        }


        //x = scanner.nextInt(); //obtener un numero del teclado
        //System.out.println(x);
    }
}