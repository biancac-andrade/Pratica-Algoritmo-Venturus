package Atividade1;

import java.util.Scanner;

public class ContaBanco implements ControleBanco {

  Scanner entrada = new Scanner(System.in);

  String nomeDono;
  public int numConta;
  protected String tipoConta;
  private boolean statusConta;
  private double saldo;

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

  public String getTipoConta() {
    return tipoConta;
  }

  public void setTipoConta(String tipoConta) {
    this.tipoConta = tipoConta;
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

@Override
public void status() {
  System.out.println("Nome do usuario " + this.getNomeDono());
  System.out.println("Tipo de Conta " + this.getTipoConta());
  System.out.println("Numero da Conta " + this.getNumConta());
  System.out.println("O Saldo da sua conta " + this.getSaldo());
  System.out.println("Status da sua Conta " + this.isStatusConta());
}
  
  @Override
  public void abrirConta() {
    if( statusConta == true){
        System.out.println("Voce já possui uma conta, vamos continuar ");
      } else {
      if(tipoConta.equals("CC")){
        System.out.println("Voce ganhou R$ 50,00 por abrir nova conta corrente");
        this.saldo += 50;
      System.out.println(" Obrigada por abrir conosco, o seu saldo atual é: " + saldo);
    } else {
      System.out.println("Voce ganhou R$ 150,00 por abrir nova conta poupança");
      this.saldo += 50;
      System.out.println(" Obrigada por abrir conosco, o seu saldo atual é: " + saldo);
    }
    }
    
  }
@Override
  public void fecharConta() {
    if (saldo == 0) {
      System.out.println("Voce confirma em fechar conta?");
    } else {
      System.out.println("Não é possivel fechar a conta, pois vocÊ tem saldo na sua conta.");
    }

  }
  
  @Override

  public void depositar(int saldo) {

    if (statusConta == true) {
      System.out.println("VOce pode depositar");
      this.saldo += saldo;
      System.out.println("Saldo atual: " + saldo);
    }else{
      System.out.println("Voce não pode depositar");

    }

  }
  @Override
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
  
  public void pagarMensal(int saldo) {

    
      if(tipoConta.equals("CC")){
        System.out.println("Voce irá pagar a taxa de R$ 12, 00 de conta corrente");
        this.saldo -= 12;
        System.out.println(" Obrigada por pagar a taxa, o seu saldo atual é: " + this.saldo);
      
    } else {
      System.out.println("Voce irá pagar a taxa de R$ 20, 00 de conta poupança");    
      this.saldo -= 20;
      System.out.println(" Obrigada por pagar a taxa, o seu saldo atual é: " + this.saldo);
      
  }

  }
}
