package Exercicio2;

public class Conversor {

  double cotacaoDolar;
  double valorDolar;
  double valorReais;
  double imposto, iof;
  

  void status() {
    System.out.println("O valor da cotação: " + this.cotacaoDolar);
    System.out.println("O valor de dolar a comprar: " + this.valorDolar);
    System.out.println(" O impost de IOF no momento é: " + this.iof);
  }
  
  
  void insere(double cotacaoRecebido, double dolarRecebido, double iofRecebido) {
    cotacaoDolar =  cotacaoRecebido;
    valorDolar = dolarRecebido;
    iof =  iofRecebido;
  }
  
  
  void converte() {
  

    valorReais = cotacaoDolar * valorDolar;
    imposto = iof  * valorReais;

    System.out.println( " O valor pago em reais será: " + valorReais);
    System.out.println(" O valor pago em reais com IOF será: " + imposto);
  }
}
