package Exemplo3;

import java.util.Scanner;

public class Executa {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    ServicoImpressao ps = new ServicoImpressao();
    System.out.println("Quantidade: ");
    int n = entrada.nextInt();


    // ps.adcionarValor("Maria");

    for (int i = 0; i < n; i++) {
      int value = entrada.nextInt();
      ps.adicionaValor(value);
    }

    ps.imprime();
    int x = (int) ps.primeiro();
    System.out.print ("Primeiro: " + x);
    entrada.close();


    // int x = (int) ps.primeiro();
    // System.out.println("Primeiro: " + x);
  }
}
