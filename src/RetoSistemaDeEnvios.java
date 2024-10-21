import java.util.Scanner;

public class RetoSistemaDeEnvios {
    public static void main(String[] args) {

        double tarifas = 0;
        String resultado = "";
        System.out.println("Sistema de envios");
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa el destino del paquete (nacional/internacional)");
        String destino = input.nextLine().toLowerCase().strip();
        System.out.println("ingresa el peso del paquete en kg ");
        double peso = Double.parseDouble(input.nextLine().toLowerCase().strip());

        tarifas = switch (destino){
            case "nacional"-> {
                yield  10 * peso;
            }
            case "internacional"->{
                yield 20 *peso;
            }
            default -> {
                resultado= "Informacion no valida";
                yield 0;
            }
        };

        System.out.printf("""
                El envio fue  %s
                El costo del envio del paquete es : %.2f
                %s
                """,destino,tarifas,resultado);



    }
}
