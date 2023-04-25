package condicionales;

import java.util.Scanner;

public class Condicional5Farmacia {
    public static void main(String[] args) {

        //Inicializacion de variables
        int opcion = 0, cantidad;
        String producto;
        double precio = 0, total = 0, totalCompra = 0;

        ProductosFarmacia productosAseo[] = new ProductosFarmacia[4];

        productosAseo[0] = new ProductosFarmacia("123", "Desodorante rexona mujer", 18900);
        productosAseo[1] = new ProductosFarmacia("1234", "Desodorante Axe hombre", 22800);
        productosAseo[2] = new ProductosFarmacia("12345", "Crema dental colgate", 3800);
        productosAseo[3] = new ProductosFarmacia("123456", "Crema Ponds S", 11300);

        ProductosFarmacia medicamentos[] = new ProductosFarmacia[6];
        medicamentos[0] = new ProductosFarmacia("234", "Acetaminofem", 1200);
        medicamentos[1] = new ProductosFarmacia("2345", "Dolex gripa", 1900);
        medicamentos[2] = new ProductosFarmacia("23456", "Noxpirin", 1700);
        medicamentos[3] = new ProductosFarmacia("234567", "Noraver gripa pastas", 5900);
        medicamentos[4] = new ProductosFarmacia("2345678", "Noraver garganta", 1800);
        medicamentos[5] = new ProductosFarmacia("23456789", "Vick Vaporub", 4200);

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación de facturación Droguería Mi Salud");
        System.out.println("Estamos ubicados en la localidad de Suba para brindarle el mejor servicio");

        //MENU
        do {
            System.out.println("Escoja la opción que desea realizar con nosotros:");
            System.out.println("1 para registrar compra de productos");
            System.out.println("2 para consulta de precios por producto");
            System.out.println("3 para devoluciones");
            System.out.println("4 Inventario de productos");
            System.out.println("5 para salir del sistema");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Compra de productos.");
                    System.out.println("Escriba el producto, por código o nombre, que desea adquirir.");
                    producto = sc.nextLine().toLowerCase();

                    verificarProducto(producto, productosAseo, medicamentos);

                    System.out.println("Que cantidad desea del producto?");
                    cantidad = sc.nextInt();

                    precio = verificarPrecio(producto, productosAseo, medicamentos);
                    if (cantidad > 0) {
                        total = precio * cantidad;
                    } else if (cantidad == 0) {
                        total = precio;
                    }

                    System.out.println("Se ha añadido " + producto + " al carrito de compras. Con un valor total de " + total);
                    System.out.println("Gracias por preferirnos");

                    totalCompra = totalCompra + total;
                    break;
                case 2:
                    System.out.println("Consultar el precio del producto.");
                    System.out.println("Escriba el producto, por código o nombre, que desea conocer su precio.");
                    producto = sc.nextLine().toLowerCase();

                    verificarProducto(producto, productosAseo, medicamentos);
                    break;
                case 3:
                    System.out.println("Bienvenido a las devoluciones");
                    System.out.println("Escriba el producto, por código o nombre, que desea devolver");
                    producto = sc.nextLine().toLowerCase();

                    verificarProducto(producto, productosAseo, medicamentos);

                    if (totalCompra > 0 && precio < totalCompra) {
                        System.out.println("Que cantidad desea devolver?");
                        cantidad = sc.nextInt();

                        precio = verificarPrecio(producto, productosAseo, medicamentos);
                        if (cantidad > 0) {
                            total = precio * cantidad;
                        } else if (cantidad == 0) {
                            total = total;
                        }
                        totalCompra = totalCompra - total;
                        System.out.println("El producto se restara del total.");
                        System.out.println("Su devolución tiene un valor total de: " + total);
                        System.out.println("El total de su compra acumulada es de: "+ totalCompra);
                    } else {
                        System.out.println("Saldo insuficiente, el producto no s eha registrado. El saldo actual en carrito es de $" + totalCompra);
                    }
                    break;
                case 4:
                    //Inventario
                    System.out.println("Productos de aseo disponibles: ");
                    imprimeProductos(productosAseo);

                    System.out.println("Medicamentos disponibles:");
                    imprimeProductos(medicamentos);
                case 5:
                    System.out.println("Esta saliendo del programa, gracias por preferirnos.");
                    break;
            }
        } while (opcion < 5);
        sc.close();
    }

    //Funciones
    public static void imprimeProductos(ProductosFarmacia lista[]) {

            for (int i=0; i < lista.length; i++) {
                System.out.println("Codigo: " + lista[i].getCodigo() + " Producto: " + lista[i].getProducto());
            }
    }

    public static void verificarProducto(String producto, ProductosFarmacia productosAseo[], ProductosFarmacia medicamentos[]) {
        int contador = 0;

        for (int k=0; k < productosAseo.length; k++) {
            if (productosAseo[k].getCodigo().equals(producto) || productosAseo[k].getProducto().contains(producto)) {
                System.out.println("Codigo: "+ productosAseo[k].getCodigo()
                        + " Producto: " + productosAseo[k].getProducto()
                        + " Precio: " + productosAseo[k].getPrecio());
                contador = contador +1;
            }
        }

        for (int l=0; l < medicamentos.length; l++) {
            if (medicamentos[l].getCodigo().equals(producto) || medicamentos[l].getProducto().contains(producto)) {
                System.out.println("Codigo: "+ medicamentos[l].getCodigo()
                        + " Producto: " + medicamentos[l].getProducto()
                        + " Precio: " + medicamentos[l].getPrecio());
                contador = contador +1;
            }
        }

        if (contador == 0) {
            System.out.println("Producto no encontrado");
        }
    }

    public static double verificarPrecio(String producto, ProductosFarmacia productosAseo[], ProductosFarmacia medicamentos[]) {
        double precio = 0;

        for (int k=0; k < productosAseo.length; k++) {
            if (productosAseo[k].getCodigo().equals(producto) || productosAseo[k].getProducto().contains(producto)) {
                precio = productosAseo[k].getPrecio();
            }
        }

        for (int l=0; l < medicamentos.length; l++) {
            if (medicamentos[l].getCodigo().equals(producto) || medicamentos[l].getProducto().contains(producto)) {
                precio = medicamentos[l].getPrecio();
            }
        }
        return precio;
    }
}
