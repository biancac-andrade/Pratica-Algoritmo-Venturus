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
        escreval (" os tr�s lados formam SIM um triangulo ! ")
        
        se (( a = b) e ( a = c)) entao
           escreval("O triangulo � um EQUILATERO")
        senao
        se (( a = b) e ( a = c ) e ( b = c) ) entao
            escreval("O triangulo � um ISOSCELES")
        senao
         escreval("O triangulo � um ESCALENO")
        fimse
senao
     escreval("Os tr�s lado N�O forma um triangulo!")
     fimse

Fimalgoritmo
