Algoritmo "exer7funcao"

var
contador, numero, soma, res: inteiro

funcao leNumero(numero: inteiro): inteiro

Inicio

contador <- 1
repita
    soma <- contador * numero
    escreval ( numero, " X ", contador, " = ", soma)
    contador <- contador + 1
ate (contador > 10)

fimfuncao


Inicio

escreva("qual numero da tabuada voce quer ver: ")
leia(numero)

res <-leNumero(numero)


Fimalgoritmo