package Atividade2;

public class Homem extends Animal {
  

  @Override
  public void falar() {
    System.out.println("Oi, eu sou humano!");
  }

  @Override
  public void comer() {
    if (fome == true) {
      System.out.println("Quero comida");
      System.out.println("Arroz, feijao, Carne e Salada");
    } else {
      System.out.println("Não estou com fome!! ");
    }
  }

  
}
