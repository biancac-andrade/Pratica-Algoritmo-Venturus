import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int numero = entrada.nextInt();

        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                System.out.println("nao é primo");
        }
        System.out.println(" é primo");
    }
}
