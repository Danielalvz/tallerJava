package condicionales;

import java.util.Scanner;

public class Condicional3Datos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        String nombre, apellidos;

        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("También sus apellidos");
        apellidos = sc.nextLine();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();

        System.out.println(nombre + " " + apellidos);

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        } else {
            System.out.println("Usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }
}
