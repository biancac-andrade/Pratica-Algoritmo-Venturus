public class Atividade7 {
    public static void main(String[] args)  {
     // Gerar o número aleatório
      for (int i = 0; i < 100; i++) {
        int numAleatorio = (int)(Math.random() * 10 ) + 1;
        System.out.println("Número: " + numAleatorio);
      }
  }
}
