import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        String n1,n2,n3,n4,n5,n6,n7,n8,n9;


        n1 = ( 10 == 10 && 10 == 20 ) ? "verdadeiro" : "falso";
        n2 = ( 11 == 12 && 20 == 20 ) ? "verdadeiro" : "falso";
        n3 = ( 15 == 15 && 16 == 16 ) ? "verdadeiro" : "falso";
        n4 = ( 12 == 11 && 23 == 24) ? "verdadeiro" : "falso";
        n5 = ( 10 == 10 || 10 == 20 ) ? "verdadeiro" : "falso";
        n6 = (11 == 12 ||  20 == 20 ) ? "verdadeiro" : "falso";
        n7 = ( 15 == 15 || 16 == 16) ? "verdadeiro" : "falso";
        n8 = ( 12 == 11 || 23 == 24 ) ? "verdadeiro" : "falso";


        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);
        System.out.println(n8);
    }
}
