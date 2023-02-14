Algoritmo "vetorNNegativo"

Var
i, negativo: inteiro
numero: vetor[1..6] de real

Inicio
negativo <- 0
para i de 1 ate 6 faca
     escreval("digite um numero: ")
     leia(numero [i])
     se numero [i] < 0 entao
        negativo <- negativo + 1
     fimse
     fimpara
escreval("numeros negativos: ", negativo)


Fimalgoritmo