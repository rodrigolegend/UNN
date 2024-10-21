import java.util.Scanner;

public class RetoSistemaDeCalificaciones97 {
    public static void main(String[] args) {
        System.out.println("sistema de calificaciones");
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa tu calificacion ");
        double nota = Double.parseDouble(input.nextLine());
        String notaS ;
        if (nota >=9 && nota <=10){
                notaS = "Felicidades obtuviste una :A";
        }else if(nota >=8 && nota <9){
            notaS = "Felicidades Obtuviste una B";
        }else if(nota >=7 && nota <8){
            notaS = "Felicidades Obtuviste una C";
        }else if(nota >=6 && nota <7){
            notaS = "Felicidades Obtuviste una D";
        }else{
            notaS = "Valor invalido";
        }
        System.out.printf("""
                Sistema de calificaciones
                nota ingresada : %.2f
                %s
                """,nota,notaS);
    }
}
