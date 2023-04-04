package Exemplo4;

import java.util.Scanner;

public class Executa {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    ServicoImpressao<String> ps = new ServicoImpressao<>();

    System.out.print("Quantidade? ");
    int n = entrada.nextInt();


    // ps.adicionaValor(20);

    for (int i = 0; i < n; i++) {
      String value = entrada.next();
      ps.adicionaValor(value);
    }

    ps.imprime();
    String x = ps.primeiro();
    System.out.println("Primero: " + x);
    entrada.close();
  }
}
