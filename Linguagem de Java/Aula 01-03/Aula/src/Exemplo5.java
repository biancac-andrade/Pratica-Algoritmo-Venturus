import java.util.Scanner;

public class Exemplo5 {

    public static void main(String[] args) {
        int ano_atual, ano_nasc, idade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        ano_atual = entrada.nextInt();
        System.out.println("Digite o seu ano de nascimento");
        ano_nasc = entrada.nextInt();

        idade = ano_atual - ano_nasc;

        if(idade >= 18){
            System.out.println("Voce tem a maioridade");
            System.out.println("Voce pode votar");

        }else{
            System.out.println("Voce não tem a maioridade");
            System.out.println("Voce Não pode votar");
        }
    }
}
