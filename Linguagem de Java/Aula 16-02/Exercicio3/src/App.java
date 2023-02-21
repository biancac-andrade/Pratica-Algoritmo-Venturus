import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      int n1, n2, soma;
    
      Scanner entrada = new Scanner(System.in);
      System.out.println("Qual seu primeiro valor? ");
     n1 = entrada.nextInt();

       System.out.println("Qual seu segundo valor? ");
      n2= entrada.nextInt();
      
       soma =  n1 + n2;

       System.out.printf(" Entrada:  %d,  %d   Saída: SOMA =  %d", n1, n2, soma );
    }
}
