Algoritmo "exer1"

Var

 i,y, z: inteiro

Inicio

   i <- 1
   repita
         escreval("qual numero vc quer calcular sua fatorial?")
         leia(i)
   ate (i >= 0)
   
 y <- 1
 z <- 1
  enquanto (z <= i) faca
     y <- y * z
     z <- z + 1
  fimenquanto
  
  escreval("resultado: ", y)

Fimalgoritmo