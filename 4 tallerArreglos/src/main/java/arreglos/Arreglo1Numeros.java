package arreglos;

import java.util.Scanner;

public class Arreglo1Numeros {
    public static void main(String[] args) {
        int posicion = 0, num;

        int[] vector = new int[5];

        Scanner sc = new Scanner(System.in);

        while (posicion < 5) {
            System.out.println("Posicion numero: "+ posicion);
            System.out.println("Ingrese un numero del 1 al 100: ");
            num = sc.nextInt();

            if (num > 0 && num <= 100) {
                vector[posicion] = num;
            } else {
                System.out.println("El numero debe estar entre 1 y 100.");
                posicion -= 1;
            }

            posicion += 1;
        }

        if (posicion == 5) {
            System.out.println("Lista de numeros: ");
            for (int j = 0; j < vector.length; j++) {
                System.out.println("["+ j+ "] = "+ vector[j]);
            }
        }
    }
}
