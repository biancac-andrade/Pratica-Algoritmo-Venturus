import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        double salario = entrada.nextDouble();
        System.out.println("Digite o valor do financiamento que deseja: ");
        double finan = entrada.nextDouble();
        double concede;

        concede = salario * 5;

        if(finan <= concede){
            System.out.println("Financiamento concedido");

        }else{
            System.out.println("Financiamento negado");

        }
        System.out.println("Obrigada por nos consultar");
        entrada.close();
    }
}
