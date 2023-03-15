import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Escolhe um numero da categoria do que quer doar: ");
        System.out.println("[1]  para doar R$10");
        System.out.println("[2]  para doar R$25");
        System.out.println("[3]  para doar R$50");
        System.out.println("[4]  para doar outros valores");
        System.out.println("[5]  para cancelar");
        int opcao = entrada.nextInt();

        switch (opcao){
            case 1:
                System.out.println("O valor escolhido é R$ 10, 00, muito obrigada");
                break;
            case 2:
                System.out.println("O valor escolhido é R$ 25, 00, muito obrigada");
                break;
            case 3:
                System.out.println("O valor escolhido é R$ 50, 00, muito obrigada");
                break;
            case 4:
                System.out.println("Digite qual valor quer doar? ");
                double valor = entrada.nextDouble();
                System.out.printf("O valor escolhido é R$  %.2f, muito obrigada", valor);
                break;
            case 5:
                System.out.println("Voce cancelou a doação, não tem problema volta sempre!");
                break;

        }
    }

}
