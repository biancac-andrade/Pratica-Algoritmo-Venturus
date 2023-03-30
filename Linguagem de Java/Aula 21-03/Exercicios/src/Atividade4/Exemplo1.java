package Atividade4;

import java.util.Scanner;

public class Exemplo1 {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    try{
      String[] vect = entrada.nextLine().split(" ");
      int position = entrada.nextInt();
      System.out.println(vect[position]);

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Input error");
    }

    System.out.println("End of Program");
    entrada.close();
  }
  
}
