package condicionales;

import java.util.Scanner;

public class Condicional8Pasteleria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, sabor, decoraciones, fechaPedido, fechaEntrega;
        int cantidad, porciones, opcion, disponible = 10;
        double precio = 0, total = 0, ventaDiaria = 0;

        System.out.println("Aplicación de registro de pasteles, propiedad del mejor pastelero Don Carlos");
        System.out.println("Bienvenido a la pasteleria Don Carlos!");

        do {
            // Menu de opciones
            System.out.println("Digite la opción que desee realizar");
            System.out.println("1 para registrar pedido");
            System.out.println("2 para revisar tortas disponibles");
            System.out.println("3 para revisar ventas diarias");
            System.out.println("4 para salir del programa");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                // Datos de variables
                System.out.println("Para registrar pedidos de algun cliente, registre los siguientes datos.");
                System.out.println("Nombre de su cliente");
                nombre = sc.next();
                System.out.println("Registre la fecha de hoy realizado el pedido, en formato fecha (dd/mm/aaaa)");
                fechaPedido = sc.next();
                System.out.println("Registre la fecha en la que debe ser entregado en formato fecha dd/mm/aaaa)");
                fechaEntrega = sc.next();
                System.out.println("Sabor de torta que desea");
                sabor = sc.next();
                System.out.println("Que tipo de decoración quiere para la torta");
                decoraciones = sc.next();
                System.out.println("Tamaño de la torta en porciones");
                porciones = sc.nextInt();
                System.out.println("Cantidad de tortas a realizar");
                cantidad = sc.nextInt();
                sc.nextLine();

                // Condicional de precios segun porciones de torta, tamaño
                if (porciones > 3 && porciones < 9) {
                    precio = 18000;
                }
                if (porciones > 8 && porciones <= 16) {
                    precio = 32000;
                }
                if (porciones > 16 && porciones <= 32) {
                    precio = 48000;
                }
                if (porciones < 4 || porciones > 32) {
                    System.out.println("No tenemos disponible este tamaño, el mas grande es de 32 porciones y el mas pequeño de 4.");
                    precio = 0;
                    cantidad -= cantidad; // Para que no se reste la disponibilidad de tortas, ya que esta no se puede realizar.
                }

                total = precio * cantidad;

                // Si se requiere una torta valida, se realizará el proceso
                if (cantidad >= 1) {
                    System.out.println("Su pedido se realizó el día " + fechaPedido);
                    System.out.println("Registrado para el cliente " + nombre);
                    System.out.println("Caracteristicas: torta de " + sabor + " con decoración de " + decoraciones);
                    System.out.println("Pedido hecho por un total de " + cantidad + " tortas. De " + porciones + " porciones.");
                    System.out.println("Precio de la torta por unidad: " + precio);
                    System.out.println("El precio total del pedido es: " + total);

                    if (disponible >= cantidad) {
                        disponible = disponible - cantidad;
                        ventaDiaria = ventaDiaria + total;
                        System.out.println("Pedido registrado exitosamente");
                    } else {
                        System.out.println("No hay suficientes tortas disponibles para realizar el pedido, se deben empezar a hacer");
                    }
                }
            }

            if (opcion == 2) {
                System.out.println("Las tortas disponibles son: " + disponible);
            }
            if (opcion == 3) {
                System.out.println("Las ventas registradas el día de hoy suman en total: " + ventaDiaria);
            }
            if (opcion == 4) {
                System.out.println("Gracias por visitar la pastelería Don Carlos");
            }
            if(opcion < 1 || opcion > 4) {
                System.out.println("Opción inválida, por favor digite un número de 1 a 4 según la opción.");
            }
        } while (opcion != 4);
    }
}

