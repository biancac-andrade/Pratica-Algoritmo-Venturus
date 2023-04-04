package Exercicio1;

import java.util.Scanner;

public class FuncionarioTercerizado extends Pessoa {
  
  public void pagamento() {
    Scanner entrada = new Scanner(System.in);
    double pagamento = horas * valorPorHora;
    
    System.out.println("Pagamento do funcionário terceirizado: " + pagamento);

    System.out.println(" Qual valor da sua despesa adicional?");
    double despesa = entrada.nextDouble();

    double adicional = despesa * 1.1;
    double despesaAdicional =  pagamento + adicional;
    
    System.out.println(" Incluido pagamento com adicional é: " + despesaAdicional);

  }
}
