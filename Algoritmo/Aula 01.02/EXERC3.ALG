Algoritmo "exerc3"

Var

salario, financiamento, simulacao: real


Inicio

escreval("Digite seu salario aqui: ")
leia(salario)

escreval("Digite qual valor que pretende financiar")
leia(financiamento)

simulacao <- (salario * 5)

se ( financiamento <= simulacao) entao
   escreval("O seu financiamento foi concedido")
   escreval("Obrigado por nos consultar")
senao
   escreval("O seu financiamento foi negado")
   escreval("Obrigado por nos consultar")
fimse

Fimalgoritmo