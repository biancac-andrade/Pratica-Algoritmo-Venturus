package Atividade2;

import java.util.ArrayList;
import java.util.List;

public class ALuno {
  private List<Object> list = new ArrayList<>();

  
  public void adicionaValor(Object value) {
    list.add(value);
  }

  public Object primeiro() {
    if (list.isEmpty()) {
      throw new IllegalArgumentException("Lista está vazia");
    }
    return list.get(0);
  }

  public void qtd() {  
    
    System.out.println(list.size());
  }
}
