import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      int anoAtual, anoNasc, idade;
    
      Scanner entrada = new Scanner(System.in);
      System.out.println("Qual o ano atual hoje? ");
      anoAtual = entrada.nextInt();

       System.out.println("Qual o seu ano de nascimento? ");
       anoNasc = entrada.nextInt();
      
       idade = anoAtual - anoNasc;

       System.out.printf(" Você tem  %d anos ", idade);
    }
}
