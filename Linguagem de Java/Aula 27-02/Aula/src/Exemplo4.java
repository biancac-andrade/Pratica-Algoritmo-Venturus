import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) throws Exception {
        String nome1 = "erinaldo";
        String nome2 = "erinaldo";
        String nome3 = new String("erinaldo");
        String resultado1, resultado2;

        resultado1 = (nome1 == nome2) ? "igual" : "diferente ";
        resultado2 = (nome1.equals(nome3)) ? "igual" : "diferente";


        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
