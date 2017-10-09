package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b = 0;

        do {

            System.out.println("Introduce un valor: ");
            a = Integer.parseInt(br.readLine());

            if (a>0){

                System.out.println(+a);

            } else {
                b = a * (-1);
                System.out.println(+b);

            }
        }while (a != 0) ;
        System.out.println("FIN");
    }
}
