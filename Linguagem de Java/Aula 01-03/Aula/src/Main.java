import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int saldo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("qual saldo vc tem no momento? ");
        saldo = entrada.nextInt();
        if(saldo > 10000){
            System.out.printf("parabens! voce pode viajar pela Europa");
        }else {
            System.out.printf("aproveita suas ferias, viaje para o Brasil");
        }

    }
}