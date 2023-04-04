package Exemplo4;

import java.util.ArrayList;
import java.util.List;

public class Executa {
     public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("TV", 900.00));
        list.add(new Produto("Notebook", 1200.00));
        list.add(new Produto("Tablet", 450.00));



        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));        
        
        for (Produto p : list) {
            System.out.println(p);
        }
    }
}
