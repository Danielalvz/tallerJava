package condicionales;

import java.util.Scanner;

public class tallerCondicionales5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0, opcionCompra, respuestaCompra, cantidad;
        String producto, respuesta;
        double precio, total = 0;

        precio = 0;
        opcionCompra = 0;

        do {
            System.out.println("Bienvenido a la aplicación de facturación Droguería Mi Salud");
            System.out.println("Estamos ubicados en la localidad de Suba para brindarle el mejor servicio");
            System.out.println("Escoja la opción que desea realizar con nosotros:");
            System.out.println("1 para registrar compra de productos");
            System.out.println("2 para consulta de precios por producto");
            System.out.println("3 para devoluciones");
            System.out.println("4 para salir del sistema");
            opcion = sc.nextInt();


            // MENU
            switch (opcion) {
                case 1:
                    System.out.println("Para compra de productos digite la opción que desea según la categoría.");
                    break;
                case 2:
                    System.out.println("Para consultar el precio del producto digite el número correspondiente según la categoría que desea buscar.");
                    break;
                case 3:
                    System.out.println("Bienvenido a las devoluciones");
                    System.out.println("Para devolución de un producto digite la categoría por favor");
                    break;
                case 4:
                    System.out.println("Esta saliendo del programa, gracias por preferirnos.");
                    break;
            }
            // Condicional para ingresar a categorías de productos
            if (opcion > 0 && opcion < 4) {
                System.out.println("1 para aseo");
                System.out.println("2 para medicamentos");
                opcionCompra = sc.nextInt();
                sc.nextLine();
            }
            // Condicional para cada categoría 1 aseo y 2 medicamentos
            if (opcionCompra == 1) {
                System.out.println("Estos son los productos de aseo disponibles: ");
                System.out.println("123 Desodorante rexona mujer");
                System.out.println("1234 Desodorante Axe hombre");
                System.out.println("12345 Crema dental colgate");
                System.out.println("123456 Crema Ponds S");
            }

            if (opcionCompra == 2) {
                System.out.println("Estos son los medicamentos disponibles: ");
                System.out.println("234 Acetaminofem");
                System.out.println("2345 Dolex gripa");
                System.out.println("23456 Noxpirin");
                System.out.println("234567 Noraver gripa pastas");
                System.out.println("2345678 Noraver garganta");
                System.out.println("23456789 Vick Vaporub");
            }

            if (opcionCompra < 0 || opcionCompra > 2) {
                System.out.println("Esta opción no está disponible");
            }

            //Condicional para el detalle de cada producto
            if (opcionCompra == 1 || opcionCompra == 2) {
                System.out.println("¿Desea conocer el detalle de algún producto? Escriba si o no según su preferencia.");
                respuesta = sc.nextLine().toLowerCase();

                if (respuesta.equals("si")) {
                    System.out.println("Escriba el producto, por código o nombre, que desea adquirir o conocer su precio.");
                    producto = sc.nextLine().toLowerCase();

                    if (producto.equals("desodorante rexona mujer") || producto.equals("123")) {
                        precio = 18900;
                        System.out.println("Desodorante Rexona mujer: $" + precio);
                    } else if (producto.equals("desodorante axe hombre") || producto.equals("1234")) {
                        precio = 22800;
                        System.out.println("Desodorante Axe hombre: $" + precio);
                    } else if (producto.equals("crema dental colgate") || producto.equals("12345")) {
                        precio = 3800;
                        System.out.println("Crema dental Colgate: $" + precio);
                    } else if (producto.equals("crema ponds s") || producto.equals("123456")) {
                        precio = 11300;
                        System.out.println("Crema Ponds S: $" + precio);
                    } else if (producto.equals("acetaminofem") || producto.equals("234")) {
                        precio = 1200;
                        System.out.println("Acetaminofem 500gr tira de 10: $" + precio);
                    } else if (producto.equals("dolex gripa") || producto.equals("2345")) {
                        precio = 1900;
                        System.out.println("Dolex gripa: $" + precio);
                    } else if (producto.equals("noxpirin") || producto.equals("23456")) {
                        precio = 1700;
                        System.out.println("Noxpirin unidad: $" + precio);
                    } else if (producto.equals("noraver gripa pastas") || producto.equals("234567")) {
                        precio = 5900;
                        System.out.println("Noraver gripa pastas x 4und: $" + precio);
                    } else if (producto.equals("noraver garganta") || producto.equals("2345678")) {
                        precio = 1800;
                        System.out.println("Noraver garganta x und: $" + precio);
                    } else if (producto.equals("vick vaporub") || producto.equals("23456789")) {
                        precio = 9900;
                        System.out.println("Vick Vaporub: $" + precio);
                    } else {
                        System.out.println("Producto no disponible.");
                    }

                    System.out.println("Que cantidad desea del producto?");
                    cantidad = sc.nextInt();

                    if (cantidad > 0) {
                        total = precio * cantidad;
                    } else if (cantidad == 0) {
                        total = precio;
                    }

                    System.out.println("En total es: " + total);

                    System.out.println("Si desea continuar con la compra y realizar la factura digite 1, si desea realizar devolución digite 2, si desea salir digite 3");
                    respuestaCompra = sc.nextInt();

                    if (respuestaCompra == 1) {
                        System.out.println("Se ha añadido " + producto + " al carrito de compras. Con un valor total de " + total);
                        System.out.println("Gracias por preferirnos");
                    } else if (respuestaCompra == 2) {
                        System.out.println("El producto se restara del total.");
                        total = total - precio;
                        System.out.println("Ahora tiene un valor de " + total);
                    } else if (respuestaCompra == 3) {
                        System.out.println("Gracias por su visita, esperamos servirle en lo que necesite.");
                    } else {
                        System.out.println("Esta opción no existe, recuerde que las opciones disponibles son 1, 2 y 3");
                    }
                } else {
                    System.out.println("Esta saliendo de la opción de consulta de productos.");
                }
            }
        } while (opcion < 4);
    }
}
