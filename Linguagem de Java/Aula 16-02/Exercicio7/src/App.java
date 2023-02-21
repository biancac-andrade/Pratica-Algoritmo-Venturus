import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
      
      int cod1, qtd1, cod2, qtd2;
      double valorUnit1,valorUnit2, valorPagar;

      Scanner entrada = new Scanner(System.in);
      System.out.println("Qual codigo da peça 1? ");
      cod1 = entrada.nextInt();

       System.out.println("Qual a quantidade da peça 1? ");
       qtd1 = entrada.nextInt();
      
      System.out.println("Qual o valor unitario peça 1? ");
      valorUnit1= entrada.nextDouble();


      System.out.println("Qual codigo da peça 2? ");
      cod2 = entrada.nextInt();

      System.out.println("Qual a quantidade da peça 2? ");
      qtd2 = entrada.nextInt();
      
      System.out.println("Qual o valor unitario peça 2? ");
      valorUnit2 = entrada.nextDouble();
      
      valorPagar = ((qtd1 * valorUnit1) + (qtd2 * valorUnit2));


      System.out.printf(" Entrada:  %d, %d, %.2f  %n %d, %d, %.2f   Saída: VALOR A PAGAR: R$ %.2f ", cod1, qtd1,
          valorUnit1, cod2, qtd2, valorUnit2, valorPagar);

    }
}
