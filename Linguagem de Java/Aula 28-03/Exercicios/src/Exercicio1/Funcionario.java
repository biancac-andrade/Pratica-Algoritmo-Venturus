package Exercicio1;

public class Funcionario extends Pessoa {
  
  public void pagamento() {
    
    double pagamento = horas * valorPorHora;
    
    System.out.println("Pagamento do funcionário: " + pagamento);

  }
}
