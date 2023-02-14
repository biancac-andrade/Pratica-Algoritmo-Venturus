Algoritmo "contador4"

Var

contador, soma, quantidade, numero: inteiro


Inicio


contador <- 1
soma <- 0

escreval("quantos numeros voce quer contar?")
leia(quantidade)

enquanto (contador <= quantidade) faca
  escreva("digite o ", contador, ". o numeros: ")
  leia(numero)
  soma <- soma + numero
  contador <- contador + 1
fimenquanto
  escreval("a soma dos numeros é: ", soma)

Fimalgoritmo