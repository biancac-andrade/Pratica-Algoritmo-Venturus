Algoritmo "exer6"
  // contador <- 10
 //enquanto (contador >= 0) faca
    // escreval(contador)
    // contador <- contador - 1
    // fimenquanto
     //escreval("terminei de contar!")
Var

num_inicial, num_final, i, contador: inteiro


Inicio


  escreva("Digite o numero inicial: ")
  leia(num_inicial)
  escreva("Digite o numero final: ")
  leia(num_final)
  
  se (num_inicial > num_final) entao
     escreval (" DECRESCENTE")
      i <- num_inicial
     enquanto ( i >= num_final) faca
         escreval(i)
         i <- i - 1
      fimenquanto
  senao
     escreval (" CRESCENTE")
         i<- num_inicial
        enquanto ( i <= num_final) faca
            escreval(i)
            i <- i + 1
         fimenquanto

  fimse

Fimalgoritmo