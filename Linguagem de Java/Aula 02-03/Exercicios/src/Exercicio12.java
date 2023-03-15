import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolhe 1 valor? ");
        double n1 = entrada.nextDouble();
        System.out.println("Escolhe 2 valor? ");
        double  n2 = entrada.nextDouble();
        System.out.println("Escolhe 3 valor? ");
        double  n3 = entrada.nextDouble();
        double maior =0, menor = 0, medio = 0;

        if((n1 > n2) && (n1 > n3)){
            if(n2 > n3){
                maior = n1;
                medio = n2;
                menor = n3;
            }else{
                maior = n1;
                medio = n3;
                menor = n2;
            }
        }else{
            if((n2 > n1) && (n2 > n2)){
                if(n1 > n3){
                    maior = n2;
                    medio = n1;
                    menor = n3;
                }else{
                    maior = n2;
                    medio = n3;
                    menor = n1 ;
                }
            }else{
                if((n3 > n1) && (n3 > n3)){
                    if(n1 > n2){
                        maior = n3;
                        medio = n1;
                        menor = n2;
                    }else{
                        maior = n3;
                        medio = n2;
                        menor = n1;
                    }
                }
            }
        }

        System.out.println("Escolhe a opcao que quer ver: ");
        System.out.println("[1] - crescente ");
        System.out.println("[2] - decrescente ");
        System.out.println("[3] - o maior fica no meio dos outros ");
        int opcao = entrada.nextInt();

        switch (opcao){
            case 1:
                System.out.printf("Numeros crescente %.1f %.1f %.1f" , menor, medio,maior);
                break;
            case 2:
                System.out.printf("Numeros crescente %.1f %.1f %.1f" , maior, medio, menor);
                break;
            case 3:
                System.out.printf("Numeros crescente %.1f %.1f %.1f" , menor, maior, medio);
                break;

        }
    }
}
