public class Atividade4ex3 {
  public static void main(String[] args) {
    


    int l, c, soma;
    int mat[][] = new int[3][3];
    int somaLinhas[] = new int[3];
    int  somaColunas[] = new int[3];
    
    


    // preenche a matriz
    for(l = 0; l < 3; l++){
        for(c = 0; c < 3; c++){
            mat[l][c] = (int)(Math.random() * 100 );
        }
    }

    // letra b) soma das linhas
    for(l = 0; l < 3; l++){
        soma = 0;
        for(c = 0; c < 3; c++){
            soma += mat[l][c];
        }
        somaLinhas[l] = soma;
    }

    // letra c) soma das colunas
    for(c = 0; c < 3; c++){
        soma = 0;
        for(l = 0; l < 3; l++){
            soma += mat[l][c];
        }
        somaColunas[c] = soma;
    }

    // impressão das estruturas
     System.out.println("\nMatriz:\n");
    for(l = 0; l < 3; l++){
        for(c = 0; c < 3; c++){
             System.out.printf("%2d ", mat[l][c]);
        }
         System.out.println("\n");
    }

     System.out.println("\n\nVetor com a soma das linhas:\n");
    for(l = 0; l < 3; l++){
         System.out.printf("Linha %d: %d\n", l, somaLinhas[l]);
    }

     System.out.println("\n\nVetor com a soma das colunas:\n");
    for(c = 0; c <3; c++){
         System.out.printf("Coluna %d: %d\n", c, somaColunas[c]);
    }


}
  }

