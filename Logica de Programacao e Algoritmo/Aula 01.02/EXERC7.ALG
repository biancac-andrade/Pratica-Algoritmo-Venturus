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
escreval("Escolha a categoria a opera��o que voce precisa calcular")
escreval("[1] SOMA")
escreval("[2] SUBTRA��O ")
escreval("[3] MULTIPLICA��O ")
escreval("[4] DIVIS�O ")
leia(opcao)

Escolha opcao

caso 1
    resultado <- (n1+n2)
    escreval("o primeiro valor escolhido �: ", n1)
    escreval("o segundo o valor escolhido �: ", n2)
    escreval("a operacao escolhido �: SOMA")
    escreval("o resultado da opea��o �: ", resultado)
    
caso 2
     resultado <- (n1-n2)
    escreval("o primeiro valor escolhido �: ", n1)
    escreval("o segundo o valor escolhido �: ", n2)
    escreval("a operacao escolhido �: SUBTRACAO")
    escreval("o resultado da opea��o �: ", resultado)
    
caso 3
     resultado <- (n1*n2)
    escreval("o primeiro valor escolhido �: ", n1)
    escreval("o segundo o valor escolhido �: ", n2)
    escreval("a operacao escolhido �: MULTIPLICACAO")
    escreval("o resultado da opea��o �: ", resultado)
caso 4
     resultado <- (n1/n2)
    escreval("o primeiro valor escolhido �: ", n1)
    escreval("o segundo o valor escolhido �: ", n2)
    escreval("a operacao escolhido �: DIVICAO")
    escreval("o resultado da opea��o �: ", resultado)
FimEscolha

Fimalgoritmo