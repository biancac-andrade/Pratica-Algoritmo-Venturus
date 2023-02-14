Algoritmo "repeticaoSalto"

Var

contador, numero, salto: inteiro


Inicio


contador <- 0
escreval("ate qual numero vc quer contar ? ")
leia(numero)
escreval("vc quer contar saltando de quanto em quanto ? ")
leia(salto)
enquanto (contador <= numero) faca
    escreval(contador)
    contador <- contador + salto
    fimenquanto
    escreval("terminei de contar!")


Fimalgoritmo