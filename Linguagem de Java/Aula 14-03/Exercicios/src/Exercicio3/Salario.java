package Exercicio3;

public class Salario {
  double aumento;
  double salario;
  double ano;


  void status() {
    System.out.println(" A porcentagem do aumento" + this.aumento);
    System.out.println("O salario inicial: " + this.salario);
    System.out.println("O ano atual: " + this.ano);

  }
  
  void calculoAumento() {
     do{
            salario = salario + (salario * aumento / 100); 
            aumento = aumento * 2; 
            ano++; 
        }while(ano <= 2022); 

        System.out.println(" o salario aumento para : " + salario); 
  }
  
}
