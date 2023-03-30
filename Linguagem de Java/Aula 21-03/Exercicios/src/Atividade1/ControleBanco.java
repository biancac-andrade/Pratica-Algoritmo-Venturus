package Atividade1;

public interface ControleBanco {

  public abstract void status();
  public abstract void abrirConta();
  public abstract void fecharConta();
  public abstract void depositar(int saldo);
  public abstract void sacar();
  public abstract void pagarMensal(int saldo);


}
