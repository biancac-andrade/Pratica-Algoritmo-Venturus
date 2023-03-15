import java.util.Scanner;

public class Exemplo6 {
  public static void main(String[] args) {
      int M[][] = new int[3][4];
    Scanner entrada = new Scanner(System.in);

    for(int i=0; i <3; i++) {
      for(int j=0; j <4; j++) {
        System.out.println("M[" + i + "]" + "M[" + j + "]");
        M[i][j] = entrada.nextInt();
      }
    }
    for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
      System.out.print("Elemento: " + M[i][j]);
    }
  }
}
}
