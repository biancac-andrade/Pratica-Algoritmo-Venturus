Algoritmo "delta"

funcao delta ( a, b,  c:real): real

inicio
retorne (Exp(b, 2) - (4 * a * c))

fimfuncao
Var
resultado, x1,x2: real

Inicio
 resultado <- delta(4, 3, 3)
 escreval(resultado)
 
 se( resultado < 0 ) entao
 escreval(" esta equacao nao possui raizes reais")
 senao
  se (resultado = 0) entao
     x1 <- (-b + raizq(delta))/ (2*a)
     escreval(" esta equacao possui apenas uma raiz: ", x1)
  senao
    x1 <- (-b + raizq(delta))/ (2*a)
    x2 <- (-b - raizq(delta))/ (2*a)
     escreval(" esta equacao possui dois raizes: ", x1, x2)
     fimse
  fimse
Fimalgoritmo