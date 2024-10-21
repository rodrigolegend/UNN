import java.util.Scanner;

public class SistemaDeAutentificacion {
    public static void main(String[] args) {
        System.out.println("sistema de autenticacion");

        final String nombre ="Rodrigo";
        final String contraseña = "123";
        String resultado ="";

        System.out.println("ingresas tu nombre de usuario");
        Scanner input = new Scanner(System.in);
        String nombreIngresado = input.nextLine().strip();

        System.out.println("ingresa tu contraseña");
        String contraseñaIngresada = input.nextLine().strip();

        if (nombreIngresado.equals(nombre) && contraseñaIngresada.equals(contraseña)){
            System.out.println("bienvenido al sistema");
        }else if(!contraseñaIngresada.equals(contraseña) && nombreIngresado.equals(nombre)){
            System.out.println("el nombre es correcto pero tu contraseña es incorrecta");
        } else if (!nombreIngresado.equals(nombre) && contraseña.equals(contraseñaIngresada)) {
            System.out.println("el pass es correcto pero el usuario es incorrecto");
        }else  {
            System.out.println("ni el pass ni la contraseña son correcto");
        }

    }
}
