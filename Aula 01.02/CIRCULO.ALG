Algoritmo "circulo"

Var
raio, area: real


Inicio
escreval("Qual o seu raio do circulo")
leia(raio)

area <- pi * Exp(raio,2)

se ( raio > 0) entao
escreva (" A area do seu circulo é ", area, " positivo")
senao
escreva (" Não é possivel criar um circulo, pois numero é menor que 0")
fimse


Fimalgoritmo