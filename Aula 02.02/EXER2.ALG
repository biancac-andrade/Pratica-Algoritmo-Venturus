Algoritmo "exer2"

Var

numero, i, cont: inteiro

Inicio

 escreval("digite um número")
 leia(numero)

 para i de 1 ate numero faca
     se numero mod  i = 0 entao
        cont <- cont+1
     fimse
 i <- i+1
 fimpara

se cont = 2 entao
   escreval("o numero", numero," e primo!")
senao
   escreval("o numero", numero," NAO e primo!")
fimse

Fimalgoritmo