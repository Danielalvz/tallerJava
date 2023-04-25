package condicionales;

import java.util.Scanner;

public class Condicional4VideoTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        String pelicula, nombre, apellidos, direccion, telefono;

        do {
            System.out.println("Bienvenido a la video Tienda Barrio el Porvenir!");
            System.out.println("Estamos a su servicio para el alquiler de todo tipo de peliculas");
            System.out.println("Digite la opción del menú que desee");
            System.out.println("1 para alquilar pelicula");
            System.out.println("2 para consultar peliculas disponibles");
            System.out.println("3 recibir pelicula en la video tienda");
            System.out.println("4 para salir del menu.");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Digite el nombre de la pelicula que desea alquilar");
                    pelicula = sc.next();

                    System.out.println("Digite sus datos para el alquiler.");
                    System.out.println("Ingrese su nombre: ");
                    nombre = sc.next();
                    System.out.println("Y sus apellidos: ");
                    apellidos = sc.next();
                    System.out.println("Ingrese la direccion donde se realizará el alquiler de la pelicula. ");
                    direccion = sc.next();

                    System.out.println("Cliente " + nombre + " " + apellidos);
                    System.out.println("Su alquiler es para " + direccion);
                    System.out.println("Y usted alquilará la pelicula: " + pelicula);
                    System.out.println("Su alquiler será enviado con un dia habil.");
                    break;
                case 2:
                    System.out.println("Bienvenido, a continuación encontrará nuestras peliculas disponibles. ");
                    System.out.println("Últimos estrenos: ");
                    System.out.println("Aftersun., The Menu., El Gato con Botas., Triangle of Sadness.");
                    System.out.println("Más vistas: ");
                    System.out.println("Avatar., Topgun., Turning Red., Jurassic World.");
                    break;

                case 3:
                    System.out.println("Esta en la opción de recibir la pelicula directamente en la tienda.");
                    System.out.println("Digite el nombre de la pelicula que desea encargar, y lo contactaremos cuando este disponible.");
                    pelicula = sc.next();
                    System.out.println("Ingrese sus datos para contactarlo y reservar su pelicula.");
                    System.out.println("Ingrese su nombre ");
                    nombre = sc.next();
                    System.out.println("Y sus apellidos ");
                    apellidos = sc.next();
                    System.out.println("Por último, digite su número de teléfono, donde nos pondremos en contacto.");
                    telefono = sc.next();
                    break;

                case 4:
                    System.out.println("Esta saliendo del menú de nuestra Video Tienda..");
                    System.out.println("Es un gusto atenderlo, que tenga buen día.");
                    break;

                default:
                    System.out.println("Digite una opción válida para poder atender su solicitud.");
                    break;
            }
        } while (opcion < 4);

        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Por último, tenga en cuenta las siguientes anotaciones.");
        System.out.println("Al hacer uso de alquiler de peliculas, se compromete a devolverla en perfecto estado, tal y como se entrega.");
        System.out.println("Ante cualquier posible daño, se recurrirá a una multa según corresponda.");
        System.out.println("Se reservan los derechos de autor, no se pueden realizar copias.");

        System.out.println("Gracias por preferir nuestra Video Tienda.");
        System.out.println("Es un placer servirle.");
    }
}
