Algoritmo "Programa Solitario"
Var
 opcao: inteiro
 valor, escolheValor: real



Inicio
Escreval(" ---- Programa Solitario ----")
Escreval(" Por favor escolha numero da sua op��o de doa��o: ")
Escreval(" [1] Para doar R$ 10, 00")
Escreval(" [2] Para doar R$ 25, 00")
Escreval(" [3] Para doar R$ 50, 00")
Escreval(" [4] Para doar outros valores")
Escreval(" [5] Cancelar doa��o")
leia(opcao)

Escolha opcao
caso 1
escreval(" O valor que voce est� doando � 10, 00 reias, muito obrigada")
caso 2
escreval(" O valor que voce est� doando � 25, 00 reias, obrigada")
caso 3
escreval(" O valor que voce est� doando � 50, 00 reias, obrigada")
caso 4
escreval("Qual valor voce quer doar? ")
leia(escolheValor)
escreval("Obrigada por doar R$ ", escolheValor, " deus te abencoe")
caso 5
escreval("Voce cancelou a doa��o, mas n�o tem problema, volte sempre ")
Fimescolha

Fimalgoritmo