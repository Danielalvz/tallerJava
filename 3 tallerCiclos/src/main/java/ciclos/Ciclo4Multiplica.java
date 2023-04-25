package ciclos;

import java.util.Scanner;

public class Ciclo4Multiplica {
    public static void main(String[] args) {
        int num, result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el numero que desea multiplicar: ");
        num = sc.nextInt();

        for (int i=1; i <= 10; i++) {
            result = i * num;
            System.out.println(i+ " x "+ num+ " = "+ result);
        }
    }
}
