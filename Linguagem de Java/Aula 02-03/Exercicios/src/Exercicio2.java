import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int  num = entrada.nextInt();
if( num > 0){
    if(num % 2 == 0){
        System.out.println("O numero é positivo e par");

    }else{
        System.out.println("O numero é positivo e  impar");

    }
}else {
    System.out.println("O numero é negativo");
}


        entrada.close();
    }
}
