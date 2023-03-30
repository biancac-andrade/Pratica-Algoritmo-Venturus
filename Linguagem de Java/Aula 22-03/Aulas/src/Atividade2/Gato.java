package Atividade2;

public class Gato extends Animal{
  
  @Override
  public void falar() {
    System.out.println(" Miau..Miau");
  }


  @Override
  public void comer() {
    if (fome = true) {
      System.out.println("Quero comida");
      System.out.println("Racao e leite..Racao e leite");
    } else {
      System.out.println("Não estou com fome!");
    }
  }
}
