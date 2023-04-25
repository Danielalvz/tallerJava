package ciclos;

import java.util.Scanner;

public class Ciclo8CursoAutos {
    public static void main(String[] args) {
        String nombre, identificacion;
        int opcion = 0, a = 0, k, j;
        double resultado;
        boolean bandera, encontrado;

        Scanner sc = new Scanner(System.in);

        UsuariosCursoAutos[] usuarios = new UsuariosCursoAutos[8];
        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i] = new UsuariosCursoAutos("0", "0", 0);
        }

        System.out.println("Bienvenido a la escuela automovilística El Maestro!");
        System.out.println("Con nuestros cursos, logrará conseguir su licencia de conducción.");
        while (opcion != 5) {
            System.out.println("Ingrese la opción que desee: ");
            System.out.println("1 para registrar un usuario en el curso");
            System.out.println("2 para consultar un usuario");
            System.out.println("3 para consulta de resultados");
            System.out.println("4 para listar todos los usuarios");
            System.out.println("5 para salir del sistema");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: //Registrar usuario
                    System.out.println("Tenemos capacidad para 8 estudiantes.");
                    System.out.println("Estamos con el registro del estudiante no.: "+ (a+1));
                    bandera = true;
                    if (a < usuarios.length) {
                        if (usuarios[a].getNombre().equals("0")) {
                            //Guardar usuario---------------------
                            System.out.println("Ingrese el nombre de usuario: ");
                            nombre = sc.next();
                            usuarios[a].setNombre(nombre);

                            System.out.println("Ingrese numero de identificacion: ");
                            identificacion = sc.next();
                            usuarios[a].setIdentificacion(identificacion);

                            while (bandera) {
                                System.out.println("Ingrese el resultado obtenido ");
                                System.out.println("Si se encuentra en curso, digite 0 ");
                                resultado = sc.nextDouble();

                                if (resultado <= 100) {
                                    usuarios[a].setCalificacion(resultado);
                                    bandera = false;
                                } else {
                                    System.out.println("La calificación es de 1 a 100, y 0 cuando esta cursando, es decir, aun no hay calificación.");
                                }
                            }//------------------------------------
                        }
                        a += 1;
                    }

                    if (a > usuarios.length-1) {
                        System.out.println("Lo siento, no tenemos mas cupos");
                    }
                    break;
                case 2: //Consultar un usuario
                    System.out.println("Ingrese el numero de identificacion del usuario que desea consultar: ");
                    identificacion = sc.next();
                    //Consultar usuario----
                    encontrado = true;
                    k = 0;

                    while (encontrado && k < usuarios.length) {
                        if (usuarios[k].getIdentificacion().equals(identificacion)) {
                            System.out.println("Usuario matriculado");
                            System.out.println("Nombre: " + usuarios[k].getNombre());
                            System.out.println("Identificacion: " + usuarios[k].getIdentificacion());
                            encontrado = false;
                        } else if (k >= usuarios.length-1) {
                            System.out.println("Lo siento, el usuario no se encuentra registrado.");
                        }
                        k += 1;
                    } //------------------
                    break;
                case 3: //Consultar resultados
                    System.out.println("Ingrese el numero de identificacion del usuario que desea consultar para conocer su resultado: ");
                    identificacion = sc.next();

                    //Consultar notas-----------------------
                    encontrado = true;
                    j = 0;

                    while (encontrado && j < usuarios.length) {
                        if (usuarios[j].getIdentificacion().equals(identificacion)) {
                            System.out.println("Usuario matriculado");
                            System.out.println("Nombre: " + usuarios[j].getNombre());
                            System.out.println("Identificacion: " + usuarios[j].getIdentificacion());
                            System.out.println("Resultado: " + usuarios[j].getCalificacion());
                            encontrado = false;

                            if (usuarios[j].getCalificacion() == 0) {
                                System.out.println("El usuario se encuentra en progreso, aun no cuenta con calificación final.");
                                System.out.println("Resultado: EN PROGRESO");
                            }
                            if (usuarios[j].getCalificacion() > 0 && usuarios[j].getCalificacion() < 80) {
                                System.out.println("Lo lamentamos, debes repetir el curso, ya que no se alcanzó el resultado esperado.");
                                System.out.println("Resultado: NO APROBADO");
                            }
                            if (usuarios[j].getCalificacion() >= 80) {
                                System.out.println("Felicitaciones! terminó el curso y APROBÓ.");
                                System.out.println("Resultado: APROBADO");
                            }
                        }
                        j += 1;
                    } //----------------------------------
                    break;
                case 4: //Listar todos los usuarios
                    System.out.println("Lista de los usuarios registrados");

                    //Listar usuarios-------------------
                    for (int m = 0; m < usuarios.length; m++) {
                        System.out.println("Usuario no. " + (m+1));
                        System.out.println("Nombre: " + usuarios[m].getNombre());
                        System.out.println("Identificación: " + usuarios[m].getIdentificacion());
                    }//------------------------------
                    break;
                case 5: //Salir del sistema
                    System.out.println("Gracias por preferirnos!");
                    System.out.println("Esta saliendo del programa...");
                    break;
            }
        }
    }
}
