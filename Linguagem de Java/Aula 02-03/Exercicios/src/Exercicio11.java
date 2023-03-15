import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolhe um numero x: ");
        double x = entrada.nextDouble();

    if( x < 25){
        System.out.println("está dentro do intervao de [0, 25] ");
    }else if( x >= 25 && x< 50){
        System.out.println("está dentro do intervao de [25, 50] ");
    } else if (x >= 50 && x < 75) {
        System.out.println("está dentro do intervao de [50, 75] ");
    } else if (x >= 75 && x <100) {
        System.out.println("está dentro do intervao de [75, 100] ");
    }

    }
}
