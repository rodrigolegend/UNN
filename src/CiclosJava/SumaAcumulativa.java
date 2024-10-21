package CiclosJava;

public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("suma acumulativa");

        final int MAXIMO = 5;
        int acumuladorSuma =0;

        //el truco aqui es que  numero se va ir aumentando hasta 5
        // y luego acumulador suma obtiene primero 1 luego en la 2nda vuelta
        //seria 1 + 2 = 3; esto obtendria y en la 3era vuelta tendria numero = 3
        // 3 de acumulador + 3 = 6 y asi hasta ir aumentando  hasta 15
        //iterar los valores
        int numero =1;

        while(numero <= MAXIMO){
            //imprimir lo que se va a sumar
            System.out.println("acumulador suma + numero" + acumuladorSuma+ " + "+ numero);
            //realizamos la suma acumulativa
            acumuladorSuma += numero++; // acumuladorsuma = acumuladorSuma + numero
            //1era iteracion = 0+1 2nda vuelta = 1 +2 3era vuelta = 3+3 4ta = 6+4= 5ta 10+5
//  imprimimos suma parcial acumulada

            System.out.println("Suma parcial acumulada :" + acumuladorSuma + "\n");


        }
        System.out.println("la suma de los primeros "+  MAXIMO + " numeros "
                + acumuladorSuma);


    }
}
