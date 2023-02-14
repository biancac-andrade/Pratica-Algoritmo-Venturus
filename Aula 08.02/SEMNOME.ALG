Algoritmo "semnome"

Var

numeros: vetor[1..5] de inteiro
i: inteiro

maior: inteiro
menor: inteiro

Inicio

para i <- 1 ate 5 faca
     escreval("Digite o", i, " numero")
     leia(numeros[i])
fimpara

menor <- numeros[1]
maior <- numeros[1]

para i <- 1 ate 5 faca

     se (numeros[i] < menor) entao
        menor <- numeros[i]
     fimse

     se (numeros[i] > maior) entao
        maior <- numeros[i]
     fimse

fimpara

Fimalgoritmo
