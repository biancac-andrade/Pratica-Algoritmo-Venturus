package Atividade1;

public class Atividade1 {
  public static void main(String[] args) {
    Motor meumotor = new Motor();
    meumotor.gasolina = 0;
    meumotor.Ligar();
    System.out.println(" O estado do motor é: " + meumotor.Ligado);
  }
  
}
