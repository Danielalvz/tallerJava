package arreglos;

public class Arreglo4Matriz {
    public static void main(String[] args) {

        int[][] num = new int[4][5];
        int[][] number = new int[4][5];

        int[][] matriz = new int[4][5];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[0][4] = 5;
        matriz[1][0] = 6;
        matriz[1][1] = 7;
        matriz[1][2] = 8;
        matriz[1][3] = 9;
        matriz[1][4] = 10;
        matriz[2][0] = 11;
        matriz[2][1] = 12;
        matriz[2][2] = 13;
        matriz[2][3] = 14;
        matriz[2][4] = 15;
        matriz[3][0] = 16;
        matriz[3][1] = 17;
        matriz[3][2] = 18;
        matriz[3][3] = 19;
        matriz[3][4] = 20;

        System.out.println("Primer matriz, codigo quemado");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 10) {
                    System.out.print("0" + matriz[i][j]+ " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Segunda matriz automatica");
        inicializar(num);

        System.out.println();
        System.out.println("Segunda matriz menos quemada");
        inicializarMatriz(number);
    }

    public static void  inicializar(int[][] num) {
        int contador, disminuye, aumenta, retrocede;
        contador = 1;
        disminuye = 10;
        aumenta = 11;
        retrocede = 20;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (i == 0) {
                    num[0][j] = contador;
                    contador += 1;
                }
                if (i == 1) {
                    num[1][j] = disminuye;
                    disminuye -= 1;
                }
                if (i == 2) {
                    num[2][j] = aumenta;
                    aumenta += 1;
                }
                if (i ==3) {
                    num[3][j] = retrocede;
                    retrocede -= 1;
                }
                mostrarMatriz(num, i,  j);
            }
            System.out.println();
        }
    }

    public static void mostrarMatriz(int[][] num, int i, int j) {
        if (num[i][j] < 10) {
            System.out.print("0" + num[i][j] + " ");
        } else {
            System.out.print(num[i][j] + " ");
        }
    }

    public static void inicializarMatriz(int[][] number) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (i % 2 == 0) { //Filas apres
                    number[i][j] = i * 5 + j + 1;
                } else {
                    number[i][j] = i * 5 + 5 - j; //Filas impares
                }
                mostrarMatriz(number, i, j);
            }
            System.out.println();
        }
    }
}
