package Exercicio2;

public class Retangulo implements ControladorArea {
  
  private double largura;
  private double altura;


  public double getLargura() {
    return largura;
  }

  public void setLargura(double largura) {
    this.largura = largura;

  }
  
  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  @Override
  public void area() {
    double area = largura * altura;
    System.out.println(" A area do retangulo é : " + area);
  }
}
