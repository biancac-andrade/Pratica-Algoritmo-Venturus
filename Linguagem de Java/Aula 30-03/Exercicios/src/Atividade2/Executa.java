package Atividade2;

import java.util.Scanner;

public class Executa {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    ALuno a1 = new ALuno();
    System.out.println("Quantidade de Aluno da Sala A : ");
    int nA = entrada.nextInt();

    for (int i = 0; i < nA; i++) {
      int value = entrada.nextInt();
      a1.adicionaValor(value);
    }

    ALuno a2 = new ALuno();
    System.out.println("Quantidade de Aluno da Sala B: ");
    int nB = entrada.nextInt();

    for (int i = 0; i < nB; i++) {
      int value = entrada.nextInt();
      a2.adicionaValor(value);
    }

    ALuno a3 = new ALuno();
    System.out.println("Quantidade de Aluno da Sala C : ");
    int nC = entrada.nextInt();

    for (int i = 0; i < nC; i++) {
      int value = entrada.nextInt();
      a3.adicionaValor(value);
    }

    a1.qtd();
    a2.qtd();
    a3.qtd();

  }
}