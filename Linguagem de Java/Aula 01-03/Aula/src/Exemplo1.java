import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        int saldo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual saldo voce tem no momento?");
        saldo = entrada.nextInt();

        if(saldo > 10000){
            System.out.println("Parabens! Voce pode viajar pela Europa");
        }
    }
}
