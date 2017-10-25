package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Introduce un numero de DNI: ");
        int numero = Integer.parseInt(br.readLine());

        System.out.print("Introduce una letra del DNI: ");
        char letra = br.readLine().toLowerCase().charAt(0);

        int resultado = numero % 23;
        char a=' ';

        switch (resultado) {

            case 0:
                a = 't';
                break;

            case 1:
                a = 'r';
                break;

            case 2:
                a = 'w';
                break;

            case 3:
                a = 'a';
                break;

            case 4:
                a = 'g';
                break;

            case 5:
                a = 'm';
                break;

            case 6:
                a = 'y';
                break;

            case 7:
                a = 'f';
                break;

            case 8:
                a = 'p';
                break;

            case 9:
                a = 'd';
                break;

            case 10:
                a = 'x';
                break;

            case 11:
                a = 'b';
                break;

            case 12:
                a = 'n';
                break;

            case 13:
                a = 'j';
                break;

            case 14:
                a = 'z';
                break;

            case 15:
                a = 's';
                break;

            case 16:
                a = 'q';
                break;

            case 17:
                a = 'v';
                break;

            case 18:
                a = 'h';
                break;

            case 19:
                a = 'l';
                break;

            case 20:
                a = 'c';
                break;

            case 21:
                a = 'k';
                break;

            case 22:
                a = 'e';
                break;
        }

        if (a == letra) {
            System.out.println("Correcto");

        } else {
            System.out.println("Incorrecto");
        }

    }
}
