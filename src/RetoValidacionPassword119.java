import java.util.Scanner;

public class RetoValidacionPassword119 {
    public static void main(String[] args) {
        System.out.println("Creacion y validacion de password");

        Scanner input = new Scanner(System.in);
        System.out.println("ingresa una contraseña de 6 caracteres para pasar el check de seguridad");
        String password = input.nextLine();
        String largo = String.valueOf(password.length());
        int largoInt = Integer.parseInt(largo);
        if (largoInt >=6) {
            System.out.printf("tu password es correcto es de %d caracteres",largoInt);
        }else{
            System.out.printf("tu password es incorrecto es de %d caracteres lo cual no cumple con los 6 caracteres",largoInt);

        }
    }
}
