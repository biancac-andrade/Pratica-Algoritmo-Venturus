import java.util.Scanner;

public class Exercicio6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
    System.out.println("Digite um numero inteiro: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.printf("O seu numero: %d  numero ao quadrado:  %d   numero ao cubo: %d %n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
			
		}
		
		sc.close();
    
  }
  
}
