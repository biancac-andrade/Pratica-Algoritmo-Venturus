Algoritmo "exer5"

Var
nome, sexo, nome_alto : caractere
   alt, peso, media_peso, perc_homens, perc_mulheres, total_peso, mais_alta : real
   n, homens, mulheres : inteiro

Inicio

para n de 1 ate 250 faca


   escreva( "cadastro", n, " Qual seu nome: ")
   leia(nome)

   escreva("Qual seu sexo? [F - feminino] ou [M - homem]  ")
   leia(sexo)

   escreva("Qual sua altura? ")
   leia(alt)

   escreva("Qual seu peso?  ")
   leia(peso)

   se sexo = "M" ent�o
         homens <- homens + 1
      senao
         se sexo = "F" ent�o
            mulheres <- mulheres + 1
         fimse
      fimse

      total_peso <- total_peso + peso

      se (alt > mais_alta) ent�o
         mais_alta <- alt
         nome_alto <- nome
      fimse
   fimpara
   
   media_peso <- total_peso / 250
   perc_homens <- homens / 250 * 100
   perc_mulheres <- mulheres / 250 * 100

   escreval("HOMENS: ", homens, perc_homens:3:2, "%")
   escreval("MULHERES: ", mulheres, perc_mulheres:3:2, "%")
   escreval("M�DIA DE PESO DOS CADASTRADOS: ", media_peso:3:2)
   escreval("CADASTRADO MAIS ALTO(A): ", nome_alto)

Fimalgoritmo