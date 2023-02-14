Algoritmo "exer3"

Var
sexo: caractere
i,j,  menor, maior: inteiro
altura: vetor[1..3] de inteiro
media: real
Inicio
menor <- 1
maior <- 1

para i de 1 ate 3 faca
     escreval("qual sua altura: ")
     leia(altura[i])
     
      escreval("qual seu sexo?  F- feminino / M - Masculino ")
     leia(sexo[j])
     
     se altura[i] > altura[maior] entao
      maior <- i
     fimse
      se altura[i] < altura[menor] entao
      maior <- i
     fimse


 se sexo = "f" entao

      media <- (media + altura[i]) / i

senao
      media <- (media + altura[i]) / i

fimse

fimpara
escreval("a maior altura é: ", altura[maior])
escreval("a menor altura é: ", altura[menor])
escreval(" media altura feminina: ", media)
escreval(" media altura masculina: ", media)



Fimalgoritmo