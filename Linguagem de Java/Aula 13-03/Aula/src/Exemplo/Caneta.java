package Exemplo;

public class Caneta {
  String modelo, cor;
  float ponta;
  int carga;
  boolean tampada;

  void status() {
    String cor = "roxo";
    System.out.println("modelo:" + this.modelo);
    System.out.println("Cor:" + this.cor);
    System.out.println("Tamanho da ponta: " + this.ponta);
    System.out.println("% da carga: " + this.carga);
    System.out.println("Esta tampada? " + this.tampada);
  }

  void rabiscar() {
    if (tampada == true) {
      System.out.println("Desculpa, não dá pra rabiscar!");
    } else {
      System.out.println("Rabiscando...");
    }

  }
  

  void tampar() {
    this.tampada = true;
  }

  void destampar() {
    this.tampada = false;
  }
}
