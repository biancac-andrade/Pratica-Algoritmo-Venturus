import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        float raio, area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio:  ");
        raio = entrada.nextFloat();



        if(raio > 0 ){
            area = (float) (Math.PI*(raio*raio));
            System.out.println("A area do circulo é: " + area + " m2");

        }else{
            System.out.println(" raio não pode ser nulo ou negativo ");
        }
    }
}
