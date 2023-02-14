Algoritmo "exer2"

Var

i, menor, maior: inteiro
valorProduto: vetor[1..50] de inteiro
somatoriopositivo: real

Inicio
menor <- 1
maior <- 1

para i de 1 ate 50 faca
     escreva("o valor do produto: ")
     leia(valorProduto[i])
     se valorProduto[i] > valorProduto[maior] entao
      maior <- i
     fimse
      se valorProduto[i] < valorProduto[menor] entao
      maior <- i
     fimse
     
     
     
     se(valorProduto[i] > 0) entao
 somatoriopositivo <- (somatoriopositivo + valorProduto[i])/50

 fimse
fimpara
escreval("O produto de maior  valor é: ", valorProduto[maior])
escreval("O produto de menor valor é: ", valorProduto[menor])

escreval("media dos numeros positivos:", somatoriopositivo)


Fimalgoritmo