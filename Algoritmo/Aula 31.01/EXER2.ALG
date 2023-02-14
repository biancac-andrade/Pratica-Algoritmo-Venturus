Algoritmo "exerc2"

Var

nome: caractere
nota1, nota2, nota3: real
media: real




Inicio
escreval("Digite nome do aluno ")
leia(nome)

escreval(" qual nota do 1 semestre do aluno: ")
leia(nota1)
escreval(" qual nota do 2 semestre do aluno: ")
leia(nota2)
escreval(" qual nota do 3 semestre do aluno: ")
leia(nota3)


media <- 3 / ((1/nota1) + (1/nota2) + (1/nota3))

escreval("O nome do aluno é: ", nome)
escreval("A nota do 1 semestre: ", nota1)
escreval("A nota do 2 semestre: ", nota2)
escreval("A nota do 3 semestre: ", nota3)

escreval("a media harmônica da nota anual é: ", media)


Fimalgoritmo