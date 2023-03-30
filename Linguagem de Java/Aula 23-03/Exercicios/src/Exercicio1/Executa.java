package Exercicio1;

public class Executa {
  public static void main(String[] args) {
    
    Conta c1 = new Conta();
    ContaJuridica c2 = new ContaJuridica();

    System.out.println(" ");

    c1.setNomeDono(" João da Silva");
    c1.setNumConta(  560001);
    c1.setStatusConta(true);
    c1.depositar(300);
    c1.sacar();
    System.out.println(" ");
    System.out.println(" ");


    c2.setStatusConta(true);
    c2.depositar(300);
    // c2.sacar();
    c2.emprestimo();
    System.out.println(" ");

  }
}
