import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolhe um numero x: ");
        double x = entrada.nextDouble();
        System.out.println("Escolhe um numero y: ");
        double y = entrada.nextDouble();

        System.out.println("Escolhe um numero da categoria do que quer doar: ");
        System.out.println("[1]  para soma");
        System.out.println("[2]  para subtracao");
        System.out.println("[3]  para divisão");
        System.out.println("[4]  para multiplicação");
        int opcao = entrada.nextInt();
        double calculo;

        switch (opcao){
            case 1:
                calculo = x + y;
                System.out.printf(" Resultado da soma de x -> %.1f e y -> %.1f é  %.1f", x, y, calculo);
                break;
            case 2:
                calculo = x - y;
                System.out.printf(" Resultado da subtracao de x -> %.1f e y -> %.1f é  %.1f", x, y, calculo);
                break;
            case 3:
                calculo = x / y;
                System.out.printf(" Resultado da divisão de x -> %.1f e y -> %.1f é  %.1f", x, y, calculo);
                break;
            case 4:
                calculo = x * y;
                System.out.printf(" Resultado da multiplicao de x -> %.1f e y -> %.1f é  %.1f", x, y, calculo);
                break;
            default:
                System.out.printf(" operador desconhecido");
                break;

        }
    }
}
