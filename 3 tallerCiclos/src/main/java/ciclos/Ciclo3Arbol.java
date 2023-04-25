package ciclos;

import java.util.Scanner;

public class Ciclo3Arbol {
    public static void main(String[] args) {
        int j = 0, filas, h, i, k = 0, l, m;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cuantas filas desea: ");
        filas = sc.nextInt();
        System.out.println();

        //Arbol
        do {
            i = 0;
            do {
                System.out.print(" ");
                i++;
            } while (i <= filas - j);

            h = 0;
            do {
                System.out.print("* ");
                h++;
            } while (h <= j);

            System.out.println();
            j++;
        } while (j <= filas);

        //Palito
        if (filas == 10) {
            System.out.println("          ***");
        }

        do {
            l = 0;
            do {
                System.out.print(" ");
                l++;
            } while (l <= (filas - k) - 1);

            m = 0;
            do {
                System.out.print("**");
                m++;
            } while (m <= k);

            System.out.print("*");
            System.out.println();
            k++;
        } while (k < 3);
    }
}
