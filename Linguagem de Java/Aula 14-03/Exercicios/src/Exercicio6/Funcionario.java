package Exercicio6;

public class Funcionario {
  String nome;
  double salarioBruto, salarioAumento;
  double imposto;


  void salarioLiquido() {
    System.out.println(" O nome do funcionario: " + this.nome);
    System.out.println(" O salario bruto do funcionario: " + this.salarioBruto);
    System.out.println("O valor do imposto do funcionario: " + this.imposto);
  }
  
  void aumentoSalario() {
   salarioAumento = salarioBruto + (salarioBruto * imposto / 100);
    // salarioAumento = salario * 2;

    System.out.println("O seu aumento foi: " + salarioAumento);

  }
  
  void statusAtualizado() {
    System.out.println(" O nome do funcionario: " + this.nome);
    System.out.println(" O salario lidquido apos aumento  do funcionario: " + salarioAumento);
    System.out.println("O valor do imposto do funcionario para aumento: " + this.imposto);
  }
}
