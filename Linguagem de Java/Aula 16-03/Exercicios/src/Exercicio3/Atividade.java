package Exercicio3;

public class Atividade {
  
  public static void main(String[] args) {
    
    System.out.println("O numero é par ou impar?");
    
    operacaoMatematica num = new operacaoMatematica();
    num.numero = 6;
    num.status();
    num.ParOuImpar(0);
    num.NegativoOuPositivo(0);
  }
}
