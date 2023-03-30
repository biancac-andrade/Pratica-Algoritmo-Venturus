package Exercicio1;

import java.util.Locale;

public class Executa {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    // Scanner entrada = new Scanner(System.in);

    ContaBanco b1 = new ContaBanco();
    b1.setNomeDono(" João da Silva");
    b1.setTipoConta("CC");
    b1.setNumConta(0001);
    b1.setStatusConta(true);
    b1.depositar(300);
    b1.pagarMensal(0);
    b1.sacar(20);
    b1.abrirConta();
    b1.fecharConta();
    b1.status();
    System.out.println(" ");

ContaBanco b2 = new ContaBanco();
    b2.setNomeDono(" Maria da Silva");
    b2.setTipoConta("CP");
    b2.setNumConta(0002);
    b2.setStatusConta(true);
    b2.depositar(400);
    b2.pagarMensal(0);
    b2.sacar(20);
    b2.abrirConta();
    b2.fecharConta();
    b2.status();
    System.out.println(" ");

  }
  
}
