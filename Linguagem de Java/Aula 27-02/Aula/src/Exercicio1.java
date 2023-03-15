import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) throws Exception {
        int idade;
        String resultado1 ;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual sua idade");
        idade = entrada.nextInt();

        resultado1 = ( (idade >= 16 &&  idade <= 18 )|| idade > 70) ? "seu voto é opcioanl" : "seu voto é obrigatorio";


        System.out.println(resultado1);
    }
}
