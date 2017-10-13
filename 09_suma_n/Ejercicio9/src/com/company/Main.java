package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int b = 0;
        int suma = 0;

        System.out.println("Introduce una cantidad de valores a sumar: ");
        int a = Integer.parseInt(br.readLine());

        if (a>0){

            for (int i = 0; i < a; i++) {
                System.out.println("Introduce un valor: ");
                b = Integer.parseInt(br.readLine());
                suma = suma + b;
        }

        }else {

            System.out.println("Error, la cantidad de valores a sumar debe ser positivo");

        }
        System.out.println("El resultado es: "+suma);
    }
}
