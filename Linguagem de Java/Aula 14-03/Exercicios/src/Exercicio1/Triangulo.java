package Exercicio1;

public class Triangulo {

  double a, b, c;
  double area, heron;


void status() {
    System.out.println("Escolha o valor a,b,c do triangulo com heron ");
    System.out.println(" Valor da a: " + this.a);
    System.out.println(" Valor da b: " + this.b);
    System.out.println(" Valor da c: " + this.c);
  }
  

  void calculaArea() {
      area =(a+b+c)/2;
      heron =(Math.sqrt(area *(area -a ) * (area - b) * (area - c))); 
  }

  void descobreLado(){
    if(a > 0){ 
		  if(b > 0){
		    if(c > 0){
		   	 System.out.println(" A area é : "+ heron);
		   	 }else{
					System.out.println("O valor do lado C é negativo, só é possivel usar maior que 0");
			}
		  }else{
						System.out.println("o valor do lado B negativo, só é possivel usar maior que 0");
		}
		}else{
				System.out.println("o valor do lado B C negativo, só é possivel usar maior que 0");

		}
  }


}
