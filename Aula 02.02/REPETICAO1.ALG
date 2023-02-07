Algoritmo "repeticao"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/02/2023
Var
// Seção de Declarações das variáveis
 a, b, c, mh, i: real
 nome: caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
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
         escreva("a media harmonica de:  ", nome, "é", mh)
         i <- i + 1
   ate i > 2

Fimalgoritmo