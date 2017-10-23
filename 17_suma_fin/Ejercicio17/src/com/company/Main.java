package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        String respuesta;

        do {

            System.out.println("Introduce un numero o 'Fin' para terminar");
            respuesta = br.readLine().toLowerCase();


            if (!respuesta.equals("fin")) {
                int n = Integer.parseInt(respuesta);
                sum = sum + n;

                if (n > max) {

                    max = n;

                }
                if (n < min) {

                    min = n;
                }
            }

        } while (!respuesta.equals("fin"));
        System.out.println("El valor de la suma es: " + sum);
        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
    }
}
