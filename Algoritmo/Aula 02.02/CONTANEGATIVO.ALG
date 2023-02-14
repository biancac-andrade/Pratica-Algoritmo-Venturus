Algoritmo "contaNegativo"

Var

contador, numero, negativo: inteiro


Inicio

contador <- 1
negativo <- 0

repita
      escreva("digite um numero: ")
      leia(numero)
      se (numero < 0) entao
         negativo <- negativo + 1
      fimse
      contador <- contador + 1
ate (contador > 5)
escreval("a quantidade de numeros negativos é: ", negativo)


Fimalgoritmo