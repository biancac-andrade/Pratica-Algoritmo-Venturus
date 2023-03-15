import java.lang.Math;
public class Exemplo2 {
    public static void main(String[] args) throws Exception {
        double a, b, c;
        double x = 9.0;
        double y = 4.0;
        double z = -8.0;

        a = Math.pow(x, y);
        b = Math.abs(y);
        c = Math.abs(z);


        System.out.println("A raiz quadrada de " + x + " = " + a);
        System.out.println("A raiz quadrada de " + y + " = " + b);
        System.out.println("A raiz quadrada de " + z+ " = " + c);
    }
}
