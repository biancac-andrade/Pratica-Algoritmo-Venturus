Algoritmo "bubblesort"

Var

numeros: vetor[1..6] de inteiro
i: inteiro
auxiliar: inteiro
troca: logico

Inicio

aleatorio 0, 10000
para i<- 1 ate 6 faca
   leia(numeros[i])
fimpara
aleatorio off

repita
   troca := FALSO
   para i <- 1 ate 5 faca
      se (numeros[i] > numeros[i+1]) entao
         auxiliar <- numeros[i]
         numeros[i] <- numeros[i+1]
         numeros[i+1] <- auxiliar
         troca := VERDADEIRO
      fimse
   fimpara
ate troca = FALSO

Fimalgoritmo