package condicionales;

import java.util.Scanner;

public class Condicional6TallerMotos {
    public static void main(String[] args) {
        int opcion = 0;
        String fecha, salida, placa, nota, novedades, arreglos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación taller de motos El Maquinista.");
        System.out.println("Somos los mejores en revisiones para motocicletas de alto cilindraje.");

        do {
            System.out.println("Se encuentra en el menú de opciones, digite la opción que desee realizar: ");
            System.out.println("1 para registrar un servicio.");
            System.out.println("2 para registrar salida de motocicleta.");
            System.out.println("3 para salir del programa.");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.println("Ingrese la fecha de registro con el formato fecha dd/mm/aaaa).");
                fecha = sc.next();
                System.out.println("Ingrese el numero de placa de la motocicleta para el registro: ");
                placa = sc.next();
                System.out.println("Escriba las anotaciones que dejó el cliente");
                nota = sc.next();
            }

            if (opcion == 2) {
                System.out.println("Ingrese la fecha de salida de la motocicleta (dd/mm/aaaa): ");
                salida = sc.next();
                System.out.println("Ingrese el numero de placa de la motocicleta para el registro: ");
                placa = sc.next();
                System.out.println("Ingrese las novedades presentadas: ");
                novedades = sc.next();
                System.out.println("Ingrese los arreglos hechos por el mecánico: ");
                arreglos = sc.next();
                System.out.println("Registro de servicio completado exitosamente.");
                System.out.println("Los arreglos realizados fueron: " + arreglos);
                System.out.println("Se presentaron las siguientes novedades: " + novedades);
            }

            if (opcion == 3) {
                System.out.println("Esta saliendo del programa, que tenga un buen dia");
            }

            if (opcion > 3 || opcion < 1) {
                System.out.println("Opción invalida");
            }
        } while (opcion < 3);
        sc.close();
    }
}
