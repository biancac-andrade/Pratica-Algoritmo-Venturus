Algoritmo "exerc2"


Var

numero: inteiro


Inicio

escreval("Digite seu numero")
leia(numero)

se ( numero > 0 ) entao
   escreval(" O numero", numero, " � positivo ent�o:")
   se ( numero  mod 2 = 0) entao
   escreval(" O numero", numero, " ele � par")
   senao
   escreval(" O numero", numero, " ele � impar")
   fimse
senao
 escreval(" O numero", numero, " n�o � positivo")
 fimse



Fimalgoritmo