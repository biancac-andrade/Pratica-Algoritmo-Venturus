algoritmo "exerc6"
var
   nome: vetor[1..3] de caractere
   Gab, Resp: vetor[1..5] de caractere
   Nota: vetor[1..3] de real
   NotasTurma, MediaTurma: real
   i, j: inteiro

funcao CalcularPontos(gabarito, resposta: real):real
var
   N: real
Inicio
   Se (maiusc(gabarito) = maiusc(resposta)) então
      N:= 2
   Fimse
   Retorne N
fimfuncao

inicio
   //--------------------------------------------//
   //Tela 1:
   //Cadastro de Gabarito:
   EscrevaL("  Passo 1 - Cadastro de Gabarito  ")
   EscrevaL("----------------------------------")
   Para j de 1 ate 5 faca
      EscrevaL("Questão ", j, ":")
      Leia(Gab[j])
   Fimpara
   LimpaTela
   //--------------------------------------------//
   //Tela 2:
   //Cadastro de Nome:
   Para i de 1 ate 3 faca
      EscrevaL("--------------------")
      EscrevaL(" Aluno ", i)
      EscrevaL("--------------------")
      Escreva("Nome: ")
      Leia(nome[i])
      //Cadastro da Notas e cálculo da nota
      //de cada aluno:
      Para j de 1 ate 5 faca
         EscrevaL("RESPOSTAS DADAS")
         Escreva("Questão ", j, ":")
         Leia(Resp[j])
         nota[i]:= nota[i] + CalcularPontos(Gab[j], Resp[j])
      FimPara
      //-----------------------------------------//
      NotasTurma:= NotasTurma + Nota[i]
      LimpaTela
   Fimpara
   MediaTurma:= NotasTurma/3
   LimpaTela
   //--------------------------------------------//
   //Tela 3:
   //Resultado com notas finais e média da turma:
   EscrevaL("Notas Finais")
   EscrevaL("------------------------")
   Para i de 1 ate 3 faca
      EscrevaL("Nome: ", nome[i]:10, Nota[i]:3:1)
   FimPara
   EscrevaL("------------------------")
   EscrevaL("Média da turma: ", MediaTurma)
   //--------------------------------------------//
fimalgoritmo