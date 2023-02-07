Algoritmo "repitaTabuada"

Var

contador, numero, soma: inteiro


Inicio

contador <- 1
escreva("quer fazera tabuada de qual numero: ")
leia(numero)

repita
    soma <- contador * numero
    escreval ( numero, " X ", contador, " = ", soma)
    contador <- contador + 1
ate (contador > 10)

Fimalgoritmo