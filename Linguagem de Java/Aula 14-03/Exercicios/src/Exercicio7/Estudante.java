package Exercicio7;

public class Estudante {
  String nome;
  double nota1, nota2, nota3, media;

  void status() {
    System.out.println(" Nome do Aluno: " + this.nome);
    System.out.println("A primeira nota do trimestre: " + this.nota1);
    System.out.println("A segunda nota do trimestre: " + this.nota2);
    System.out.println("A terceira nota do trimestre: " + this.nota3);
  }

  void mediaNota() {
    media = (nota1 + nota2 + nota3) / 2;
    System.out.println(" A media do aluno é: " + media);
  }

  void avaliaAprovacao() {
    if (media >= 7) {
      System.out.println(" Aluno está APROVADO!! ");
    } else if (media >= 5 && media <= 6) {
      System.out.println("Voce precisa de RECUPERAR nas notas, refazendo a prova com nota acima de 6");
    } else {
      System.out.println("Você está REPROVADO");
    }
  }

  
}
