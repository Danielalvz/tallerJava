package condicionales;

import java.util.Scanner;

public class Condicionales9Area {
    public static void main(String[] args) {
        String figura;
        int opcion = 0;
        double area = 0, base = 0, baseLado, altura = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenidos al calculador de área de diferentes figuras.");

        do {
            System.out.println("Digite 1 para consultar áreas y 2 para salir del programa.");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.println("Para iniciar, escriba que tipo de figura desea conocer su área: rectángulo, triángulo o trapecio.");
                figura = sc.next().toLowerCase();

                if (!figura.equals("rectangulo") && !figura.equals("rectángulo") && !figura.equals("triángulo")
                    && !figura.equals("triangulo") && !figura.equals("trapecio")) {
                    System.out.println("No tenemos disponible esta figura para poder hallar su área, lo sentimos.");
                    area = 0;
                } else {
                    System.out.println("Para hallar el área de un " + figura + " por favor digite la base o el ancho de este: ");
                    base = sc.nextInt();

                    System.out.println("Támbien digite su altura, o el largo del del "+ figura+ ": ");
                    altura = sc.nextInt();
                }

                if (figura.equals("rectángulo") || figura.equals("rectangulo")) {
                    area = base * altura;
                } else if (figura.equals("triángulo") || figura.equals("triangulo")) {
                    area = (base*altura)/2;
                } else if (figura.equals("trapecio")) {
                    System.out.println("Digite el otro lado o base de su trapecio: ");
                    baseLado = sc.nextInt();

                    area = ((base+baseLado)*altura)/2;
                }
                System.out.println("El área del "+ figura+ " es de: "+ area);
            }
        } while (opcion > 1);
        System.out.println("Gracias por usar nuestro programa!");
    }
}
