Algoritmo "matrizSoma"

Var
valores: vetor[1..3,1..3] de real
somaTotal: real
i, j: inteiro


Inicio

somaTotal <- 0
para i de 1 ate 3 faca
     para j de 1 ate 3 faca
     escreval("digite o valor na posicao [", i, ",", j, "]")
     
      leia (valores[i, j])
      somaTotal <- valores[i,j] + somaTotal
      fimpara
      fimpara
      escreval("a soma total é:", somaTotal)
      

Fimalgoritmo