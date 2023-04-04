package Arquivos;

import java.io.*;


public class Exemplo3 {
   public static void main(String[] args)
        throws IOException
    {
        File file = new File(
            "C:\\Users\\Usuario\\meuprograma.txt");
        FileInputStream fileInputStream
            = new FileInputStream(file);
        InputStreamReader inputStreamReader
            = new InputStreamReader(fileInputStream);
        try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
          String line;
          int wordCount = 0;
          int characterCount = 0;
          int paraCount = 0;
          int whiteSpaceCount = 0;
          int sentenceCount = 0;
 
          while ((line = bufferedReader.readLine()) != null) {
              if (line.equals("")) {
                  paraCount += 1;
              }
              else {
                  characterCount += line.length();
                  String words[] = line.split("\\s+");
                  wordCount += words.length;
                  whiteSpaceCount += wordCount - 1;
                  String sentence[] = line.split("[!?.:]+");
                  sentenceCount += sentence.length;
              }
          }
          if (sentenceCount >= 1) {
              paraCount++;
          }
          System.out.println("Contagem total de palavras = " + wordCount);
          System.out.println("Numero total de frases = " + sentenceCount);
          System.out.println("Numero total de caracteres = " + characterCount);
          System.out.println("Numero de total de paragrafos = "+ paraCount);
          System.out.println("Numero total de espacos em branco = " + whiteSpaceCount);
        }
    }
}
