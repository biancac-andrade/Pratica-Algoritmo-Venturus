package Atividade3;

public class Linguagem implements ControleLinguagem {
  

  public String nome;
  public String linguagem;
  public double experiencia;


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLinguagem() {
    return linguagem;
  }

  public void setLinguagem(String linguagem) {
    this.linguagem = linguagem;
  }

  public double getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(double experiencia) {

    this.experiencia = experiencia;
  }
  

  @Override
  public void pessoa() {
    System.out.println("Nome: " + nome);
  }
  
@Override
public void linguagemProgramacao() {
  System.out.println(" Trabalha com a linguagem: " + linguagem);
}

  @Override
  public void experiencia() {
    System.out.println("Experiencia na área: " + experiencia + " anos");
  }
}
