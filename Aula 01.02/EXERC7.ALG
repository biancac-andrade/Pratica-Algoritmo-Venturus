Algoritmo "exerc7"

Var

n1, n2: real
soma, sub, multi, divi, resultado, opcao: real

Inicio
escreval("----------------------------------------------------")
escreval("Escolha primeiro numero que voce precisa calcular")
leia(n1)
escreval("Escolha sedungo numero que voce precisa calcular")
leia(n2)

escreval("-----------------------------------------------------")
escreval("Escolha a categoria a operação que voce precisa calcular")
escreval("[1] SOMA")
escreval("[2] SUBTRAÇÃO ")
escreval("[3] MULTIPLICAÇÃO ")
escreval("[4] DIVISÃO ")
leia(opcao)

Escolha opcao

caso 1
    resultado <- (n1+n2)
    escreval("o primeiro valor escolhido é: ", n1)
    escreval("o segundo o valor escolhido é: ", n2)
    escreval("a operacao escolhido é: SOMA")
    escreval("o resultado da opeação é: ", resultado)
    
caso 2
     resultado <- (n1-n2)
    escreval("o primeiro valor escolhido é: ", n1)
    escreval("o segundo o valor escolhido é: ", n2)
    escreval("a operacao escolhido é: SUBTRACAO")
    escreval("o resultado da opeação é: ", resultado)
    
caso 3
     resultado <- (n1*n2)
    escreval("o primeiro valor escolhido é: ", n1)
    escreval("o segundo o valor escolhido é: ", n2)
    escreval("a operacao escolhido é: MULTIPLICACAO")
    escreval("o resultado da opeação é: ", resultado)
caso 4
     resultado <- (n1/n2)
    escreval("o primeiro valor escolhido é: ", n1)
    escreval("o segundo o valor escolhido é: ", n2)
    escreval("a operacao escolhido é: DIVICAO")
    escreval("o resultado da opeação é: ", resultado)
FimEscolha

Fimalgoritmo