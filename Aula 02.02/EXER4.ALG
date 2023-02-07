Algoritmo "exer4"
Var
 i, j, numero, somaDivisores :inteiro


Inicio
 para i <- 1 ate 10 faca
          leia (numero)
          somaDivisores <- 0 ;
          para j <- 1 ate numero faca
               se (numero mod j = 0) entao
                    somaDivisores <- somaDivisores + j
               fimse
          fimpara
          se (somaDivisores = numero) entao
               escreval ("PERFEITO")
          senao
               escreval("NÃO É PERFEITO")
          fimse
     fimpara


Fimalgoritmo