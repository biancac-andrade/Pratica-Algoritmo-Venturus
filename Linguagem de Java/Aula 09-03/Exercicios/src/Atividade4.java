public class Atividade4 {
  public static void main(String[] args) {
    int matriz[][] = new int[3][3];
    int soma = 0;

    //Laço responsável por preencher a matriz com números quaisquer
    for( int linha = 0; linha < matriz.length; linha++) {
      for( int coluna = 0; coluna < matriz[linha].length; coluna++) {
        //Gera um numero qualquer para a matriz
        matriz[linha][coluna] = linha * coluna;
      }
    }

    //Laço responsável por efetuar a soma de todos os valores presentes na matriz
    for( int linha = 0; linha < matriz.length; linha++) {
      for( int coluna = 0; coluna < matriz[linha].length; coluna++) {
        soma += matriz[linha][coluna];
      }
    }

    System.out.println(soma);
  }
  
}
