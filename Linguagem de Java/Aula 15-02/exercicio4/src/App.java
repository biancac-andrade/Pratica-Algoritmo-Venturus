import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      String nome;
      int idade;
      double n1, n2, n3, n4, media;
      
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite o nome do aluno: ");
      nome = entrada.next();
      System.out.println("Digite a idade do aluno ");
      idade = entrada.nextInt();

      System.out.println("Digite primeira nota bimestral ");
      n1 = entrada.nextDouble();
      System.out.println("Digite segunda nota bimestral ");
      n2 = entrada.nextDouble();
       System.out.println("Digite terceira nota bimestral ");
       n3 = entrada.nextDouble();
       System.out.println("Digite quarta nota bimestral ");
      n4 = entrada.nextDouble();



      media  = ( n1 + n2 + n3 + n4) / 4;
      
      System.out.println("Nome do aluno:  " + nome);
      System.out.println("Idade do Aluno: " + idade);
      System.out.printf("As notas bimestrais do aluno %s são %.2f ,  %.2f ,  %.2f ,  %.2f   :  ", nome, n1, n2 ,n3 , n4);
       System.out.println(" A media do Aluno: " + media);

    }
}
