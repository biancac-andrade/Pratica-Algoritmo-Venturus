Algoritmo "circulo"

Var
raio, area: real


Inicio
escreval("Qual o seu raio do circulo")
leia(raio)

area <- pi * Exp(raio,2)

se ( raio > 0) entao
escreva (" A area do seu circulo � ", area, " positivo")
senao
escreva (" N�o � possivel criar um circulo, pois numero � menor que 0")
fimse


Fimalgoritmo