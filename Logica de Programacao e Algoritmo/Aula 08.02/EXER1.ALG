Algoritmo "exer1"

Var
menor, maior, salario: real
i,j, k: inteiro
nome: vetor[1..4] de caractere
salarioHora, qtdHora: vetor[1..1] de real


Inicio
menor <- 1
maior <- 1
para i de 1 ate 4 faca
     escreva("Professor", i, ": qual seu nome? ")
     leia(nome[i])
    para j de 1 ate 1 faca
    escreva("Professor", i, ": qual sua quantidade de horas? ")
     leia(qtdHora[j])
     fimpara
      para k de 1 ate 1 faca
    escreva("Professor", i, ": qual seu salario por horas? ")
     leia(salarioHora[k])
     fimpara
     
       salario <- salarioHora[k] * qtdHora[j]
       
      se nome[salario] > salario[maior] entao
      maior <- salario
     fimse
     
     escreval("O professor ", i, " : ", nome, "tem maior salario", nome[maior])

     
fimpara



Fimalgoritmo