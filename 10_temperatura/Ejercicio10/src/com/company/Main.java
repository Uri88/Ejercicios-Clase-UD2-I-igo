package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce una temperatura en ºC: ");
        double a = Double.parseDouble(br.readLine());

        System.out.println("Introduce 'F' para convertir a Fahrenheit o 'K' para convertir a Kelvin: ");
        char c = br.readLine().toLowerCase().charAt(0);

        if ( c == 'f'){

            double far = (a-32)/1.8;
            System.out.println("El resultado a ºF es: "+far);


        }else {

            if (c=='k'){

                double kel = a +273.15;
                System.out.println("El resultado a ºK es: "+kel);


            } else {

                System.out.println("ERROR, no has introducido 'F' o 'K' ");
            }

        }
    }
}
