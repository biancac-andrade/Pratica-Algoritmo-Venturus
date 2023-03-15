import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // System.out.println("Digite o numero: ");
        // int numero = entrada.nextInt();
        int a, b;
        for(a = 1; a <= 3; ++a)
        {
            System.out.println(" Qual o nome do aluno? ");
            String nome = entrada.next();
            System.out.println(" Aluno: " + nome + " qual foi sua primeira nota da prova?");
            double n1 = entrada.nextDouble();
            System.out.println(" Aluno: " + nome + " qual foi sua segunda nota da prova?");
            double n2 = entrada.nextDouble();

            double media =  (n1 + n2) / 2;

            if( media >= 6){
                System.out.println(" Voce " + nome + " foi aprovado!");
            }else{
                System.out.println(" Voce " + nome + " foi reprovado!");
            }
        }
    }
}
