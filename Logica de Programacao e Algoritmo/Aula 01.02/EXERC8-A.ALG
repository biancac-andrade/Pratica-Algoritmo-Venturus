Algoritmo "exerc8-a"

Var

massa, altura, imc :real
//escreval("")

Inicio

escreval("Calculadora de IMC ")
escreval("****************************************************")

escreva("Digite a sua massa (kg): ")
leia(massa)
escreva("Digite a sua altura (m): ")
leia(altura)

imc <- massa/(altura*altura)
se ( imc < 16) entao
escreval("Seu IMC �:", imc,".")
escreval("Sua classifica��o segundo seu IMC, � MAGREZA GRAVE")
senao
se (imc > 16) e ( imc < 17) entao
escreval("Seu IMC �:", imc,".")
escreval("Sua classifica��o segundo seu IMC, � MAGREZA MODERADA")
senao

se ( imc > 17) e ( imc < 18.5) entao
escreval("Seu IMC �:", imc,".")
escreval("Sua classifica��o segundo seu IMC, � MAGREZA LEVE")
senao
se ( imc > 18.5) e ( imc < 25) ENTAO
escreval("Seu IMC �:", imc,".")
escreval("Sua classifica��o segundo seu IMC, � NORMAL")
senao
se ( imc > 25) e ( imc < 30 ) ENTAO
escreval("Seu IMC �:", imc,".")
escreval("Sua classifica��o segundo seu IMC, � SOBREPESO")
senao
se ( imc > 30) e ( imc < 35) ENTAO
escreval("Seu IMC �:", imc,".")
escreval("Sua classifica��o segundo seu IMC, � OBESIDADE GRAU I")
senao
se (imc > 35) e ( imc < 40) ENTAO
escreval("Seu IMC �:", imc,".")
escreval("Sua classifica��o segundo seu IMC, � OBESIDADE GRAU II (SEVERA)")
senao
se (imc >= 40) ENTAO
escreval("Seu IMC �:", imc,".")
escreval("Sua classifica��o segundo seu IMC, � OBESIDADE GRAU III (MORBIDA)")
fimse
fimse
fimse
fimse
fimse
fimse
fimse
fimse


Fimalgoritmo