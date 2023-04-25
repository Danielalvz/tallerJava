package arreglos;

import java.util.Scanner;

public class Arreglo5MatrizMultiplica {
    public static void main(String[] args) {
        int  fila = 1, contador, filaAMultiplicar, columna, a, b, respuesta;

        int[][] tabla = new int[10][10];
        int[] base = new int[10];

        int[][] resultados = new int[10][10];

        Scanner sc = new Scanner(System.in);

        //Inicializar tabla
        for (int i = 0; i < tabla.length; i++) {
            contador = 1;
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = contador;
                contador += 1;
            }
        }

        //Inicializar base con la que se multiplicara
        contador = 1;
        for (int k = 0; k < base.length; k++) {
            base[k] = contador;
            contador += 1;
        }

        //Numero de columnas de la matriz
        mostrarColumnas(base, tabla);

        //Se recorre la matriz
        for (int l = 0; l < tabla.length; l++) {
            //Filas izquierda
            imprimeFilas(fila);

            //Muestra la tabla y la base con la que se multiplica
            for (int m = 0; m < tabla[l].length; m++) {
                if (base[l] >= 10) { //Si el numero tiene dos digitos, se ajusta el espacio
                    System.out.print(tabla[l][m] + " x " + base[l] + "    ");
                } else {
                    System.out.print(tabla[l][m] + " x " + base[l] + "     ");
                }
            }
            System.out.println(); //Salto de fila
            fila += 1;
        }

        System.out.println();

        //Multiplicación de los numeros de la matriz
        System.out.println("Digite la fila que desea conocer el resultado: ");
        filaAMultiplicar = sc.nextInt();

        System.out.println("Adicionalmente, elija la columna que necesita, teniendo en cuenta su fila anterior, para conocer la casilla que desea: ");
        columna = sc.nextInt();

        a = tabla[filaAMultiplicar-1][columna-1];
        b = base[filaAMultiplicar-1];
        respuesta = a * b;

        System.out.print(a + " x " + b + " = "+ respuesta);

        //Muestra matriz con cada respuesta
        imprimeMatrizRespuestas(resultados, tabla, base);

        System.out.println();
        System.out.println("Multiplicacion con resultados de matriz bidimensional: ");
        resultadosMatriz(resultados, tabla, base);
    }

    public static void mostrarColumnas(int[] base, int[][] tabla) {
        //Numero de columnas de la matriz
        System.out.println("                                              COLUMNAS");

        for (int columna = 0; columna < tabla[0].length; columna++) {
            System.out.print("    "+ base[columna]+ "     ");
        }
        System.out.println();
    }

    public static void imprimeFilas(int fila) {
        if (fila >= 10) { //Filas
            System.out.print(fila+ " ");
        } else {
            System.out.print(fila+ "  ");
        }
    }

    public static void imprimeMatrizRespuestas(int[][] resultados, int[][] tabla, int[] base) {
        int fila;

        fila = 1;

        //Numero de columnas
        mostrarColumnas(base, tabla);

        for (int i = 0; i < tabla.length; i++) {
            //Filas
            imprimeFilas(fila);
            for (int j = 0; j < tabla[i].length; j++) {
                resultados[i][j] = tabla[i][j] * base[i];
                //Comprobacion resultados con dos digitos para ajustar espacio
                if (resultados[i][j] >= 10) {
                    System.out.print(" " + resultados[i][j] + "       ");
                } else {
                    System.out.print(" " + resultados[i][j] + "        ");
                }
            }
            fila += 1;
            System.out.println();
        }
    }

    public static void resultadosMatriz(int[][] resultados, int[][] tabla, int[] base) {
        //Muestra resultado especifo por cada celda
        int fila = 0, columna = 0;
        boolean bandera = true;

        Scanner sc = new Scanner(System.in);

        while (bandera) {
            System.out.println("Digite la fila que desea conocer el resultado: ");
            fila = sc.nextInt();
            System.out.println("Adicionalmente, elija la columna que necesita, teniendo en cuenta su fila anterior, para conocer la casilla que desea: ");
            columna = sc.nextInt();

            if (fila <= 10 && columna <= 10) {
                System.out.println(tabla[fila-1][columna-1] + " x " + base[fila-1] + " = " + resultados[fila-1][columna-1]);
                bandera = false;
                break;
            } else {
                System.out.println("Se encuentra fuera del rango");
                bandera = true;
            }
        }
    }
}
