import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Entre com valor de x:  ");
        double x  = entrada.nextDouble();

        System.out.println(" Entre com valor de y:  ");
        double y  = entrada.nextDouble();

        if( x == 0.0 && y == 0.0){
            System.out.println(" origem ");
        } else if (x == 0.0) {
            System.out.println(" eixo x ");

        } else if ( y == 0.0) {
            System.out.println(" eixo y ");

        } else if ( x > 0.0 && y > 0.0) {
            System.out.println(" Quadrante 1 ");

        } else if (x < 0.0 && y > 0.0) {
            System.out.println(" Quadrante 2 ");

        }else{
            System.out.println(" nao existe ");
        }
    }
}
