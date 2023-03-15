public class Atividade2 {
  public static void main(String[] args) {
    int matriza[][] = { { 1, 2 }, { 4, 5 } };
    int matrizb[][] = { { 7, 8 }, { 10, 11 } };

    int matrizsoma[][] = new int[2][2];
    int matrizmulti[][] = new int[2][2];

    // 

    for (int i = 0; i < matriza.length; i++) {
      for (int j = 0; j < matriza[i].length; j++) {
        matrizsoma[i][j] = matriza[i][j] + matrizb[i][j];
      }
    }
    
  }
}
