package Exercicio2;

public class Circulo implements ControladorArea {

  private double raio;

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }
  
  @Override

  public void area() {
    double area = 3.14 * Math.pow(raio, raio);
    System.out.println(" A area do Circulo é : " + area);
  }

  
}
