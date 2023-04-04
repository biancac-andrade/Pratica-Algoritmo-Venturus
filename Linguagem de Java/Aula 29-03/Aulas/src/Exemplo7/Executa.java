package Exemplo7;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Executa {
  public static void main(String[] args) {
    
    Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 6, 8, 10));
    Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

  System.out.println("Matrix a" + a);
  System.out.println("Matrix b" + b);


    // uniao

    Set<Integer> c = new TreeSet<>(a);
    c.addAll(b);
    System.out.println("uniao de a + b" + c);


    // intersecao
    Set<Integer> d = new TreeSet<>(a);
    d.retainAll(b);
    System.out.println("intersecao de a + b" + d);


    // diferenca

    Set<Integer> e = new TreeSet<>(a);
    e.removeAll(b);
    System.out.println("diferenca de a + b" + e);
  }
}
