Algoritmo "menorValorVetor"
//

Var

i, menor: inteiro
valorProduto: vetor[1..5] de inteiro

Inicio
menor <- 1
para i de 1 ate 5 faca
     escreva("o valor do produto: ")
     leia(valorProduto[i])
     se valorProduto[i] < valorProduto[menor] entao
      menor <- i
     fimse
fimpara
escreval("O produto de mrnor valor é: ", valorProduto[menor])

Fimalgoritmo