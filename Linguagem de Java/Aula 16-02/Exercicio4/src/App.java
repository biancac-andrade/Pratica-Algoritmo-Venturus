import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      double raio, area;
    
      try (Scanner entrada = new Scanner(System.in)) {
        System.out.println("Qual o raio do seu circulo? ");
        raio = entrada.nextDouble();
      }
      area = (3.14159) * Math.pow(raio, 2);

      System.out.printf(" Entrada:  %.2f  Saída: A =  %.2f  %n ", raio, area);
       System.out.printf(" Entrada:  %.2f  Saída: A =  %.4f ", raio, area );
    }
}
