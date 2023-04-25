package arreglos;

public class Arreglo2Enteros {
    public static void main(String[] args) {

        int temp, a = 0, k = 0, l = 0;
        int[] num = new int[20];

        System.out.println("Numeros enteros de 20 posiciones, con numeros aleatorios de 1 a 100");

        //Inicializar array
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100 +1); //Inicializa
            for (int j = 0; j <= i-1; j++) { //Comprobacion para no repetir numeros, se hace hasta el numero anterior de la lista
                while (num[j] == num[i]) {
                    num[i] = (int) (Math.random() * 100 +1);
                    j = 0; //Para volver a comparar el nuevo numero aleatorio, con los anteriores de la lista
                }
            }
        }

        //Orden ascendente
        for (int m = 0; m < num.length; m++) {
            for (int n = 0; n < (num.length-1)-m; n++) {
                if (num[n] > num[n+1]) {
                    temp = num[n];
                    num[n] = num[n+1];
                    num[n+1] = temp;
                }
            }
        }

        //Mostrar pares
        System.out.println("Numeros pares: ");
        while (k < num.length) {
            a = num[k];
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            k += 1;
        }

        //Mostrar impares
        System.out.println();
        System.out.println("Numeros impares: ");
        while (l < num.length) {
            if ((num[l] % 2) != 0) {
                System.out.print(num[l] + " ");
            }
            l += 1;
        }
    }
}
