public class Atividade1 {
  public static void main(String[] args) {
    int[] vetor = {1, 2, 3, 4};  // vetor ja com valores preenchidas
    int num = 10;   //inicia variavel soma com 10

    for (int i = 0; i < vetor.length; i++) {
      num = num + vetor[i]; // soma o valor num com o vetor
      System.out.println("Elemento " + i + ": " + num);
    }


  }
  
}
