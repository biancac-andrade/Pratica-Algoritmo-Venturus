package Exercicio2;

import java.util.Scanner;

public class Executa {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Qual forma quer sabe area?");
    System.out.println(" [1] - Retangulo");
    System.out.println(" [2] - Circulo");
    int opcao = entrada.nextInt();

    System.out.println("Qual cor para sua forma?");
    System.out.println("  Black");
    System.out.println("  Blue");
    System.out.println("  Red");
    String cor = entrada.next();

    if (opcao == 1) {
      
      Retangulo r1 = new Retangulo();
      System.out.println(" A Cor do seu retangulo é: " + cor);
      r1.setAltura(3);
      r1.setLargura(4);
      r1.area();
    } else {
      
      Circulo c1 = new Circulo();
      System.out.println(" A Cor do seu circulo é: " + cor);

      c1.setRaio(8.9);
      c1.area();
    }
  }
  
}
