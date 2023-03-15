import java.util.Scanner;

public class Exercicio9 {


  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
 
    int tempo = 0;
    System.out.println("Informe a massa inicial do material radiotivo (em gramas):");
    float massaInicial = ler.nextFloat();
    float massaFinal = massaInicial;
    while (massaFinal >= 0.5) {
      massaFinal /= 2;
      tempo += 50;
    }
 
    System.out.println();
    System.out.println("Massa Inicial = " + massaInicial + " gramas.");
    System.out.println("Massa Final = " + massaFinal + " gramas.");
 
    int h = (tempo / 3600);
    int m = (tempo % 3600) / 60;
    int s = (tempo % 3600) % 60;
    System.out.println(h + " horas: " + m + " minutos: " + s + " segundos.");
  }
  
}
