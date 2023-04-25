package ciclos;

import java.util.Scanner;

public class Ciclo7Parqueadero {
    public static void main(String[] args) {
        String placa;
        int opcion = 0, a = 0, k, j;
        boolean encontrado, bandera;

        Scanner sc = new Scanner(System.in);

        String[][] vehiculos = new String[5][4];

        for (int i = 0; i < vehiculos.length; i++) {
            for (int f = 0; f < vehiculos[i].length; f++) {
                vehiculos[i][f] = "0";
            }
        }


        while (opcion != 5) {
            System.out.println("Bienvenido al parqueadero El guardián");
            System.out.println("Digite la opción que desee realizar:");
            System.out.println("1 para ingresar un vehiculo");
            System.out.println("2 para retirar vehiculo del parqueadero");
            System.out.println("3 para consultar vehiculo");
            System.out.println("4 muestra todos los vehiculos");
            System.out.println("5 para salir del sistema");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(a);
                    if (a < vehiculos.length || a > vehiculos.length) {
                        if (vehiculos[a][0].equals("0")) {
                            guardarCliente(vehiculos, a);
                        }
                        a += 1;
                    }

                    if (a > vehiculos.length) {
                        System.out.println("Lo siento, el parqueadero está lleno");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la placa del vehículo que desea retirar: ");
                    placa = sc.next();
                    encontrado = true;
                    j = 0;

                    while (encontrado && j < vehiculos.length) {
                        if (vehiculos[j][0].equals(placa)) {
                            for (int h = 0; h < vehiculos[j].length; h++) {
                                vehiculos[j][h] = "0";
                            }
                            System.out.println("Vehículo retirado correctamente");
                            encontrado = false;
                        } else if (j >= vehiculos[j].length) {
                            System.out.println("Lo siento, el vehículo no se encuentra en el parqueadero");
                        }
                        j += 1;
                    }

                    if (a == 0)  {
                        a = 0;
                    } else {
                        a -= 1;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la placa del vehículo que desea consultar: ");
                    placa = sc.next();

                    bandera = true;
                    k = 0;
                    while (bandera && k < vehiculos.length) {
                        if (vehiculos[k][0].equals(placa)) {
                            System.out.println("El vehículo se encuentra en el parqueadero");
                            System.out.println("Placa: " + vehiculos[k][0]);
                            System.out.println("Marca: " + vehiculos[k][1]);
                            System.out.println("Nombre: " + vehiculos[k][2]);
                            System.out.println("Telefono: " + vehiculos[k][3]);
                            bandera = false;
                        } else if (k >= vehiculos[k].length) {
                            System.out.println("Lo siento, el vehículo no se encuentra en el parqueadero");
                        }
                        k += 1;
                    }
                    break;
                case 4:
                    System.out.println("Todos los vehiculos:");
                    for (int m = 0; m < vehiculos[a].length; m++) {
                        System.out.println("Vehiculo en posicion no. "+ m);
                        System.out.println("Placa: " + vehiculos[m][0]);
                        System.out.println("Marca: " + vehiculos[m][1]);
                        System.out.println("Nombre: " + vehiculos[m][2]);
                        System.out.println("Telefono: " + vehiculos[m][3]);
                    }
                    break;
                case 5:
                    System.out.println("¡Gracias por utilizar el Parqueadero El guardián!");
                    break;
                default:
                    System.out.println("Opción inválida, por favor seleccione otra opción");
            }
        }
    }

    public static void guardarCliente(String[][] vehiculos, int a) {
        String placa, marca, nombre, telefono;
        boolean bandera = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la placa del vehículo: ");
        placa = sc.next();
        vehiculos[a][0] = placa;

        System.out.println("Ingrese la marca del vehículo: ");
        marca = sc.next();
        vehiculos[a][1] = marca;

        System.out.println("Ingrese el nombre completo del cliente: ");
        nombre = sc.next();
        vehiculos[a][2] = nombre;

        while (bandera) {
            System.out.println("Ingrese el número de teléfono del cliente: ");
            telefono = sc.next();
            if (telefono.length() == 10) {
                vehiculos[a][3] = telefono;
                bandera = false;
            } else {
                System.out.println("Numero no valido. El numero debe ser de 10 digitos.");
            }
        }
    }
}
