import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Escreva valor eixo x");
        double x = entrada.nextDouble();
        System.out.println("Escreva valor eixo y");
        double y = entrada.nextDouble();


            do{

                if(x != 0 & y != 0){
                    // primeiro quadrante
                    if(x > 0 & y > 0)
                        System.out.println("Primeiro quadrante");
                    else if(x < 0 & y > 0)
                        System.out.println("Segundo quadrante");
                    else if(x < 0 & y < 0)
                        System.out.println("Terceiro quadrante");
                    else
                        System.out.println("Quarto quadrante");
                }
            }while(x != 0 & y != 0);
        }
    }
