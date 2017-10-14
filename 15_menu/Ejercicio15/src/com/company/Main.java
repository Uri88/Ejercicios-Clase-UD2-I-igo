package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        double r1 = 0;
        int r2 = 0;
        //Las variable r2 esta hecha para convertir la variable r1 en un valor entero en las operaciones que no requieran decimales
        char c = ' ';
        int a = 0;
        int b = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Introduce un numero: ");
            a = Integer.parseInt(br.readLine());

            System.out.println("Introduce otro numero: ");
            b = Integer.parseInt(br.readLine());

            System.out.println("MENÚ\n" +
                    "----\n" +
                    "a) Suma.\n" +
                    "b) Resta.\n" +
                    "c) Multiplicación.\n" +
                    "d) División.\n" +
                    "e) Resto.\n" +
                    "f) Terminar.\n" +
                    "\n" +
                    "Introduzca una opción:");

            c = br.readLine().toLowerCase().charAt(0);

            switch (c) {

                case 'a':
                    r1 = a + b;
                    r2 = (int) r1;
                    System.out.println("El resultado de sumar: " + a + " y " + b + " es: " + r2);
                    break;
                case 'b':
                    r1 = a - b;
                    r2 = (int) r1;
                    System.out.println("El resultado de restar: " + a + " y " + b + " es: " + r2);
                    break;

                case 'c':
                    r1 = a * b;
                    r2 = (int) r1;
                    System.out.println("El resultado de multiplicar: " + a + " y " + b + " es: " + r2);
                    break;

                case 'd':
                    r1 = (float) a / (float) b;
                    System.out.println("El resultado de dividir: " + a + " y " + b + " es: " + r1);
                    break;

                case 'e':
                    r1 = a % b;
                    r2 = (int) r1;
                    System.out.println("El resultado del resto de: " + a + " y " + b + " es: " + r2);
                    break;

                case 'f':
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("ERROR. No has introducido ninguna opcion valida");
            }

        } while (c != 'f');
    }
}
