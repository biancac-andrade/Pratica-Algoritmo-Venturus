import java.util.Scanner;

public class Exemplo7 {

    public static void main(String[] args) {
        int ano_atual, ano_nasc, idade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        ano_atual = entrada.nextInt();
        System.out.println("Digite o seu ano de nascimento");
        ano_nasc = entrada.nextInt();

        idade = ano_atual - ano_nasc;

        if(idade <= 16 ){
            System.out.println("Voce não pode votar");

        }else{
                if(( idade >= 16 && idade < 18) || (idade > 70)){
                System.out.println("Voce tem opcionalidade de votar");
            }
            System.out.println("Voce deve votar");
        }
    }
}
