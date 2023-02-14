Algoritmo "repeticaoMed"

Var

a, b, c, mh, i: real
nome: caractere


Inicio

i <- 1
   repita
     escreval("Entre com nome do aluno")
     leia(nome)
     escreval("Entre com as notas das tres provas")
     escreval("Digita a primeira nota")
     leia(a)
     escreval("Digita a segunda nota")
     leia(b)
     escreval("Digita a terceira nota")
     leia(c)
     
     mh <- 3 / (1/a + 1/b + 1/c)
     
     escreval("A media harmonica do aluno: ", nome, " é ", mh)
     i <- i + 1
ate i > 3


Fimalgoritmo