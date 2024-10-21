import java.util.Scanner;

public class RetoCajeroAutomatico115 {
    public static void main(String[] args) {
        System.out.println("Aplicacion de cajero automatico");
        System.out.println("operaciones que puedes realizar");
        Scanner input = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        double saldo = 1000;

        while(!salir){
            System.out.printf("""
                    1.-Consultar Saldo
                    2.-Retirar
                    3.-Depositar
                    4.-Salir
                    Elige una opcion : %d
                    """,opcion);
            opcion = Integer.parseInt(input.nextLine());
            int valor = opcion;

            switch (valor){
                case 1 -> System.out.println("\ntu saldo es :" + saldo);
                case 2 ->{
                    System.out.println("Cuanto saldo quieres retirar :");
                    double retirar  = Double.parseDouble(input.nextLine());
                    if(saldo >= retirar){
                        System.out.println("tu saldo a retirar es :" + retirar);
                        saldo   = saldo-retirar;
                        System.out.println("tu nuevo saldo disponible es:" + saldo);
                    }else{
                        System.out.println("tu saldo "+ saldo + "  no alcanza para retirar "+ retirar);
                    }
                }
                case 3->{ System.out.println("ingresa que cantidad vas a depositar");
                    double deposito = Double.parseDouble(input.nextLine());
                    saldo += deposito;
                    System.out.println("tu nuevo saldo es :"+ saldo);
                }

                case 4-> {
                    System.out.println("saliendo ......");
                    salir=true;
                }
                default -> System.out.println("ingresa una opcion valida");
            }



    }
}
    }
