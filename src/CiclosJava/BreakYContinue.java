package CiclosJava;

public class BreakYContinue {
    public static void main(String[] args) {
        System.out.println("break y continue");

        for(int numero = 1;numero< 10; numero++){
            if(numero %2 ==0){
                System.out.print(numero+ " \n");
                break; // para que finalize el for ala primera  coincidencia
            }
        }

        //continue
        System.out.println("imprimimos solo pares ");
        for (int numero =1;numero < 10;numero++) {
            if (numero % 2 == 1) { //impar
                continue;
            } else {
                System.out.print(numero+ " ");
            }
        }
    }
}
