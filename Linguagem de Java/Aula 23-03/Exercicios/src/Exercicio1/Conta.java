package Exercicio1;

import java.util.Scanner;


public class Conta {

  Scanner entrada = new Scanner(System.in);

  private String nomeDono;
  public int numConta;
  protected boolean statusConta;
  protected double saldo;

  public String getNomeDono() {
    return nomeDono;
  }
  
  public void setNomeDono(String nomeDono) {
    this.nomeDono = nomeDono;
  }


  public int getNumConta() {
    return numConta;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }



  public boolean isStatusConta() {
    return statusConta;
  }

  public void setStatusConta(boolean statusConta) {
    this.statusConta = statusConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

// public void status() {
//   System.out.println("Nome do usuario " + this.getNomeDono());
//   System.out.println("Numero da Conta " + this.getNumConta());
//   System.out.println("O Saldo da sua conta " + this.getSaldo());
//   System.out.println("Status da sua Conta " + this.isStatusConta());
// }


  public void depositar(int saldo) {

    if (statusConta == true) {
      System.out.println("VOce pode depositar");
      this.saldo += saldo;
      System.out.println("Saldo atual: " + saldo);
    }else{
      System.out.println("Voce não pode depositar");

    }

  }
  public void sacar() {
    if (statusConta == true) {
      if (saldo != 0) {
        System.out.println("VOce pode sacar pois tem dinheiro na conta");
        System.out.println("Qual valor?");
        double valor = entrada.nextDouble();
        this.saldo -= valor;
        System.out.println("Foi descontado a taxa de saque R$5, 00");

        this.saldo -= 5;

        System.out.println("Saldo atual: " + saldo);

      }else{
          System.out.println("VOce não pode sacar, pois não tem dinheiro na conta");
      }
    }else{
      System.out.println("Voce não pode sacar pois não tem conta aberta");

    }
}

  @Override
  public String toString() {
    return "Conta{ " + " Nome=" + nomeDono + ", numero da conta=" + numConta + ",  saldo = " + saldo + " }";
  }

}
