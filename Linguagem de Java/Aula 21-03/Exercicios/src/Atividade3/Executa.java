package Atividade3;

public class Executa {
  public static void main(String[] args) {

    System.out.println(" ");

    
    Linguagem p1 = new Linguagem();
    p1.setNome("Maria");
    p1.setLinguagem("Python");
    p1.setExperiencia(15);
    p1.pessoa();
    p1.linguagemProgramacao();
    p1.experiencia();
    System.out.println(" ");


    Linguagem p2 = new Linguagem();
    p2.setNome("João");
    p2.setLinguagem("Java");
    p2.setExperiencia(10.0);
    p2.pessoa();
    p2.linguagemProgramacao();
    p2.experiencia();
    System.out.println(" ");


  }
  
}
