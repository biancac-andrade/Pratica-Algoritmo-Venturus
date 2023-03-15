import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        int contador = 0, numero, salto;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ate qual numero vc quer contar?" );
        numero = entrada.nextInt();
        System.out.println("Voce quer conta saltando de quanto em quanto? ");
        salto = entrada.nextInt();

        while(contador <= numero){
            System.out.println(contador);
            contador =contador + salto;
        }
        System.out.println("terminei de contar!");
        }
}
