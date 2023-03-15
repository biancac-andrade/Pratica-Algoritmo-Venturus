import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("--- programa de produtos --- ");
        System.out.println("---------------------------- ");

        System.out.println("nome do produto ");
        String nome = entrada.next();

        System.out.println("valor do produto ");
        double valor = entrada.nextDouble();

        System.out.println("-------------------------------- ");
        System.out.println("Escolha a categoria do seu produto ");
        System.out.println("[1] - Limepza ");
        System.out.println("[2] - Alimentacao ");
        System.out.println("[3] - vestuario ");
        int categoria = entrada.nextInt();

        System.out.println("-------------------------------- ");
        System.out.println("Escolha a situacao do produto ");
        System.out.println("[1] - O produto necessita de refrigeracao");
        System.out.println("[2] - O produto não necessita de refrigeracao");
        int situacao = entrada.nextInt();
        double aumento, valorAumento , desconto, valorDesconto;

        if (valor <= 25) {

            switch (categoria){
                case 1:
                    aumento = (valor * ( 5/100));
                    valorAumento = valor + aumento;
                    System.out.printf("O seu produto %s com preco atual %.2f aumentou para %.2f %n", nome,valor, valorAumento);
                    break;
                case 2:
                    aumento = (valor * ( 8/100));
                    valorAumento = valor + aumento;
                    System.out.printf("O seu produto %s com preco atual %.2f aumentou para %.2f %n", nome,valor, valorAumento);
                    break;
                case 3:
                    aumento = (valor * ( 10/100));
                    valorAumento = valor + aumento;
                    System.out.printf("O seu produto %s com preco atual %.2f aumentou para %.2f %n ", nome,valor, valorAumento);
                    break;
            }

        }else {

            switch (categoria){
                case 1:
                    aumento = (valor * (12/100));
                    valorAumento = valor + aumento;
                    System.out.printf("O seu produto %s com preco atual %.2f aumentou para %.2f %n", nome,valor, valorAumento);
                    break;
                case 2:
                    aumento = (valor * ( 15/100));
                    valorAumento = valor + aumento;
                    System.out.printf("O seu produto %s com preco atual %.2f aumentou para %.2f %n ", nome,valor, valorAumento);
                    break;
                case 3:
                    aumento = (valor * ( 18/100));
                    valorAumento = valor + aumento;
                    System.out.printf("O seu produto %s com preco atual %.2f aumentou para %.2f %n", nome,valor, valorAumento);
                    break;
            }

        }
        System.out.printf("------------------------------");
        System.out.printf("------- Preco com desconto ----------");

        if ( categoria == 2 && situacao == 1) {
            desconto = (valor * ( 5/100));
            valorDesconto = valor - desconto;
            System.out.printf("O seu produto %s com preco atual %.2f teve desconto para %.2f  %n", nome,valor, valorDesconto);

        }else {
            desconto = (valor * ( 8/100));
            valorDesconto = valor - desconto;
            System.out.printf("O seu produto %s com preco atual %.2f teve desconto para %.2f %n", nome,valor, valorDesconto);
        }

        System.out.printf("------------------------------");
        System.out.printf("----- Classificação de valor -----");

        if((valorAumento <= 50) && (valorDesconto < 50)) {
            System.out.println("O valor esta barato");

            if(valorAumento > 50 && valorDesconto <= 120){
                System.out.println("O valor esta normal");
            }
        }else{
            if( (valorAumento > 50) && (valorDesconto <= 120)){
                System.out.println("O valor está normal");
            }else {
                System.out.println("O valor está caro");
            }

        }

        }
}
