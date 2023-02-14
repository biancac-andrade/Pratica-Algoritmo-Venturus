Algoritmo "semnome"

Var

v: vetor[1..5] de inteiro
i,j, aux: inteiro



Inicio
para i de 1 ate 5 faca
     escreval("Digite o ", i, "o numero")
     leia(v[i])
fimpara

para i de 2 ate 5 faca
     aux <- v[i]
     j <- i - 1
     enquanto ( aux < v[j]) faca
        v[j+1] <- v[j]
        j <- j - 1
        se j=0 entao
        interrompa
        fimse
     fimenquanto
     v[j+1] <- aux
fimpara
escreval("--------------------")
para i de 1 ate 5 faca
     escreval(v[i])
fimpara

Fimalgoritmo