import java.util.Scanner;

public class Exemplo8 {
  public static void main(String[] args) {

     Scanner entrada = new Scanner(System.in);
    System.out.print("Entre com 3 número: ");
    int a = entrada.nextInt();
    int b = entrada.nextInt();
    int c = entrada.nextInt();


    // exemplo de metodo
    int maior = max(a, b, c);
    mostrarResultado(maior);

   entrada.close();
  }
  
}
