package SentenciaDecision;

public class Switch {
    public static void main(String[] args) {
        System.out.println("dia de la semana");
        int dia = 1; // 1 lunes 2 martes etc

        switch(dia){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7 :
                System.out.println("domingo");
            default:
                System.out.println("dia invalido");

        }


    }
}
