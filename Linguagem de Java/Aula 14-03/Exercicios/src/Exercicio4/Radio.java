package Exercicio4;

public class Radio {
  int tempo = 0;
  double massaInicial, massaFinal;
  int h, m, s;

  void status() {
    System.out.println(" A masas inicial: " + this.massaInicial);
    System.out.println(" A masas final: " + this.massaFinal);
  }


  void calculaMassaTempo() {

    while (massaFinal >= 0.5) {
      massaFinal /= 2;
      tempo += 50;
    }

    System.out.println("Massa Inicial = " + massaInicial + " gramas.");
    System.out.println("Massa Final = " + massaFinal + " gramas.");
  }

  void calculaTempo() {
    h = (tempo / 3600);
    m = (tempo % 3600) / 60;
    s = (tempo % 3600) % 60;
    System.out.println(h + " horas: " + m + " minutos: " + s + " segundos.");
  }

}
