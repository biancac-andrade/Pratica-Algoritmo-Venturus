package Exercicio1;

public class Pessoa implements ControlePagamento {

  private String nome;
  protected double horas;
  protected double valorPorHora;


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getHoras() {
    return horas;
  }

  public void setHoras(double horas) {
    this.horas = horas;
  }

  public double getValorPorHora() {
    return valorPorHora;
  }

  public void setValorPorHora(double valorPorHora) {
    this.valorPorHora = valorPorHora;
  }


  @Override
  public void pagamento() {
    System.out.println(" Tipo de Pagamentos: ");
  }
  
}
