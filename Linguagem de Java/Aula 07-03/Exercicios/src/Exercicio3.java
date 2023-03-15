import java.util.Scanner;
public class Exercicio3 {
    public static void main(String args[]) {

        Scanner entrada= new Scanner(System.in);
        System.out.println("Escreva um número");
        int y = entrada.nextInt();

        System.out.println("Os numeros divisores são: ");
        for(int i = y; i> 0;i--){

            if(y%i==0){
                System.out.println(i);
            }
        }
    }
}

