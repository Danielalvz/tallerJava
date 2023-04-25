package condicionales;

import java.util.Scanner;

public class Condicionales10Banco {
    public static void main(String[] args) {
        int opcion;
        double saldo = 0, ingreso, retiro;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a Su banco fiel.");
        do {
            System.out.println("Digite la opción que desea realizar: ");
            System.out.println("1 realizar ingreso a su cuenta");
            System.out.println("2 retirar dinero de su cuenta");
            System.out.println("3 consultar su saldo");
            System.out.println("4 salir del programa");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Digite la cantidad que desea ingresar: ");
                ingreso = sc.nextDouble();

                if (ingreso < 1) {
                    System.out.println("No puede realizar esta transacción, digite un número positivo en pesos.");
                } else {
                    saldo += ingreso;
                    System.out.println("Registro ingresado con exito!");
                }
            } else if (opcion == 2) {
                System.out.println("Digite la cantidad que desea retirar: ");
                retiro = sc.nextDouble();

                if (saldo > retiro) {
                    saldo -= retiro;
                    System.out.println("Cantidad retirada con exito");
                } else {
                    System.out.println("Saldo insuficiente para su retiro.");
                }
            } else if (opcion == 3) {
                System.out.println("Consulta de saldo, su saldo actual es de $" + saldo + " pesos.");
            }
        } while (opcion != 4);
        System.out.println("Gracias por usar nuestra aplicación bancaria.");
    }
}
