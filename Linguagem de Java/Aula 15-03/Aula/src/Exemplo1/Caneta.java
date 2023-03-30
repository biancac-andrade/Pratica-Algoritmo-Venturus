package Exemplo1;

public class Caneta {

  public String modelo, cor;
  public float ponta;
  protected int carga;
  private boolean tampada;

  public void status() {
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Cor: " + this.cor);
    System.out.println("Tamanho da ponta: " + this.ponta);
    System.out.println("% da carga: " + this.carga);
    System.out.println(" Esta tampada " + this.tampada);
  }
    
  public void escrever() {
    if (tampada == true) {
      System.out.println(" Sorry, não posso Escrever...");
    } else {
      System.out.println("Estou escrever....");
    }
  }

  public void rabiscar() {
    if (tampada == true) {
      System.out.println(" So rry, não posso rabiscar...");
    } else {
      System.out.println("Estou rabiscando... ");
    }
  }

  public void tampar() {
    this.tampada = true;
  }

  public void destampar() {
    this.tampada = false;
  }
  
}
