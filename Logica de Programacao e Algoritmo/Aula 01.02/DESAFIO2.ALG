Algoritmo "desafio2"

Var

preco, aumento, precoAumento, desconto, precoDesconto: real
categoria: inteiro
produto, situacao: caractere


Inicio
escreval("programa de produtos")
escreval("-----------------------")

escreval(" O que � seu produto: ")
leia(produto)

escreval("---------------------------------")
escreval(" Qual valor do seu produto: ")
leia(preco)


escreval("-----------------------------------------------")
escreval(" Escolha qual sua categoria do produto: ")
escreval("[1] limpeza")
escreval("[2] alimentacao")
escreval("[3] vestuario")
leia(categoria)

escreval("--------------------------------------------------")
escreval(" Escolha qual a situacao do produto: ")
escreval("[1] O produto necessita de refrigera��o")
escreval("[2] O produto  n�o necessita de refrigera��o")
leia(situacao)


precoAumento <- preco * ( 9)

escreval("--------------------------------------------------")
escreval("Pre�o com aumento")
escreval("--------------------------------------------------")

se preco <= 25 entao

   escolha categoria

   caso 1
      aumento <- ( preco * ( 5/100))
      precoAumento <- preco + aumento
      escreval(" O seu produto: ", produto, " aumentoude ", preco, "  para: ", precoAumento)
   caso 2
        aumento <- ( preco * ( 8/100))
      precoAumento <- preco + aumento
      escreval(" O seu produto: ", produto, " aumentou de ", preco, " para: ", precoAumento)
   caso 3
        aumento <- ( preco * ( 10/100))
      precoAumento <- preco + aumento
      escreval(" O seu produto: ", produto, " aumentou de ", preco, " para: ", precoAumento)
   fimEscolha
   
senao
     escolha categoria

   caso 1
      aumento <- ( preco * ( 12/100))
      precoAumento <- preco + aumento
      escreval(" O seu produto: ", produto, " aumentou de ", preco, "para: ", precoAumento)
   caso 2
        aumento <- ( preco * ( 15/100))
      precoAumento <- preco + aumento
      escreval(" O seu produto: ", produto, " aumentou de ", preco, " para: ", precoAumento)
   caso 3
        aumento <- ( preco * (18 /100))
      precoAumento <- preco + aumento
      escreval(" O seu produto: ", produto, " aumentou de ", preco, " para: ", precoAumento)
   fimEscolha
   
fimse


escreval("--------------------------------------------------")
escreval("Pre�o com desconto")
escreval("--------------------------------------------------")

se ( categoria = 2) e ( situacao = 1) entao
      desconto <- ( preco * ( 5/100))
      precoDesconto<- preco - desconto
      escreval(" O seu produto: ", produto, " teve desconto de: ", preco, "  para: ", precoDesconto)
senao
      desconto <- ( preco * ( 8/100))
      precoDesconto<- preco - desconto
      escreval(" O seu produto: ", produto, " teve desconto de: ", preco, " para: ", precoDesconto)
fimse

escreval("--------------------------------------------------")
escreval("Classificacao do pre�o")
escreval("--------------------------------------------------")

se (precoAumento <= 50) e (precoDesconto < 50) ent�o
escreval("O valor est� barato")
   se (precoAumento > 50) e (precoDesconto <= 120) ent�o
   escreval("o valor est� normal")
   fimse
senao
    se (precoAumento > 50) e (precoDesconto <= 120) ent�o
      escreval("o valor est� normal")
    senao
         escreval("o valor est� caro")
    fimse
fimse
Fimalgoritmo