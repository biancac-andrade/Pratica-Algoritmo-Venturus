import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      double a, b, area;
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite a base do triangulo retangulo: ");
      b = entrada.nextDouble();
      System.out.println("Digite a altura do triangulo retangulo: ");
      a = entrada.nextDouble();

      area = ( b* a) / 2;
      
      System.out.println("O valor da base é:  " + b);
      System.out.println("O valor da altura é " + a);
      System.out.println("Resultado da area do triangulo retangulo é:  " + area);

    }
}