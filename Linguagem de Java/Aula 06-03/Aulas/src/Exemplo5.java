import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        int x = entrada.nextInt();

        for( int i = 1; i <= x ; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
