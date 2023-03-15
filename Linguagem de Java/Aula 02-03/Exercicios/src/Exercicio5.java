import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = entrada.next();
        System.out.println("Digite o seu salario atual: ");
        double salario = entrada.nextDouble();


        System.out.println("Escolhe a categoria do seu salario encaixa: ");
        System.out.println("[0 - 3] S�lario de R$ 0 a 3999,99");
        System.out.println("[4 - 6] S�lario de R$ 4000,00 a 6999,99");
        System.out.println("[7 - 9] S�lario de R$ 7000,00 a 9999,99");
        System.out.println("[10 - 12] S�lario de R$ 10000,00 a 12999,99");
        System.out.println("[13 - 15] S�lario de R$ 13000,00 a 15999,99");
        System.out.println("[16] S�lario de maiores R$ 16000,00");
        int opcao = entrada.nextInt();
        double aumento, salarioAumento;

        switch(opcao){
            case 0, 1, 2, 3:
                aumento = (salario * (20/100));
                salarioAumento = salario + aumento;
                System.out.printf("Funcionario %d tem direito a  20% de aumento", nome);
                System.out.printf("Entao seu salario atual é %.2f vai ser reajustado para R$  %.2f", salario, salarioAumento);
               break;
            case 4, 5, 6:
                aumento = (salario * (15/100));
                salarioAumento = salario + aumento;
                System.out.printf("Funcionario %d tem direito a  15% de aumento", nome);
                System.out.printf("Entao seu salario atual é %.2f vai ser reajustado para R$  %.2f", salario, salarioAumento);
                break;
            case 7, 8, 9:
                aumento = (salario * (12/100));
                salarioAumento = salario + aumento;
                System.out.printf("Funcionario %d tem direito a  12% de aumento", nome);
                System.out.printf("Entao seu salario atual é %.2f vai ser reajustado para R$  %.2f", salario, salarioAumento);
                break;
            case 10, 11, 12:
                aumento = (salario * (10/100));
                salarioAumento = salario + aumento;
                System.out.printf("Funcionario %d tem direito a  10% de aumento", nome);
                System.out.printf("Entao seu salario atual é %.2f vai ser reajustado para R$  %.2f", salario, salarioAumento);
                break;
            case 13, 14, 15:
                aumento = (salario * (7/100));
                salarioAumento = salario + aumento;
                System.out.printf("Funcionario %d tem direito a  7% de aumento", nome);
                System.out.printf("Entao seu salario atual é %.2f vai ser reajustado para R$  %.2f", salario, salarioAumento);
                break;
            case 16:
                System.out.printf("Funcionario %d não tem direitode aumento", nome);
                System.out.printf("Entao seu salario continua sendo a  atual é %.2f ", salario);
                break;



        }

    }
}
