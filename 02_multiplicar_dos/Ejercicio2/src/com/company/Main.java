package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        int a = 0;
        int b = 0;
        int c = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un valor: ");
        a = Integer.parseInt(br.readLine());


        System.out.println("Introduce otro valor: ");
        b = Integer.parseInt(br.readLine());


        c = a * b;

        System.out.println("El resultado es: " + c);
    }
}
