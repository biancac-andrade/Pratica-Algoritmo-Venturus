package Exercicio2;

public class Executa {
  public static void main(String[] args) {
    
    Conversor v1 = new Conversor();
    v1.cotacaoDolar = 6;
    v1.valorDolar = 789.5;
    v1.iof = 6;
    v1.status();
    v1.insere(v1.cotacaoDolar, v1.cotacaoDolar, v1.iof);
    v1.converte();
    System.out.println(" ");


  
  }
  
}
