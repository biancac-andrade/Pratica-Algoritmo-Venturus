Algoritmo "jogoVelha"
// 

Var
v: vetor[1..3, 1..3] de caractere
L, C, Cont, Po: Inteiro
Simb : caractere
R: logico

procedimento mostraVelha()
inicio
  EscrevaL("+---+---+---+")
      Para L <- 1 ate 3 faca
           Para C <- 1 ate 3 faca
           Escreva("| ", v[L,C]:1)
           FimPara
         Escreva("|")
         EscrevaL()
         EscrevaL("+---+---+---+")
      FimPara
fimprocedimento

procedimento mudaJogador()
inicio
   Se (Simb = "X") entao
      Simb <- "O"
   senao
      Simb <- "X"
   FimSe
fimprocedimento

funcao Jogar(S: caractere; P: inteiro): logico
var

mudou: logico

inicio

mudou <- falso
Para L <- 1 ate 3 faca
   Para C <- 1 ate 3 faca
      Se(v[L,C] = NumpCarac(P)) entao
         v[L,C] <- S
         mudou <- verdadeiro
      FimSe
   FimPara
FimPara
Retorne mudou
fimfuncao

funcao TerminouVelha(): logico

var

terminou: logico
ocorr: inteiro

inicio
terminou <- falso

// Jogos em linha
Para L <- 1 ate 3 faca
   Se (v[L,1] = v[L,2]) e (v[L,2] = v[L,3]) entao
      terminou <- verdadeiro
   FimSe
FimPara

// Jogos em coluna
Para C <- 1 ate 3 faca
   Se (v[1,C] = v[2,C]) e (v[2,C] = v[3,C]) entao
    terminou <- verdadeiro
   FimSe
FimPara


// Jogos em diagonal
Se (v[1,1] = v[2,2]) e (v[2,2] = v[3,3]) entao
   terminou <- verdadeiro
FimSe
Se (v[1,3] = v[2,2]) e (v[2,2] = v[3,1]) entao
   terminou <- verdadeiro
FimSe


// Jogos em VELHA
ocorr <- 0
Para L <- 1 ate 3 faca
   Para C <- 1 ate 3 faca
      Se (v[L,C] <> "X") e (v[L,C] <> "O") entao
         ocorr <- ocorr + 1
      FimSe
   FimPara
FimPara

Se (ocorr = 0) entao
   terminou <- verdadeiro
FimSe

// Retorna se o jogo acabou ou nao
Retorne terminou

fimfuncao

Inicio

Cont <- 1
Simb <- "X"

Para L <- 1 ate 3 faca
   Para C <- 1 ate 3 faca
      v[L,C] <- NumpCarac(Cont)
      Cont <- Cont + 1
   FimPara
FimPara

MostraVelha()

Repita
   Repita
         EscrevaL("Vai jogar [", simb:1, "] em qual posicao? ")
         Leia(Po)
         R <- Jogar(Simb, Po))
         Se (R = falso) entao
            EscrevaL("JOGADA INVALIDA!")
         FimSe
   Ate (R = verdadeiro)
   
MudaJogador()
LimpaTela
MostraVelha()
Ate (terminouVelha() = verdadeiro)

EscrevaL("JOGO FINALIZADO!!!")


Fimalgoritmo