import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      String nome;
      int agencia, conta;
      
      try (Scanner entrada = new Scanner(System.in)) {
        System.out.println("Digite o nome do correntista: ");
        nome = entrada.next();
        System.out.println("Digite a sua agencia do banco");
        agencia = entrada.nextInt();

        System.out.println("Digite sua conta corrente de banco:  ");
        conta = entrada.nextInt();
      }
      System.out.println(" -----------DADOS------------ ");
      System.out.println("Nome do correntista:  " + nome);
      System.out.println("Sua agencia: " + agencia);
      System.out.println("Sua conta: " + conta);

    }
}

