Algoritmo "vetorPares"

Var

numeros: vetor[1..7] de inteiro
i, totPar: inteiro

Inicio

para i <- 1 ate 7 faca
  escreval("Escreva o ", i, " 0 valor: ")
  leia(numeros[i])
fimpara

LimpaTela

 para i <- 1 ate 7 faca
se (numeros[i] % 2 = 0) entao
   totPar <- totPar + 1
   escreval("valor ", numeros[i], " na posicao ", i, " é par" )
   fimse

fimpara
    escreval("o valor total de numeros pares é: ", totPar)
Fimalgoritmo