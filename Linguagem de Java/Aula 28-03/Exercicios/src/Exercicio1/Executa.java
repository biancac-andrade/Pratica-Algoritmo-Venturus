package Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executa {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Quantos funcionários você quer cadastrar?");
    int qtdFuncionario = entrada.nextInt();

    System.out.println("  4");

    List<Funcionario> list = new ArrayList<>();

    for (int i = 0; i <= qtdFuncionario; i++){
                System.out.println(i);
   }

  }
}
