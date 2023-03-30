package Exemplo1;

public class Executa {
  public static void main(String[] args) {
    // programa principal

    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();


    p1.setNome("Jose");
    p2.setNome("Maria");
    p3.setNome("Joao");
    p4.setNome("Eliz");


    p1.setSexo("M");
    p2.setSexo("F");
    p2.setIdade(18);

    p2.setCurso("Informatica");
    p3.setSalario(25000.75f);
    p4.setSetor("Estoque");

    // p1.receberAumento(550.20f);
    // p3.mudarTrabalho();

    // p2.mudarTrabalho();
    p4.mudarTrabalho();

      System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
  }
  
}
