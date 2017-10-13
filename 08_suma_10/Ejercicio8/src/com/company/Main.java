package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int suma = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Introduce un numero: ");
            a = Integer.parseInt(br.readLine());
            suma = suma + a;
        }
        System.out.println("El resultado es: "+suma);

    }
}
