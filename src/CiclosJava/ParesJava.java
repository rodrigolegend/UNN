package CiclosJava;

public class ParesJava {
    public static void main(String[] args) {
        System.out.println("numeros pares");
        int contador = 0 ;

        while(contador <= 20){
            if(contador % 2 ==0){
                System.out.print(" par " + contador);
                contador++;
            }else {
                contador++;
            }
        }
    }
}
