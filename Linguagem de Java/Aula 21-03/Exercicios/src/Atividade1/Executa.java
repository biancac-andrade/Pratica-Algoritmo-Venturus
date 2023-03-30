package Atividade1;

public class Executa {
  public static void main(String[] args) {

    System.out.println(" ");


    ContaBanco b1 = new ContaBanco();
    b1.setNomeDono(" João da Silva");
    b1.setTipoConta(" CC");
    b1.setNumConta(  560001);
    b1.setStatusConta(true);
    b1.depositar(300);
    b1.sacar();
    System.out.println(" ");

    b1.status();

    System.out.println("  ");


  }
  
}
