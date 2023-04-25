package condicionales;

import java.util.Scanner;

public class Condicional1y2Edad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese su edad");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted aún es un niño(a).");
        }

        System.out.println("Usted tiene " + edad + " años.");
        sc.close();
    }
}