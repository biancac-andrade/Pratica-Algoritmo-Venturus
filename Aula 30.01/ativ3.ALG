Algoritmo "atividade3"

Var

nome: caractere
idade: real
nota1, nota2, nota3, nota4: real
media: real




Inicio
escreval("Digite nome do aluno ")
leia(nome)
escreval("Digite a idade do aluno ")
leia(idade)

escreval(" qual nota do 1 semestre do aluno: ")
leia(nota1)
escreval(" qual nota do 2 semestre do aluno: ")
leia(nota2)
escreval(" qual nota do 3 semestre do aluno: ")
leia(nota3)
escreval(" qual nota do 4 semestre do aluno: ")
leia(nota4)


media <- (nota1+nota2+nota3+nota4) / 4

escreval("O nome do aluno é: ", nome)
escreval("A idade do aluno é: ", idade)
escreval("A nota do 1 semestre: ", nota1)
escreval("A nota do 2 semestre: ", nota2)
escreval("A nota do 3 semestre: ", nota3)
escreval("A nota do 4 semestre: ", nota4)

escreval("a media da nota anual é: ", media)


Fimalgoritmo