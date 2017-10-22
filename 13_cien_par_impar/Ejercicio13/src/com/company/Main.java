package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = -2;
        int b = -1;


        System.out.println("Elige 'P' para Par, o 'I' para Impar: ");
        char c = br.readLine().toLowerCase().charAt(0);

        for (int i = 0; i < 50; i++) {
            if (c == 'p') {
                a = a + 2;
                System.out.println(+a);
            } else {

                if (c == 'i') {

                    b = b + 2;
                    System.out.println(+b);

                } else {

                    System.out.println("ERROR. No has introducido 'P' o 'I'");
                }
            }

        }
    }
}
