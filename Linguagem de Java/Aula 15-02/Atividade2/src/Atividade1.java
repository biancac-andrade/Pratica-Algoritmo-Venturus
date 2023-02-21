public class Atividade1{
  public static void main(String[] args) {
    String produto1 = "computador";
    String produto2 = "Tablet";

    byte age = 30;
    int code = 5290;
    String gender = "F";
    double preco1 = 5100.00;
    double preco2 = 1000.50;
    double medida = 53.234567;

    System.out.println("Produtos: ");
    System.out.printf("%s , Preco total: R$ %.2f reais %n", produto1, preco1);
    System.out.printf("%s , Preco total: R$ %.2f reais %n", produto2, preco2);
    System.out.printf("Registro:  %d anos, codigo %d  e sexo %s %n", age, code, gender);
    System.out.printf(" Medida com oito casa decimais: %.8f %n", medida);
    System.out.printf(" Medida com duas casa decimais: %.2f %n", medida);

    }
}
