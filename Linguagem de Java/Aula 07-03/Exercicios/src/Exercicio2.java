import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite sua senha de numeros: ");
    int senha = entrada.nextInt();
    while ( senha != 890089){
        System.out.println("Senha incorreta, digite novamente: ");
        senha = entrada.nextInt();
    }
        System.out.println("Senha correta, acesso concedida! ");
    }

}
