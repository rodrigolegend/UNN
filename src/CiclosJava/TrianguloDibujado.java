package CiclosJava;

import java.util.Scanner;

public class TrianguloDibujado {
    public static void main(String[] args) {
        System.out.println("Dibujando un triangulo");
        System.out.println("proporciona el numero de filas");
        Scanner input = new Scanner(System.in);
        int filas = Integer.parseInt(input.nextLine());

        //iteramos las filas
        for (int fila = 1 ;fila <=filas;fila++){
            String espacioBlanco = " ".repeat(filas -fila);
            //esto es si le ponemos 3 filas seria 3 -1 = 2 entonces rellena en blanco 2 caracteres//
            //     --*  2 espacios en blanco
            //      *** 3-2=1 1 espacio en blanco
            //     *****

            String asteriscos = "*".repeat(2*fila-1);
            //     --*  2*1-1=1
            //     -***  2*2-1=3
            //     ***** 2*3-1=5
            //

            System.out.println(espacioBlanco+asteriscos);
        }
    }
}
