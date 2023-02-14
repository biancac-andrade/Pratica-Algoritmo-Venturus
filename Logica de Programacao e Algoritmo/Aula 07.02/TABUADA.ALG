Algoritmo "tabuada"

Var

n,x,t,i: inteiro

funcao FunTabuada(i, n: inteiro): inteiro
inicio
t <- i*n
retorne t
fimfuncao


Inicio

escreval("digite o numero para saber a tabuada: ")
leia(n)
se (n<1) ou (n > 10) entao
   escreval("este numero nao é valido")
senao
     para i de 1 ate 10 faca
          x <- FunTabuada(i, n)
          escreval("o numero", i," x ", n, " e igual a: ", x)
     fimpara
fimse

Fimalgoritmo