package Exercicio2;

public class Carro {
  
  public String cor;
  public String marca;
  public int ano;
  public int marcha;
  public boolean ligado;
  public double velocidadeAtual;
  public double velocidadeMaxima;


  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }
  
  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getMarcha() {
    return marcha;
  }

  public void setMarcha(int marcha) {
    this.marcha = marcha;
  }

  public boolean isLigado() {
    return ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public double getVelocidadeAtual() {
    return velocidadeAtual;
  }
  
  public void setVelocidadeAtual(double velocidadeAtual) {
    this.velocidadeAtual = velocidadeAtual;
  }

  public double getVelocidadeMaxima() {
    return velocidadeMaxima;
  }
  
  public void setVelocidadeMaxima(double velocidadeMaxima) {
    this.velocidadeMaxima = velocidadeMaxima;
  }


  public void status() {
  System.out.println(" Qual cor do carro: " + this.getCor());
  System.out.println("Qual marca do carro: " + this.getMarca());
  System.out.println(" Qual ano do carro: " + this.getAno());
  System.out.println(" Qual a marcha do carro: " + this.getMarcha());
  System.out.println("O carro está ligado? " + this.isLigado());
  System.out.println(" Qual a velocidade atual?  " + this.getVelocidadeAtual());
  System.out.println(" Qual a velocidade maxima? " + this.getVelocidadeMaxima());
}

public void ligar() {
  if (this.ligado == true) {
    System.out.println(" O carro já está ligado");
    
  }
    System.out.println(" O carro está sendo ligado");

  }
  
  public void desligar() {
    if (this.ligado == false) {
      System.out.println(" O carro já está desligado");
    }
    System.out.println(" O carro está sendo desligado");

  }
  
  public void acelerar(int velocidadeAtual) {
    this.velocidadeAtual += 10;
    System.out.println(" O carro está acelerando para velocidade de " + this.velocidadeAtual + " KM");    
  }
  
  public void pegarMarcha(int velocidadeAtual) {
    if (this.velocidadeAtual < 0) {
      this.marcha = -1;
      System.out.println(" A marcha está no ponto: " + this.marcha + " que está de ré");
    } else if (this.velocidadeAtual == 0) {
      this.marcha = 0;
      System.out.println(" A marcha está no ponto: " + this.marcha + " que está de ponto morto");
    } else if (this.velocidadeAtual < 40) {
      this.marcha = 1;
      System.out.println(" A marcha está no ponto: " + this.marcha + "  que é ponto medio");

    } else if (this.velocidadeAtual >= 40 && this.velocidadeAtual <= 80){
      this.marcha = 2;
      System.out.println(" A marcha está no ponto: " + this.marcha + "  que é ponto alto");

    } else{
      this.marcha = 3;
      System.out.println(" A marcha está no ponto: " + this.marcha + "  que é ponto maximo");

    }
  }
}
