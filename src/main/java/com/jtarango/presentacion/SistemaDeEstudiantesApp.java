package com.jtarango.presentacion;

import com.jtarango.datos.EstudianteDAO;
import com.jtarango.dominio.Estudiante;

import java.util.Scanner;

public class SistemaDeEstudiantesApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);

        //Creamos instancia del servicio
        var estudianteDao = new EstudianteDAO();

        while (!salir){
            try {
                mostrarMenu();
                salir = ejecutarOpciones(consola, estudianteDao);
            } catch (Exception e) {
                System.out.println("Ocurrió un error al ejecutar operación: " + e.getMessage());
            }
            System.out.println();

        }
    }

    private static void mostrarMenu(){
        System.out.println("""
                *** Sistema de Estudiantes ***
                
                Elige una opción a realizar:
                
                1. Listar Estudiante
                2. Buscar Estudiante
                3. Agregar Estudiante
                4. Modificar Estudiante
                5. Eliminar Estudiante
                6. Salir
                """);
        System.out.println();
    }

    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDao){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion) {
            case 1 ->{ //Listar estudiantes
                System.out.println("Listado de Estudiantes...");
                var estudiantes = estudianteDao.listarEstudiantes();
                estudiantes.forEach(System.out::println);
                System.out.println();
            }

            case 2 ->{//Buscar Estudiante
                System.out.println("Introduce el id de estudiante a buscar: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDao.buscarEstudiantePorId(estudiante);
                if (encontrado){
                    System.out.println("Estudiante encontrado: " + estudiante);
                } else {
                    System.out.println("No se encontró estudiante: " + estudiante);
                }
            }

            case 3 ->{//Agregar estudiante
                System.out.println("Agregar Estudiante: ");
                System.out.print("Nombre :");
                var nombre = consola.nextLine();
                System.out.print("Apellido :");
                var apellido = consola.nextLine();
                System.out.print("Telefono :");
                var telefono = consola.nextLine();
                System.out.print("Email :");
                var email = consola.nextLine();

                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDao.agregarEstudiante(estudiante);
                if (agregado) {
                    System.out.println("Estudiante agregado: " + estudiante);
                } else {
                    System.out.println("No se agregó el estudiante: " + estudiante);
                }
                System.out.println();
            }

            case 4 ->{//Modificar estudiante
                System.out.println("Modificar Estudiante: ");
                System.out.println("id Estudiante");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido :");
                var apellido = consola.nextLine();
                System.out.print("Telefono :");
                var telefono = consola.nextLine();
                System.out.print("Email :");
                var email = consola.nextLine();

                var estudiante = new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudianteDao.modificarEstudiante(estudiante);
                if (modificado){
                    System.out.println("Estudiante modificado: " + estudiante);
                } else {
                    System.out.println("No se modificó estudiante: " + estudiante);
                }
                System.out.println();
            }

            case 5 ->{//Eliminar estudiante
                System.out.println("Eliminar Estudiante: ");
                System.out.println("id Estudiante");
                var idEstudiante = Integer.parseInt(consola.nextLine());

                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDao.eliminarEstudiante(estudiante);
                if (eliminado){
                    System.out.println("Estudiante Eliminado: " + estudiante);
                } else {
                    System.out.println("No se eliminó estudiante: " + estudiante);
                }
                System.out.println();
            }

            case 6 ->{//Salir
                System.out.println("Nos vemos...");
                salir = true;
            }

            default -> System.out.println("Opción no valida: " + opcion);
        }//End switch

        return salir;
    }

}