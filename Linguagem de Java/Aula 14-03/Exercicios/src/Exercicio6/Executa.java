package Exercicio6;

public class Executa {
  
  public static void main(String[] args) {
    
    Funcionario f1 = new Funcionario();
    f1.nome = "Fabiana";
    f1.salarioBruto = 1600;
    f1.imposto = 1.6;
    f1.salarioLiquido();
    f1.aumentoSalario();
    f1.statusAtualizado();
    System.out.println(" ");
  }
}
