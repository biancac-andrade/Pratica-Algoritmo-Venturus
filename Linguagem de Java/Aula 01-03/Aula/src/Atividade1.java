import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        int quantia;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quanto voce tem de dinheiro sobrando? ");
        quantia = entrada.nextInt();



        if(quantia  < 30 ){
            System.out.println("Melhor ficar em casa e vendo tv");

        }else{
            System.out.println(" Voce póde ir ao cinema ");
        }
    }
}
