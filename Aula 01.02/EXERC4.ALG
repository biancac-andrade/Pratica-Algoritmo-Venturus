Algoritmo "exerc4"

Var

nota1, nota2, nota3, media: real


Inicio
escreval(" Disciplina de português")

escreval(" Digita sua nota da primeira avaliação: ")
leia(nota1)

escreval(" Digita sua nota da segunda avaliação: ")
leia(nota2)

escreval(" Digita sua nota da terceira avaliação: ")
leia(nota3)

media <- ((nota1+nota2+nota3)/3)

se ( media >= 7) entao
   escreval(" A sua media é ", media, " emtão foi aprovado")
senao
     se ((media < 7) e ( media >= 5)) entao
      escreval(" A sua media é ", media, " emtão está de recuperação")
     senao
      escreval(" A sua media é ", media, " emtão foi reprovado")
     fimse
fimse

Fimalgoritmo