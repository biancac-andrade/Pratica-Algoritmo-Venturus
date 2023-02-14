Algoritmo "exer5procedimento"

var
anterior, atual, proximo, i :inteiro

procedimento fibonaci

Inicio

anterior <- 0
atual <- 0
proximo <- 1

escreval("Sequencia de Fibonacci com 10 primeiros numeros:")
escreva(atual)
para i de 1 ate 9 faca
     escreva(proximo)
     anterior := atual
     atual := proximo
     proximo := atual + anterior

fimpara

fimprocedimento


Inicio

fibonaci()


Fimalgoritmo