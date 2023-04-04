package Exemplo6;

import java.util.Objects;

import javax.management.ObjectName;

public class Produto {
  
  private String name;
  private double price;

  public Produto(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 67 * hash + Objects.hashCode(this.name);
    return hash;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null) {
      return false;
    }
    
    if (getClass() != obj.getClass()) {
      return false;
    }
    
    final Produto other = (Produto) obj;
    
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
      return Objects.equals(this.price, other.price);
  }
}
