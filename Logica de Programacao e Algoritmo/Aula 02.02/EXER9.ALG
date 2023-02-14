Algoritmo "exer9"

Var
curso : caractere
perc_homens, perc_mulheres : real
vaga, n,fem, masc, homens, mulheres : inteiro

Inicio

para n de 1 ate 50 faca


   escreva( "cadastro", n, " Qual seu curso: ")
   leia(curso)
   
   escreva( " Quantidade de vaga no curso", n, " - ", curso, " : ")
   leia(vaga)

   escreva("Quantidade de [F - feminino] do curso ", n, " - ", curso, " : ")
   leia(fem)

   escreva("Quantidade de [M - masculino] do curso ", n, " - ", curso, " : ")
   leia(masc)
 fimpara


   perc_homens <- masc / vaga * 100
   perc_mulheres <- fem / vaga * 100

   escreval("O curso", n, " - ", curso, " a sua quantidade de candidatos é: ", vaga)
   escreval("porcentagem de vaga para homens é: ", perc_homens:3:2, "% do curso de :", curso)
   escreval("porcentagem de vaga para homens é: ", perc_mulheres:3:2, "% do curso de :", curso)

Fimalgoritmo