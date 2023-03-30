package Exercicio5;

public class Retangulo {

  double largura;
  double altura;

  double area, perimetro, diagonal;

  void status() {
    System.out.println("Valor de larguma e altura do retangulo");
    System.out.println("Valor da largura: " + this.largura);
    System.out.println("Valor da altura: " + this.altura);

  }

  void area() {
    area = largura * altura;
    System.out.println("O valor da sua area é: " + area );

  }
  
  void perimentro() {
    perimetro = (largura + altura) * 2;
    System.out.println("O valor do seu perimetro é: " +  perimetro);

  }

  void diagonal() {
    diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    System.out.println(" O valor da sua diagonal é: " + diagonal);
  }
}
