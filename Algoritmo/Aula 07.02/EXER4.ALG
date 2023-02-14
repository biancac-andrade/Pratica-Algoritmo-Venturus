algoritmo "exer4"

var
   vet: vetor [1..3] de caractere
   time: caractere
   x:inteiro
   
Inicio

   escreval("       TABELA DAS PARTIDAS       ")
   para x<- 1 ate 3 faca
      escreva("Nome do ",x,"º time: ")
      leia(vet[x])
   fimpara
   
   

   escreval("-----  Competicao ---------")
   escreval(vet[1]:8, "[ ] X [ ] ", vet[2]:8)
   escreval(vet[1]:8, "[ ] X [ ] ", vet[3]:8)
   escreval(vet[2]:8, "[ ] X [ ] ", vet[1]:8)
   escreval(vet[2]:8, "[ ] X [ ] ", vet[3]:8)
   escreval(vet[3]:8, "[ ] X [ ] ", vet[1]:8)
   escreval(vet[3]:8, "[ ] X [ ] ", vet[2]:8)
fimalgoritmo