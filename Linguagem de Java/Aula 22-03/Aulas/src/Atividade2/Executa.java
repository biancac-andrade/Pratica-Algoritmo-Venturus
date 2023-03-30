package Atividade2;

public class Executa {
  public static void main(String[] args) {


    System.out.println(" ");

    
    Gato g1 = new Gato();
    g1.setNome("prince");
    g1.setIdade(3);
    g1.fome = true;
    g1.falar();
    g1.comer();
    System.out.println(g1.toString());
    System.out.println("#############");
    System.out.println(" ");


    Cachorro c1 = new Cachorro();
    c1.setNome("Tobi");
    c1.setIdade(7);
    c1.fome = false;
    c1.falar();
    c1.comer();
    System.out.println(c1.toString());
    System.out.println("##################");
    System.out.println(" ");



    Homem h1 = new Homem();
    h1.setNome("Jose");
    h1.setIdade(35);
    h1.fome = true;
    h1.falar();
    h1.comer();
    System.out.println(h1.toString());
    System.out.println("#############################");
    System.out.println(" ");
  }
}
