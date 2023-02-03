Algoritmo "desafio1"

Var

i: inteiro
n1,n2,n3, maior, menor, medio: real


Inicio

escreval("Escolhe 1 valor: ")
leia(n1)

escreval("Escolhe 2 valor: ")
leia(n2)

escreval("Escolhe 3 valor: ")
leia(n3)

se ((n1 > n2) e ( n1 > n3)) entao
     se n2 > n3  entao
         maior <- n1
         medio <- n2
         menor <- n3
      senao
         maior <- n1
         medio <- n3
         menor <- n2
      fimse
   senao
      se ((n2 > n1) e (n2 > n3))  entao
         se n1 > n3  entao
            maior <- n2
            medio <- n1
            menor <- n3
         senao
            maior <- n2
            medio <- n3
            menor <- n1
        fimse
      senao
         se ((n3 > n1) E (n3 > n2)) entao
            se n1 > n2 entao
               maior <- n3
               medio <- n1
               menor <- n2
            senao
               maior <- n3
               medio <- n2
               menor <- n1
            fimse
         fimse
      fimse
   fimse

escreval("Escolhe a opção que voce quer ver: ")
escreval("´[1] Crescente")
escreval("´[2] Decrescente")
escreval("´[3] Maior fica no meio dos outros")
leia(i)

escolha i

caso 1
     escreval("os numeros crescente: ", menor, medio , maior)
caso 2

    escreval("os numeros decrescebte: ",maior, medio, menor)
caso 3
  escreval("os numeros que o maior fique no meio dos outros: ",menor, maior, medio)
fimEscolha
Fimalgoritmo