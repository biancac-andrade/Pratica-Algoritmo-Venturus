package Exercicio4;

public class Executa {
  public static void main(String[] args) {

    Radio r1 = new Radio();
    r1.massaInicial = 90.0;
    r1.massaFinal = 120;
    r1.status();
    r1.calculaMassaTempo();
    r1.calculaTempo();
    System.out.println(" ");
  }
  
}
