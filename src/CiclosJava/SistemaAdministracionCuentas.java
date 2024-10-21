package CiclosJava;

import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    boolean salir = false;

    while(!salir){
        System.out.printf("""
                Sistema de administracion de cuentas
                Menu
                1.-Crear cuenta
                2.-Eliminar cuenta
                3.-Salir
                Elige una opcion :\s
                """);
        int opcion = Integer.parseInt(input.nextLine());

        switch (opcion){
            case 1 -> System.out.println("creando tu cuenta ..\n");
            case 2 -> System.out.println("eliminando tu cuenta ..\n");
            case 3 -> {
                System.out.println("Salir");
                salir= true;
            }
            default -> System.out.println("opcion invalida ..\n");
        }
        System.out.println("fin del sistema de administracion de cuentas");
    }

    }
}
