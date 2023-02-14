Algoritmo "testeSomatorio"

Var

i:inteiro
valor:inteiro
qtdnegativo:inteiro
somatoriopositivo:inteiro

Inicio

para i de 1 ate 5 faca
     escreva("o valor do produto: ")
     leia(valor)
     se(valor > 0) entao
 somatoriopositivo <- somatoriopositivo + valor
 senao
 se (valor < 0) entao
 qtdnegativo <- qtdnegativo + 1
 fimse
 fimse
fimpara
escreval("somatorio dos positivos:", somatoriopositivo)
escreval("quantidade de negativos:", qtdnegativo)


Fimalgoritmo