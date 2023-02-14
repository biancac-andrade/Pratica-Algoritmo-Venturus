Algoritmo "exer3"

Var

nome: vetor[1..5] de caractere
 nota: vetor[1..5, 1..2] de real
 media, mediaClasse: vetor[1..5] de real
i,j: inteiro

Inicio

para i de 1 ate 5 faca
   escreval(i, " Escreva o nome: ")
  leia(nome[i])
  para j de 1 ate 2 faca
  escreval("Qual sua ", j, " nota do aluno : " ,i, " : ")
  leia(nota[i, j])
  fimpara
  media[i] := (nota[i,1]  + nota[i,2] ) / 2
  mediaClasse[i] := media[i] / 5
fimpara
escreval (" A media da classe é: ", mediaClasse[i])
para i de 1 ate 5 faca
     se media[i] >= 6 entao
        escreval("O aluno(a) ", nome[i], " foi aprovado com as notas (", nota[i, 1], ", ", nota[i, 2], ") e média: ", media[i])
           // senao
            //  escreval("O aluno(a) ", nome[i], " foi reprovado com as notas (", nota[i, 1], ", ", nota[i, 2],  ") e média: ", media[i])
           fimse
           fimpara

Fimalgoritmo

