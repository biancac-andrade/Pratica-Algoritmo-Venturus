Algoritmo "exerc5"

Var

nome: caractere
salarioAtual, aumento, salarioAumento: real
opcao: inteiro

Inicio
escreval("Aumento de salario")
escreval("-----------------------")
escreval("Qual seu nome")
leia(nome)
escreval("Qual seu salario?")
leia(salarioAtual)
escreval("-----------------------")
escreval("Escolhe a categoria do seu salario encaixa: ")
escreval("[0 - 3] Sálario de R$ 0 a 3999,99")
escreval("[4 - 6] Sálario de R$ 4000,00 a 6999,99")
escreval("[7 - 9] Sálario de R$ 7000,00 a 9999,99")
escreval("[10 - 12] Sálario de R$ 10000,00 a 12999,99")
escreval("[13 - 15] Sálario de R$ 13000,00 a 15999,99")
escreval("[16] Sálario de maiores R$ 16000,00")
leia(opcao)

Escolha opcao

caso 0,1,2,3

     aumento <- (salarioAtual * (20/100))
     salarioAumento <- ( salarioAtual + aumento)
escreval("-----------------------")
escreval("Funcionario ", nome, " tem direto a 20% de aumento")
escreval("Então seu salario atual: ", salarioAtual, " vai ser alterado para: R$", salarioAumento)

caso 3, 4, 5, 6

     aumento <- (salarioAtual * (15/100))
     salarioAumento <- ( salarioAtual + aumento)
escreval("-----------------------")
escreval("Funcionario ", nome, " tem direto a 15% de aumento")
escreval("Então seu salario atual: ", salarioAtual, " vai ser alterado para: R$", salarioAumento)

caso 7, 8, 9

     aumento <- (salarioAtual * (12/100))
     salarioAumento <- ( salarioAtual + aumento)
escreval("-----------------------")
escreval("Funcionario ", nome, " tem direto 12% de aumento")
escreval("Então seu salario atual: ", salarioAtual, " vai ser alterado para: R$", salarioAumento)

caso 10, 11, 12

     aumento <- (salarioAtual * (10/100))
     salarioAumento <- ( salarioAtual + aumento)
escreval("-----------------------")
escreval("Funcionario ", nome, " tem direto 10¢ de aumento")
escreval("Então seu salario atual: ", salarioAtual, " vai ser alterado para: R$", salarioAumento)

caso 13,14,15

     aumento <- (salarioAtual * (7/100))
     salarioAumento <- ( salarioAtual + aumento)
escreval("-----------------------")
escreval("Funcionario ", nome, " tem direto 7% de aumento")
escreval("Então seu salario atual: ", salarioAtual, " vai ser alterado para: R$", salarioAumento)

caso 16

escreval("-----------------------")
escreval("Funcionario ", nome, " não tem direto de aumento")
escreval("Então seu salario atual: ", salarioAtual, " não vai ser alterado" )

FimEscolha




Fimalgoritmo