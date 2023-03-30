package Exercicio1;

public class ContaJuridica extends Conta {

  private double limiteEmprestimo;


  public double getLimiteEmprestimo() {
    return limiteEmprestimo;
  }

  public void setLimiteEmprestimo(double limiteEmprestimo) {
    this.limiteEmprestimo = limiteEmprestimo;
  }


  public void emprestimo() {
    if (statusConta == true) {
      if (saldo != 0) {
        System.out.println("Voce realizar emprestimo");
        System.out.println("Qual valor do emprestimo?");
        double valor = entrada.nextDouble();

        double limite = valor * 4;

        if (limite <= saldo) {
          System.out.println("Emprestimo permitido");
          System.out.println("Foi descontado a taxa de emprestimo R$10, 00");
          this.saldo -= 10;
        } else {
          System.out.println("Emprestimo não permitido, pois o valor é maior que o limite de 4x do seu saldo");
          
        }

        System.out.println("Saldo atual: " + saldo);

      }else{
          System.out.println("VOce não pode sacar, pois não tem dinheiro na conta");
      }
    }else{
      System.out.println("Voce não pode sacar pois não tem conta aberta");

    }
  }
  
}
