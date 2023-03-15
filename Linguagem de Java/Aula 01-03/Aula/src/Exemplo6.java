import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {

        int saldo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual saldo voce tem no momento?");
        saldo = entrada.nextInt();

        if(saldo > 10000){
            System.out.println("Parabens! Voce pode viajar pela Europa");
        } else if (saldo <= 4000) {
            System.out.println("fique em casa e descansa nas ferias");
        } else {
            System.out.println("Parabens! Voce pode viajar pelo BRasil");
        }
    }
}
