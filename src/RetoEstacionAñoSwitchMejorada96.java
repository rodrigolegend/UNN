import java.util.Scanner;

public class RetoEstacionAñoSwitchMejorada96 {
    public static void main(String[] args) {
        System.out.println("Calculador de estacion del año");
        Scanner input = new Scanner(System.in);
        System.out.println("proporciona el valor del mes 1-12");
        int mes = Integer.parseInt(input.nextLine());

        switch (mes){
            case 1,2,12-> System.out.println(" es invierno");
            case 3,4,5 -> System.out.println(" es primavera");
            case 6,7,8 -> System.out.println(" es verano");
            case 9,10,11 -> System.out.println("es otoño");
            default -> System.out.println("numero invalido");
        }
    }
}
