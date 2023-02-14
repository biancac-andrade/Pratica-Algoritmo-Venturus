Algoritmo "exerc8"

Var
numPar : vetor [0..9] de inteiro
numImpar : vetor [0..9] de inteiro
num, cont : inteiro
Inicio

para cont de 0 ate 9 faca
   escreval("Digite um número:")
   leia(num)
   se (num % 2 = 0 ) entao
      numPar[cont] <- num
   fimse
fimpara

escreval("Pares:")
para cont de 0 ate 9 faca
   escreval("a posicao ", cont, "o valor: ", numPar[cont], " é par")
fimpara


Fimalgoritmo