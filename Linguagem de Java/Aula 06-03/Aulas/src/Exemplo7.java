import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        double c,f;
        boolean resp = true;


        Scanner entrada = new Scanner(System.in);


        do{
            System.out.println("Digite o valor inicial");
            c = entrada.nextFloat();
            f = c * 1.8 + 32;
            System.out.println("A temperatura em Fahrenheit é: " + f);
            System.out.println("Deseja fazer um novo calculo? true e false");
            resp = entrada.nextBoolean();
        }while (resp);
    }
}
