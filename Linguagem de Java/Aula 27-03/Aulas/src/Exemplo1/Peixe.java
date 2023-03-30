package Exemplo1;

public class Peixe extends Animal {
  
  private String corScama;

  @Override
  public void locomover() {
    System.out.println("Nadando...");
  }
  
  @Override
  public void alimentar() {
    System.out.println(" Comendo substancias...");
  }

  @Override
  public void emitirSom() {
    System.out.println(" Peixe não faz som...");
  }

  public void soltarBolha() {
    System.out.println("Soltando bolha...");
  }
  
  public String getCorScama() {
    return corScama;
  }

  public void setCorScama(String corScama) {
    this.corScama = corScama;
  }
}
