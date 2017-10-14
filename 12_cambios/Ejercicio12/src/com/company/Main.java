package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double cantidad = 0;
        double precio = 0;
        double cambio = 0;
        int monedas = 0;

        //Precio Producto
        System.out.println("Introduce el precio del producto: ");
        precio = Double.parseDouble(br.readLine());

        do {

            //Cantidad que introduce el usuario
            System.out.println("Introduce una cantidad: ");
            cantidad = Double.parseDouble(br.readLine());

            if (cantidad < precio && cantidad % 5 != 0) {

                System.out.println("La cantidad es menor que el importe del producto, o la moneda no es valida");

            } else {

                if (cantidad != precio) {

                    //Conversion a centimos para operar
                    cambio = (cantidad - precio) * 100;

                    //Monedas de 2€
                    monedas = (int) (cambio / 200);
                    System.out.println(+monedas+ " monedas de 2€");
                    cambio = cambio % 200;

                    //Monedas de 1€
                    monedas = (int) (cambio / 100);
                    System.out.println(+monedas+ " monedas de 1€");
                    cambio = cambio % 100;

                    //Monedas de 0'50€
                    monedas = (int) (cambio / 50);
                    System.out.println(+monedas+ " monedas de 0.50€");
                    cambio = cambio % 50;

                    //Monedas de 0'20€
                    monedas = (int) (cambio / 20);
                    System.out.println(+monedas+ " monedas de 0.20€");
                    cambio = cambio % 20;

                    //Monedas de 0'10€
                    monedas = (int) (cambio / 10);
                    System.out.println(+monedas+ " monedas de 0.10€");
                    cambio = cambio % 10;

                    //Monedas de 0'05€
                    monedas = (int) (cambio / 5);
                    System.out.println(+monedas+ " monedas de 0.05€");

                } else {

                    System.out.println("Cantidad exacta. Aqui tiene su producto: ");

                }
            }
        } while (cantidad < precio && cantidad % 5 != 0);
    }
}