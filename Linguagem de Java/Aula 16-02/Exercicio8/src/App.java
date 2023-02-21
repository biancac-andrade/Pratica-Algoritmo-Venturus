import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
      
     
      double a, b, c, areaTriang, areaCirc, areaTrap, areaQuad, areaRetan;

      Scanner entrada = new Scanner(System.in);
      System.out.println("Qual o primeiro valor? ");
     a = entrada.nextDouble();

     
      System.out.println("Qual o segundo valor? ");
    b = entrada.nextDouble();


      System.out.println("Qual o terceiro valor? ");
     c = entrada.nextDouble();

           
      areaTriang = (a * c) / 2;
      areaCirc = (3.14159) * Math.pow(c, 2);

      areaTrap = ((a + b) * c) / 2;
      areaQuad =  Math.pow(b, 2);
      areaRetan = a * b;


      System.out.printf(" Entrada: %.2f, %.2f, %.2f  Saída: TRIANGULO: %.4f  %n CIRCULO: %.4f  %n  TRAPEZIO: %.4f %n  QUADRADO: %.4f  %n  RETANGULO:  %.4f %n", a, b, c, areaTriang, areaCirc, areaTrap, areaQuad, areaRetan);

    }
}
