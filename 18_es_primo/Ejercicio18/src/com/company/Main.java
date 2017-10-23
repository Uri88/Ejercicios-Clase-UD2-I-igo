package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int i = 2;

        System.out.println("Introduce un numero: ");
        int n = Integer.parseInt(br.readLine());


        while (n % i != 0 && i < n) {

            i++;
        }
        if (i < n) {

            System.out.println("NO es PRIMO");
        } else {

            System.out.println("SI es PRIMO");
        }

    }
}
