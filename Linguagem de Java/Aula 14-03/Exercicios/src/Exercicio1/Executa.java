package Exercicio1;

public class Executa {
  public static void main(String[] args) {

  Area a1 = new Area();
  a1.base = 7;
  a1.altura = 5;
  a1.status();
  a1.calculaArea();
  System.out.println(" ");


  Area a2 = new Area();
  a2.base = 5;
  a2.altura = 3.4;
  a2.status();
  a2.calculaArea();
  System.out.println(" ");


  Triangulo t1 = new Triangulo();
  t1.a = 4;
  t1.b = 5;
  t1.c = 6;
  t1.status();
  t1.calculaArea();
  t1.descobreLado();
  System.out.println(" ");

  
  }
}
