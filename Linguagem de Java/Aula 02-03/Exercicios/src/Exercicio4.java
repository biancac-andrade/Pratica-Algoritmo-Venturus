import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua nota da 1 prova ");
        double p1 = entrada.nextDouble();
        System.out.println("Digite a sua nota da 2 prova ");
        double p2 = entrada.nextDouble();
        System.out.println("Digite a sua nota da 3prova ");
        double p3 = entrada.nextDouble();
        double media;

        media = (p1+p2+p3) / 2;

        if(media >= 7){
            System.out.println("Aprovado");
        } else if ( media < 7 && media >= 5) {
            System.out.println("Recuperacao");

       }else {
            System.out.println("Não aprovado, repete o semestre");
        }
    }
}
