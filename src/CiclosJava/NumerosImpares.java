package CiclosJava;

public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("Numeros impares");
        int contador = 20;
        do{
            contador--;
           if(contador %2 != 0){
               System.out.println("es impar "+ contador);
           }
        }while (contador >0);
    }
}
