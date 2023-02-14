Algoritmo "menorMaiorValor

Var

i, menor, maior: inteiro
valorProduto: vetor[1..5] de inteiro

Inicio
menor <- 1
maior <- 1
para i de 1 ate 5 faca
     escreva("o valor do produto: ")
     leia(valorProduto[i])
     se valorProduto[i] > valorProduto[maior] entao
      maior <- i
     fimse
      se valorProduto[i] > valorProduto[maior] entao
      maior <- i
     fimse
fimpara
escreval("O produto de maior  valor é: ", valorProduto[maior])
escreval("O produto de menor valor é: ", valorProduto[menor])

Fimalgoritmo