Algoritmo "exer5"

Var

nome, letra, search: caractere

i: inteiro

Inicio

para i de 1 ate 5 faca
   escreval(i, " Escreva o nome: ")
  leia(nome)
  search := nome
fimpara

letra := copia(search, 1, 1)
 para i de 1 ate 5 faca
      se (letra = ("c")) entao
  escreval("O nome que foi encontrado é: ", letra)
fimse
fimpara

Fimalgoritmo


