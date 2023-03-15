import javax.swing.JOptionPane;

public class Atividade4ex2 {
  public static void main(String[] args) {
int mat[][] = new int[4][3];
        int vet[] = new int[3];

        System.out.println("Matriz");

        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                String valor = JOptionPane.showInputDialog(null, "Informe o valor");
                int v = Integer.parseInt(valor);
                mat[i][j] = v;
                System.out.print(v + " ");
            }
        }

        System.out.println(" ");
        System.out.println(" ");

        int soma;

        // Loop para percorrer as colunas
        for (int j = 0; j < 3; j++) {
            soma = 0;

            // Loop para percorrer as linhas
            for (int i = 0; i < 4; i++) {
                soma = soma + mat[i][j];
            }

            // Print da soma de cada coluna
            System.out.printf("Soma da coluna %d: %d\n", j, soma);
            
            // Armazenamento da soma
            vet[j] = soma;
        }

}
  }

