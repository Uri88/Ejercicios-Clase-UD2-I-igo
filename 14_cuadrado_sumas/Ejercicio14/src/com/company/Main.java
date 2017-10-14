package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = 0;

        System.out.println("Introduce un valor: ");
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            t = t + a;
        }
        System.out.println("El cuadrado de "+a+ " es "+t);

    }
}
