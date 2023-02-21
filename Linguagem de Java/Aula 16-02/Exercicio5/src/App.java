import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      int a, b, c, d, diferenca;

    
      Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu 1 valor? ");
        a = entrada.nextInt();

         System.out.println("Qual o seu 2 valor? ");
        b = entrada.nextInt();

         System.out.println("Qual o seu 3 valor? ");
        c = entrada.nextInt();

         System.out.println("Qual o seu 4 valor? ");
        d = entrada.nextInt();
      
      
      diferenca = (a * b - c * d);

      System.out.printf(" Entrada:  %d, %d, %d, %d   Saída: DIFERENCA =  %d  %n ", a,b,c,d,diferenca);
    }
}

