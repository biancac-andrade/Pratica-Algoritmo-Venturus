package Atividade1;

public class Motor implements ControleCarro {

  public boolean Ligado;
  public int gasolina;

  @Override
  public void Ligar() {
    boolean temGasolina = TemGasolina();

    if (temGasolina) {
      this.Ligado = true;
      System.out.println("o motor foi ligado. ");
    } else {
      System.out.println(" Não temos gasolina para ligar o motor. ");
    }
  }

  @Override

  public boolean TemGasolina() {
    if (this.gasolina > 0) {
      return true;
    } else {
      return false;
    }
  }
}
