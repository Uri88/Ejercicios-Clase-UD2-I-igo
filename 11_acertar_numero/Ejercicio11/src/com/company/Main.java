package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        Random r = new Random();
        int aleatorio = r.nextInt(100);

        int intentos = 0;
        int a = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        do {

            System.out.println(+aleatorio);
            System.out.println("Introduce un numero entre el 0 y 100: ");
            a = Integer.parseInt(br.readLine());

            if (a==aleatorio){

                System.out.println("Enhorabuena, has acertado. El numero de intentos ha sido de: " + intentos);

            }else {
                if (a > aleatorio) {
                    System.out.println("El numero es mas pequeño");

                } else {

                    System.out.println("El numero es mas grande");

                }
                intentos++;
            }



        } while (a != aleatorio);


    }
}
