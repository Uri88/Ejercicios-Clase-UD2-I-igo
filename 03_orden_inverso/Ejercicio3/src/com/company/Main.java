package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br =  new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Introduce un valor: ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Introduce otro valor: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Introduce otro valor mas: ");
        int c = Integer.parseInt(br.readLine());

        System.out.println("Los valores inversos son: "+c+", " +b+ ", " +a);
    }
}
