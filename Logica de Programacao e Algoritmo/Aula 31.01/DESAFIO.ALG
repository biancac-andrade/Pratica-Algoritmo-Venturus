Algoritmo "desafio"

Var
a, b, c: inteiro

Inicio
escreval("Digite seu valor A ? ")
leia(a)

escreval("Digite seu valor B ? ")
leia(b)

escreval("Digite seu valor C ? ")
leia(c)

se (( (a+b)> c ) e ( (a+c)> b) e ( (b+c) > a)) entao
        escreval (" os três lados formam SIM um triangulo ! ")
        
        se (( a = b) e ( a = c)) entao
           escreval("O triangulo é um EQUILATERO")
        senao
        se (( a = b) e ( a = c ) e ( b = c) ) entao
            escreval("O triangulo é um ISOSCELES")
        senao
         escreval("O triangulo é um ESCALENO")
        fimse
senao
     escreval("Os très lado NÃO forma um triangulo!")
     fimse

Fimalgoritmo
