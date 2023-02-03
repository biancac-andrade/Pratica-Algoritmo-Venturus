Algoritmo "exerc2"


Var

numero: inteiro


Inicio

escreval("Digite seu numero")
leia(numero)

se ( numero > 0 ) entao
   escreval(" O numero", numero, " é positivo então:")
   se ( numero  mod 2 = 0) entao
   escreval(" O numero", numero, " ele é par")
   senao
   escreval(" O numero", numero, " ele é impar")
   fimse
senao
 escreval(" O numero", numero, " não é positivo")
 fimse



Fimalgoritmo