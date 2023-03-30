package Exercicio1;

public class Area {

  double base, altura, area;

  void status() {
    System.out.println("Escolha o valor da altura e base do triangulo");
    System.out.println(" Valor da base: " + this.base);
    System.out.println(" Valor da altura: " + this.altura);
  }
  
  void calculaArea() {
    area = (base * altura) / 2;
    System.out.println( "A área do triangulo é: " + area);
  }
}
