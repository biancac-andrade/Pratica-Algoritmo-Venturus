package Exercicio2;

public class Executa {
  public static void main(String[] args) {
    
    Carro c1 = new Carro();
    c1.setCor("Amarelo");
    c1.setMarca("Fiat");
    c1.setAno(1998);
    c1.setMarcha(0);
    c1.setLigado(false);
    c1.setVelocidadeAtual(30);
    c1.setVelocidadeMaxima(0);
    c1.status();
    c1.isLigado();
    c1.desligar();
    c1.acelerar(10);
    c1.acelerar(10);
    c1.acelerar(10);
    c1.acelerar(10);
    c1.pegarMarcha(30);
  }
  
}
