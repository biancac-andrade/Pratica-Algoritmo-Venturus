import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor inicial ");
        int i = entrada.nextInt();
        System.out.println("Digite o valor final ");
        int f = entrada.nextInt();

        do{
            i++;
            System.out.println("Aprendendo java!");
            System.out.println("o valor é: " + i);
        }while (i != f);
    }
}
