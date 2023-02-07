Algoritmo "exer3"

procedimento ordem()

var
i: inteiro
a, b, c, d: real
menor, meio, maior : real
inicio

escreval("digite 1 numero: ")
leia(a)

escreval("digite 2 numero: ")
leia(b)

escreval("digite 3 numero: ")
leia(c)

escreval("digite 4 numero: ")
leia(d)

se(i=1) entao
        se(a>b e b>c)  entao
        maior = a
        meio = b
        menor = c
senao
      se(a>c e c>b) entao
         maior = a
         meio = c
         menor = b
      senao
         se(b>a e a>c) entao
            maior = b
            meio = a
            menor = c
         senao
           se(b>c e c>a) entao
            maior = b
            meio = c
            menor = a
            senao
                se(c>a e a>b) entao
                  maior = c
                  meio = a
                  menor = b
                senao
                     se(c>b e b>a)  entao
                        maior = c
                        meio = b
                        menor = a
                fimse
            fimse
         fimse
      fimse
fimse
fimse
         

       escreval("menor = ", menor)
       escreval("meio = ", meio)
       escreval("maior = ", maior)

fimprocedimento

Var


Inicio

ordem()

Fimalgoritmo