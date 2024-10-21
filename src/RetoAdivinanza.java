import java.util.Random;
import java.util.Scanner;

public class RetoAdivinanza {
    public static void main(String[] args) {

        final int Intentos = 5;
        System.out.println("Adivina un numero del 0 al 10");
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int aleatorio = random.nextInt(10)+1;
        int inte =0;

        while(inte<Intentos) {
            System.out.println("introduce un numero del 1 al 10");
            int numero = Integer.parseInt(input.nextLine());
            inte++;

            //verficacion
            if(numero==aleatorio){
                System.out.println("felicidades lo conseguiste");
                break;
            }else{
                if(inte==5) {
                    System.out.printf("se te acabaron los intentos usaste ", inte);}else{
                    System.out.printf("sigue intentando vas en el intento %d", inte);}
            }



            // Pistas
            if (numero < aleatorio) {
                System.out.println("El número es mayor, intenta con uno más grande.");
            } else {
                System.out.println("El número es menor, intenta con uno más pequeño.");
            }



        }
    }
    }