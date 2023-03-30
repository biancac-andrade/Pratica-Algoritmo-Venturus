package Exercicio3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Atividade {
  
   public static void main(String[] args) {

      File file = new File("C:\\Users\\Usuario\\Desktop\\dev\\ler.txt");
      Scanner entrada = null;

      try{
        entrada = new Scanner(file);
        while(entrada.hasNextLine()){
          System.out.println(entrada.nextLine());
        }
      } catch(IOException e){
        System.out.println("Error opening file " + e.getMessage());
      } finally{
        if(entrada != null){
          entrada.close();
        }
        System.out.println("O bloco finally foi executado");
      }
  }
}
