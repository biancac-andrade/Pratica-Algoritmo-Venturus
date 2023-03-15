import java.util.Scanner;

public class Exemplo8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Entre com um numero de 1 a 7: ");
        int x  = entrada.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = " terça";
                break;
            case 4:
                dia = " quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sexta";
                break;
            default:
                dia = "desconhecido";
                break;

        }
        System.out.println(" o dia da semana é: " + dia);
    }
}
