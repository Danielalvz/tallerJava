package ciclos;

import java.util.Scanner;

public class Ciclo2EscaleraAscendente {
    public static void main(String[] args) {
        int filas, j = 0, i, h;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas que desea: ");
        filas = sc.nextInt();
        System.out.println();

        while (j < filas) {
            i = 0;
            while (i < (filas-j)) {
                System.out.print(" ");
                i++;
            }
            h = 0;
            while (h < j) {
                System.out.print("*");
                h++;
            }
            System.out.println();
            j++;
        }
    }
}
