package Exercicio3;

public class operacaoMatematica {
  public int numero;


  public void status() {
    System.out.println(" O numero escolhido é: " + this.numero);
  }
  public void ParOuImpar(int numero) {
if((this.numero % 2) == 0) {
      System.out.println(" O numero: " + this.numero + " é par");

}else{
      System.out.println(" O numero: " + this.numero + " é impar");

}
  }
  

  public void NegativoOuPositivo(int numero) {
    if (this.numero > 0) {
      System.out.println(" O numero: " + this.numero + " é positivo");
    } else {
      System.out.println(" O numero: " + this.numero + " é negativo");
      
    }
  }
  
}
