package ciclos;

public class Ciclo1Escalera {
    public static void main(String[] args) {
        int cantidad;
        String simbolo;

        simbolo = "*";
        cantidad = 10;

        for (int i=1; i <= cantidad; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
}
