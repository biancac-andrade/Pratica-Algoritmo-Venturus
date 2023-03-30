package Atividade2;

public class Executa {

  public static void main(String[] args) {
    
    Quadrado q = new Quadrado();
    q.setLado(3);
    q.getNomeFigura();
    q.getArea();
    q.getPerimetro();


    Triangulo t = new Triangulo();
    t.setBase(3);
    t.setAltura(5);
    t.setLadoA(2);
    t.setLadoC(6);
    t.getNomeFigura();
    t.getArea();
    t.getPerimetro();

  }
  
}
