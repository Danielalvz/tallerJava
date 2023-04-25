package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        variables datos = new variables();

        // Parte 1
        System.out.println("Indique su nombre");
        datos.setNombre(input.nextLine());

        System.out.println(datos.getNombre());

        System.out.println("Indique su apellido");
        datos.setApellido(input.nextLine());


        // Parte 2
        System.out.println("Indique su edad");
        datos.setEdad(input.nextInt());

        System.out.println("Indique su estatura");
        datos.setEstatura(input.nextDouble());
        input.nextLine();


        // Parte 3
        System.out.println("Cual es el nombre de su madre?");
        datos.setNombreMadre(input.nextLine());

        System.out.println("Indique tambien sus apellidos");
        datos.setApellidoMadre(input.nextLine());

        System.out.println("Cual es el nombre de su padre?");
        datos.setNombrePadre(input.nextLine());

        System.out.println("Indique tambien sus apellidos");
        datos.setApellidoPadre(input.nextLine());

        System.out.println("Yo " + datos.getNombre() + " " + datos.getApellido()
                + " soy hijo/a de " + datos.getNombreMadre() + " " + datos.getApellidoMadre()
                + " y de " + datos.getNombrePadre() + " " + datos.getApellidoPadre());

        // Parte 4
        System.out.println("Indique el nombre de una ciudad capital:");
        datos.setCiudad(input.nextLine());

        System.out.println("Ahora ingrese el país correspondiente a dicha ciudad:");
        datos.setPais(input.nextLine());

        System.out.println("La ciudad de " + datos.getCiudad() + " es la capital del país " + datos.getPais());

        // Parte 5
        System.out.println("Usted tiene mascotas?");
        datos.setRespuestaMascota(input.nextLine().toLowerCase());


        if (datos.getRespuestaMascota().equals("si")) {
            System.out.println("Cual es el nombre de su mascota?");
            datos.setNombreMascota(input.nextLine());

            System.out.println("Indique la edad de su mascota");
            datos.setEdadMascota(input.nextInt());
            input.nextLine();

            System.out.println("De que tipo de animal o raza es su mascota?");
            datos.setTipoMascota(input.nextLine());

            System.out.println("Su mascota: " + datos.getNombreMascota() + " es un/a " + datos.getTipoMascota()
                    + " el/la cual tiene " + datos.getEdadMascota() + " años de edad. ");
            System.out.println("Y " + datos.getNombre() + " " + datos.getApellido() + " es actualmente su dueño/a.");
        } else {
            System.out.println("Usted no tiene mascota, este campo no aplica, gracias por su tiempo.");
        }
    }
}