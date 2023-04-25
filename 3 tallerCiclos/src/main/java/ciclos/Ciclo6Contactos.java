package ciclos;

import java.util.Scanner;

public class Ciclo6Contactos {
    public static void main(String[] args) {
        String persona, telefono, organizacion, busqueda, confirmacion;
        int opcion = 0, columna, contador = 0;

        Scanner sc = new Scanner(System.in);

        String[][] contactos = new String[3][3];

        for (int i = 0; i < contactos.length; i++) {
            for (int j = 0; j < contactos[i].length; j++) {
                contactos[i][j] = "";
            }
        }

        while (opcion != 5) {
            System.out.println("-------------------");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.println("-------------------");
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    for (int fila = 0; fila < contactos.length; fila++) {
                        System.out.println("Contacto numero "+ (fila+1));
                        columna = 0;
                        for (int k = 0; k < 1; k++) {
                            System.out.println("Ingrese el nombre de su contacto");
                            persona = sc.next();
                            contactos[fila][columna] = persona;

                            System.out.println("Ingrese el telefono de su contacto: ");
                            telefono = sc.next();
                            contactos[fila][columna + 1] = telefono;

                            for (int l=0; l < contactos.length; l++) {
                                if (l != fila) {
                                    while (contactos[l][columna+1].equals(telefono)) {
                                        System.out.println("El teléfono ingresado ya está en la lista de contactos.");
                                        System.out.println("Ingrese el telefono de su contacto de nuevo: ");
                                        telefono = sc.next();
                                        contactos[fila][columna+1] = telefono;
                                    }
                                }
                            }

                            System.out.println("Ingrese la organizacion de su contacto: ");
                            organizacion = sc.next();
                            contactos[fila][columna+2] = organizacion;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Buscar contacto");
                    System.out.println("Escriba el nombre o telefono que desea buscar: ");
                    busqueda = sc.next();

                    for (int fila  = 0; fila < contactos.length; fila++) {
                        if (contactos[fila][0].equals(busqueda) || contactos[fila][1].equals(busqueda)) {
                            System.out.println("Contacto encontrado:");
                            System.out.println("Nombre: " + contactos[fila][0]);
                            System.out.println("Teléfono: " + contactos[fila][1]);
                            System.out.println("Organización: " + contactos[fila][2]);
                            fila = contactos.length;
                            contador += 1;
                        } else {
                            contador = 0;
                        }
                    }
                    if (contador < 1) {
                        System.out.println("No se encontró ningún contacto con ese nombre o teléfono.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de contactos ");
                    for (int m = 0; m < contactos.length; m++) {
                        System.out.println("Contacto numero "+ (m+1));
                        for (int n = 0; n < contactos[m].length; n++) {
                            System.out.println(contactos[m][n]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Eliminar contacto");
                    System.out.println("Escriba el contacto que desea elminar ");
                    busqueda = sc.next();

                    for (int fila = 0; fila < contactos.length; fila++) {
                        if (contactos[fila][0].equals(busqueda) || contactos[fila][1].equals(busqueda)) {
                            System.out.println("Contacto encontrado:");
                            System.out.println("Nombre: " + contactos[fila][0]);
                            System.out.println("Teléfono: " + contactos[fila][1]);
                            System.out.println("Organización: " + contactos[fila][2]);

                            confirmacion = "";
                            while (!confirmacion.equals("S") && !confirmacion.equals("N")) {
                                System.out.println("¿Está seguro que desea eliminar este contacto? (S/N)");
                                confirmacion = sc.next().toUpperCase();
                            }

                            if (confirmacion.equals("S")) {
                                for (int i = 0; i < contactos[fila].length; i++) {
                                    contactos[fila][i] = "";
                                }
                                System.out.println("Contacto eliminado.");
                            } else {
                                System.out.println("Eliminación de contacto cancelada.");
                            }
                            fila = contactos.length;
                            contador += 1;
                        } else {
                            contador = 0;
                        }
                    }
                    if (contador < 1) {
                        System.out.println("No se encontró ningún contacto con ese nombre o teléfono.");
                    }
                    break;
                case 5:
                    System.out.println("Esta saliendo del sistema..");
                    break;
                default:
                    System.out.println("Esta opción no esta disponible");
            }
        }
    }
}
