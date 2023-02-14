Algoritmo "Exerc2"

Var

valores: vetor[1..3,1..3] de real
somaTotal, somaLinha3, somaColuna2, somaDiag: real
i,j: inteiro


Inicio

somaLinha3 <- 0
somaColuna2 <- 0
somaDiag <- 0

para i de 1 ate 3 faca
     para j de 2 ate 3 faca
          escreval("Digite um valor para a matriz: ")
          leia(valores[i,j])
          somaTotal <- valores [i,j] + somaTotal
          se i=3 entao
             somaLinha3 <- valores[i,j] + somaLinha3
          fimse
          se j=2 entao
           somaColuna2 <- valores[i,j] + somaColuna2
          fimse
          se i=j entao
           somaDiag <- valores[i,j] + somaDiag
          fimse
          fimpara
     fimpara
     
     escreval("A soma total é: ", somaTotal)
     escreval("A soma de linha 3 é: ", somaLinha3)
     escreval("A soma da coluna 2 é: ", somaColuna2)
     escreval("A soma de diagonal Principal é: ", somaDiag)

Fimalgoritmo