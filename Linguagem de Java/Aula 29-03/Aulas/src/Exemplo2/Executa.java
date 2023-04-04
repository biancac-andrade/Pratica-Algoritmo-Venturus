package Exemplo2;

import java.util.Scanner;

public class Executa {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    // ServicoImpressaoString ps = new ServicoImpressaoString();

   ServicoImpressao ps = new ServicoImpressao();  
    System.out.println("Quantidade? ");
    int n = entrada.nextInt();


    for (int i = 0; i < n; i++) {
      System.out.println("escolhe os valores");
      // String value = entrada.next();
      int value = entrada.nextInt();
      ps.adicionarValor(value);
    }

    ps.imprime();
    System.out.println("Primeiro: " + ps.primeiro());
    entrada.close();
  }
}
