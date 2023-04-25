package condicionales;

import java.util.Scanner;

public class Condicional7Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, estatura, imc;

        System.out.println("Bienvenido/a a La Secretaría de Salud Municipal");
        System.out.println("Aplicación para calcular su IMC");
        System.out.println("Podrá identificar si su peso es adecuado o si debe prestar atención por su salud");

        System.out.println("Digite su peso en kg");
        peso = sc.nextDouble();
        System.out.println("Digite su estatura en metros");
        estatura = sc.nextDouble();

        imc = peso / Math.pow(estatura, 2);

        System.out.println("Su IMC es: " + imc);
        System.out.println("A continuación tenga en cuenta esta información sobre su peso");
        System.out.println("Por debajo de 18.5 = Bajo peso");
        System.out.println("Entre 18.5 - 24.9 = Normal");
        System.out.println("Entre 25.0 - 29.9 = Sobrepeso");
        System.out.println("Entre 30.0 o más = Obesidad");

        if (imc < 18) {
            System.out.println("Usted se encuentra Bajo de peso, por favor preste atención a su salud y aumente su alimentación en proteina");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Su peso es normal, se encuentra en el nivel de peso adecuado.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Tenga cuidado, usted se encuentra en la linea de sobrepeso, se recomienda realizar ejercicio");
        } else {
            System.out.println("Se encuentra en el nivel de obesidad, por favor acuda con un medico para mejorar su dieta y realice ejercicio.");
        }
    }
}
