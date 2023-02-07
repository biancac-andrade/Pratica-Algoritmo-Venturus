Algoritmo "exer6funcao"

var
anterior, atual, proximo, i , res:inteiro

funcao fibonaci : inteiro

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

fimfuncao

Inicio


res <- fibonaci
escreva(res)

Fimalgoritmo