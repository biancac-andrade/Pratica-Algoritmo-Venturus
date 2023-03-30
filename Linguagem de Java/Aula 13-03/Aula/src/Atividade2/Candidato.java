package Atividade2;

public class Candidato {
  String vaga, pessoaCandidata;
  double pretensaoSalarial;

  void status() {
    System.out.println("Nome do Candidato: " + this.pessoaCandidata);
    System.out.println("Vaga: " + this.vaga);
    System.out.println(" Pretensão Salarial " + this.pretensaoSalarial);
  }

  void enviarTesteTecnico() {
    if (vaga == "tecnologia") {
      System.out.println("Enviar TESTE de tecnologia para " + this.pessoaCandidata);
    }else{
    System.out.println("Enviar teste de Geral para: " + this.pessoaCandidata);
  }
  }
  
}
