Algoritmo "repeticao"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/02/2023
Var
// Se��o de Declara��es das vari�veis
 a, b, c, mh, i: real
 nome: caractere

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
   i <- 1
   repita
         escreva("entre com nome do aluno: ")
         leia(nome)
         escreva("entre com as notas de tres provas: ")
         escreva("digita primeira nota:  ")
         leia(a)
         escreva("digita 2 nota:  ")
         leia(b)
         escreva("digita 3nota:  ")
         leia(c)
         
         mh <- 3/ (1/a + 1/b + 1/c)
         escreva("a media harmonica de:  ", nome, "�", mh)
         i <- i + 1
   ate i > 2

Fimalgoritmo