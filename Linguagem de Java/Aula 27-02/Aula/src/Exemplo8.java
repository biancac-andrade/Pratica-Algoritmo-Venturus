public class Exemplo8 {
    public static void main(String[] args) throws Exception {
        int  soma = 1;
       for( int i = 1; i < 10; i++){
           soma = soma + i;
           System.out.println("O fatorial de: " + i + " = " +  soma);
       }
    }
}
