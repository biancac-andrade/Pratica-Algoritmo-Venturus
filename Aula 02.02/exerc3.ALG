Algoritmo "repeticao"

Var
// Seção de Declarações das variáveis
 a:  real
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
             escreval(nome, "seila")
         fimse
   ate a > 4

Fimalgoritmo