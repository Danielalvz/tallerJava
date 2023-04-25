package ciclos;

import java.util.Scanner;

public class Ciclo5Menu {
    public static void main(String[] args) {
        int opcion = 0;
        boolean bandera, nombreCapturado;
        String nombre = null;

        bandera = true;
        nombreCapturado = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Menu de usuario.");
        do {
            System.out.println("Digite la opción que desea realizar: ");
            System.out.println("1. Captura nombre");
            System.out.println("2. Saludar persona");
            System.out.println("3 Salir del sistema");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cual es su nombre? ");
                    nombre = sc.next();
                    nombreCapturado = true;
                    break;
                case 2:
                    if (nombreCapturado) {
                        System.out.println("Hola "+ nombre);
                    } else {
                        System.out.println("Hola, aun no sabemos tu nombre, eres bienvenido, y estas invitado a  escribir tu nombre con la opción 1.");
                    }
                    break;
                case 3:
                    System.out.println("Estas saliendo del programa.");
                    bandera = false;
                    break;
                default:
                    System.out.println("Esta opción no esta disponible");
                    break;
            }
        } while (bandera);
        sc.close();
    }
}
