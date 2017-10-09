package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br =  new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Introduce la base: ");
        int base = Integer.parseInt(br.readLine());

        System.out.println("Introduce la altura: ");
        int altura = Integer.parseInt(br.readLine());

        double area = 2/(base*altura);

        System.out.println("El area es: " +area);

        

    }
}
