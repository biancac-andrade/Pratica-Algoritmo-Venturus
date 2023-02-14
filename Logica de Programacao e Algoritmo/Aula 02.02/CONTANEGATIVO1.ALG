Algoritmo "contaNegativo1"

Var

contador, numero, negativo, i: inteiro


Inicio

contador <- 1
negativo <- 0
escreva("quantos numeros voce deseja digitar: ")
leia(i)
repita
      escreva("digite um numero: ")
      leia(numero)
      se (numero < 0) entao
         negativo <- negativo + 1
      fimse
      contador <- contador + 1
ate (contador > i)
escreval("a quantidade de numeros negativos é: ", negativo)


Fimalgoritmo