import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a hora inicial do jogo? ");
        double h1 = entrada.nextDouble();
        System.out.println("Qual a hora final do jogo?  ");
        double h2 = entrada.nextDouble();


        if (h1 > h2) {
            System.out.println("O JOGO DUROU " + (24 - (h1- h2)) + " HORA(S)");
        } else if (h2 > h1) {
            System.out.println("O JOGO DUROU " + (h2 - h1) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
