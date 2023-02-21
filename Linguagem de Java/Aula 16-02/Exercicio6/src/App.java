import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      int num;
      double horasTrab, valorHoras, salario;
    
      Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu numero de funcionario? ");
        num = entrada.nextInt();

         System.out.println("Qual suas horas trabalhada no mes? ");
        horasTrab = entrada.nextDouble();

         System.out.println("Qual o seu valor por horas? ");
        valorHoras = entrada.nextDouble();
      
      
      salario = (horasTrab * valorHoras);

      System.out.printf(" Entrada:  %d, %.2f,%.2f   Saída: NUMERO =  %d, SALARIO = R$ %.2f  %n ", num, horasTrab, valorHoras, num, salario);
    }
}

