package Atividade2;

public class Triangulo implements ControleForma {
  
  private double base;
  private double altura;
  private double ladoA;
  private double ladoB;
  private double ladoC;



  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getLadoA() {
    return ladoA;
  }

  public void setLadoA(double ladoA) {
    this.ladoA = ladoA;
  }

  public double getLadoB() {
    return ladoB;
  }

  public void setLadoB(double ladoB) {
    this.ladoB = ladoB;
  }

  public double getLadoC() {
    return ladoC;
  }

  public void setLadoC(double ladoC) {
    this.ladoC = ladoC;
  }

  @Override
  public void getNomeFigura() {
    System.out.println("Triangulo: ");
  }
  
  @Override
  public void getArea() {

    double area = (base * altura) / 2;
    System.out.println(" A area do triangulo é: " + area);

  }

  @Override
  public void getPerimetro() {
    double perimetro = ladoA + ladoB + ladoC;
    System.out.println(" O perimetro do triangulo é : " + perimetro);
  }
}
