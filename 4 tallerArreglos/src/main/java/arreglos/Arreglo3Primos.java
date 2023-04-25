package arreglos;

public class Arreglo3Primos {
    public static void main(String[] args) {
        int num, contador;

        System.out.println("Numeros primos: ");
        for (int i = 1; i < 1001; i++) {
            num = 1;
            contador = 0;

            while (num <= i) {
                if (i % num == 0) {
                    contador += 1;
                }
                num += 1;
            }

            if (contador == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
