package Atividade2;

public class Quadrado implements ControleForma {
  private double lado;

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  
  @Override
  public void getNomeFigura() {
    System.out.println("Quadrado: ");
  }
  
  @Override
  public void getArea() {

    double area = Math.pow(lado, lado);
    System.out.println(" A area do quadrado é: " + area);

  }

  @Override
  public void getPerimetro() {
    double perimetro = 4 * lado;
    System.out.println(" O perimetro do quadrado é : " + perimetro);
  }
}
