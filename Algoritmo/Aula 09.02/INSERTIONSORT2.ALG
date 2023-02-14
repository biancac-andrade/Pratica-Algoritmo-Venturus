Algoritmo "insertionSort2"

Var

v: vetor[1..10] de inteiro
i,j, aux: inteiro


Inicio
para i de 1 ate 20 faca
     escreval("Digite o ", i, " o numero: ")
     aleatorio 0, 200000
     leia(v[i])
     aleatorio off
     
fimpara

para i de 2 ate 20 faca
     aux <- v[i]
     j <-  i-1
     enquanto aux < v[j] faca
              v[j+1] <- v[j]
              j <- j-1
              se j=0 entao
              interrompa
              fimse
     fimenquanto
fimpara
Fimalgoritmo