package Exercicio3;

public class Executa {
  public static void main(String[] args) {
    
    Salario s1 = new Salario();
    s1.aumento = 1.5;
    s1.salario = 2000;
    s1.ano = 2016;
    s1.status();
    s1.calculoAumento();
    System.out.println(" ");
  }
  
}
