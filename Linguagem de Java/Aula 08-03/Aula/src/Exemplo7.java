import java.util.Scanner;

public class Exemplo7 {
  
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.print("Entre com 3 número: ");
    int a = entrada.nextInt();
    int b = entrada.nextInt();
    int c = entrada.nextInt();

    if (a > b && a > c) {
      System.out.println("Maior = " + a);
    } else if (b > c) {
      System.out.println("Maior = " + b);
    } else {
      System.out.println("Maior = " + c);
    }
   entrada.close();
  }
}
