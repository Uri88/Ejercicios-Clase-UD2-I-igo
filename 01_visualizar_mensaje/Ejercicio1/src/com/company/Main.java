package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un mensaje: ");

        String a = br.readLine();

        System.out.println("Has introducido: " +a);



    }
}
