import java.util.Scanner;

public class RetoCalculadora117 {
    public static void main(String[] args) {
        System.out.println("Calculadora en java");
        boolean salir = false;
        double numeroUno = 0;
        double  numeroDos = 0;
        int opcion = 0;

        while (!salir) {
            Scanner input = new Scanner(System.in);
            System.out.printf("""
                    Operaciones que puedes realizar
                    1 Suma
                    2 Resta
                    3 Multiplicacion
                    4 Dividir
                    5 Salir
                    Elige una opcion : %d
                                     
                    """, opcion);
            opcion = Integer.parseInt(input.nextLine());

            if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                System.out.println("ingresa el primer numero");
                numeroUno = Double.parseDouble(input.nextLine());
                System.out.println("ingresa el segundo numero");
                numeroDos = Double.parseDouble(input.nextLine());
            } else {
                System.out.println("Saliendo del sistema");
                salir = true;
            }


            switch (opcion) {
                case 1 -> {
                    System.out.println("Suma");
                    double resultado = numeroUno + numeroDos;
                    System.out.println("el resultado de sumar " + numeroUno + " y numero " + "es :" + resultado);
                }
                case 2 -> {
                    System.out.println("Resta");
                    double resultado = numeroUno - numeroDos;
                    System.out.println("el resultado de restar  " + numeroUno + " y numero " + "es :" + resultado);

                }
                case 3 -> {
                    System.out.println("Multiplicar");
                    double resultado = numeroUno * numeroDos;
                    System.out.println("el resultado de Multiplicar  " + numeroUno + " y numero " + "es :" + resultado);

                }
                case 4 -> {
                    if(numeroDos !=0 ) { //para que no se compare con 0
                        System.out.println("Dividir");
                        double resultado = numeroUno / numeroDos;
                        System.out.println("el resultado de restar  " + numeroUno + " y numero " + "es :" + resultado);
                    }else{
                        System.out.println("no es posible dividir entre 0");
                    }
                }
                default -> {

                    salir = true;
                }
            }

        }
        }

    }

