Algoritmo "exer3"

Var
// Seção de Declarações das variáveis
 a:  inteiro
 nome: caractere

Inicio


   repita
         escreva("entre com nome do aluno: ")
         leia(nome)
         escreval("Digita sua nota final: ")
         leia(a)


         se ( a = 10) entao
            escreval(nome, " tirou nota máxima")
         senao
              se ( a >=8) e (a <10) entao
             escreval(nome, " tirou nota boa")
             senao
             escreval(nome, " nao tirou nota boa")
             fimse
         fimse
   ate a = 4

Fimalgoritmo