Algoritmo "exerc4"

Var

nota1, nota2, nota3, media: real


Inicio
escreval(" Disciplina de portugu�s")

escreval(" Digita sua nota da primeira avalia��o: ")
leia(nota1)

escreval(" Digita sua nota da segunda avalia��o: ")
leia(nota2)

escreval(" Digita sua nota da terceira avalia��o: ")
leia(nota3)

media <- ((nota1+nota2+nota3)/3)

se ( media >= 7) entao
   escreval(" A sua media � ", media, " emt�o foi aprovado")
senao
     se ((media < 7) e ( media >= 5)) entao
      escreval(" A sua media � ", media, " emt�o est� de recupera��o")
     senao
      escreval(" A sua media � ", media, " emt�o foi reprovado")
     fimse
fimse

Fimalgoritmo