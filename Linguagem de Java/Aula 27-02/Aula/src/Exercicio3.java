import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Exercicio3 {
    public static void main(String[] args) throws Exception {
       Calendar c = Calendar.getInstance();
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int data = c.get(Calendar.DAY_OF_MONTH);
        String resultado;


        // n1 = ( 10 == 10 && 10 == 20 ) ? "verdadeiro" : "falso";

        // System.out.println("Data agora: " + c.getTime());
        // System.out.println("Data agora: " + timeStamp);
        // System.out.println("Data agora: " + hora);
        System.out.println("Hoje é dia: " + data);

        resultado = ( data <= 15 ) ? "primeira quinzena" : "segunda quinzena";
        System.out.println("a data cai na: " + resultado);
    }
}
