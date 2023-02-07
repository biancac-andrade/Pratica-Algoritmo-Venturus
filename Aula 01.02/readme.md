# Trilha Algoritmo - Estrutura condicional

## Aula no dia 01/02/2023

### Exercicios

1. Crie um algoritmo que lê um dado número e decida se ele é par ou ímpar.
   Imprima o resultado

2. Escreva um programa que leia um número inteiro. Se o número lido
   for positivo, escreva uma mensagem indicando se ele é par ou ímpar. Se
   o número for negativo, escreva a seguinte mensagem “Este número não
   é positivo”

3. Faça um algoritmo que receba o valor do
   salário de uma pessoa e o valor de um
   financiamento pretendido. Caso o
   financiamento seja menor ou igual a 5 vezes o
   salário da pessoa, o algoritmo deverá escrever
   "Financiamento Concedido"; senão, ele deverá
   escrever "Financiamento Negado".
   Independente de conceder ou não o
   financiamento, o algoritmo escreverá depois a
   frase "Obrigado por nos consultar"

4. Escreva um Algoritmo que calcule a média de
   um aluno numa dada disciplina e imprima o
   resultado.
   Regra: Durante o semestre o aluno faz 3
   avaliações com notas de 0 a 10. É considerado
   aprovado, o aluno que consegue nota igual ou
   superior a 7. Se este ficar com nota menor que 7 e
   maior ou igual a 5, será considerado de
   recuperação. No entanto, se a nota for abaixo de
   5, o aluno será considerado reprovado e deverá
   repetir o semestre.

5. Suponha que a empresa "Google" decidiu
   conceder um aumento de salários a seus
   funcionários de acordo com a tabela ao lado.
   Escreva um algoritmo que lê, para cada
   funcionário, o seu nome e o seu salário atual.
   Após receber estes dados, o algoritmo calcula o
   novo salário e escreve na tela as seguintes
   informações:
   <% de aumento> <salario atual> <salario novo>
   Salário Atual Aumento
   0 - 3 20%
   4 - 6 15%
   7 - 9 12%
   10 - 12 10%
   12 - 15 7%

6. Escreva o algoritmo "Programa Solidário". O doador deve clicar nas
   opções (mostradas abaixo) para efetuar a sua doação. Imprima o
   resultado na tela com o valor da doação e uma mensagem de
   agradecimento. Utilize a estrutura Escolha...Caso.
   [1] para doar R$10
   [2] para doar R$25
   [3] para doar R$50
   [4] para doar outros valores
   [5] para cancelar

7. Crie um algoritmo que simule uma calculadora,
   ou seja, que permite ao usuário escolher a
   operação matemática que ele deseja (soma,
   subtração, multiplicação e divisão). Após a
   escolha da operação desejada, o resultado deve
   ser impresso na tela. O usuário deve ler dois
   números para fazer uso da calculadora

8. Escreva um algoritmo que calcule
   o IMC de uma pessoa e imprima a
   situação em que ela se encontra.
   Resolva de duas formas:

1) se..então..senão.
2) escolha..caso.
   Prática
   Regra:
   IMC = Massa/Altura

### Desafio

1. Faça um programa que lê 4 valores I, A, B e C onde I é um número inteiro e
   positivo e A, B, e C são quaisquer valores reais. O programa deve escrever os
   valores lidos e:
   se I = 1, escrever os três valores A, B e C em ordem crescente;
   se I = 2, escrever os três valores A, B e C em ordem decrescente;
   se I = 3, escrever os três valores A, B, e C de forma que o maior valor fique
   entre os outros dois;
   se I não for um dos três valores acima, dar uma mensagem indicando este
   comportamento

2.Faça um programa que receba as informações de produtos:
O preço,
A categoria (1 – limpeza; 2 – alimentação; ou 3 – vestuário),
A situação (R – produtos que necessitam de refrigeração; e N – produtos que
não necessitam de refrigeração).
Em seguida, execute as seguintes tarefas

- Calcule e mostre o "Preço com aumento", usando as regras que se seguem:
  Preço Categoria Percentual de aumento
  <= 25
  1 5%
  2 8%
  3 10%

  > 25 1 12%
  > 2 15%
  > 3 18%

- Calcule o "Preço com desconto" de acordo com a seguinte regra:
  O produto que preencher pelo menos um dos seguintes requisitos terá um
  desconto equivalente a 5% do preço; caso contrário, terá um desconto de 8%.
  Os requisitos são:
  Categoria: 2
  Situação: R

- Faça e imprima a classificação, usando a regra a seguir.
  NOVO PREÇO CLASSIFICAÇÃO
  <= R$ 50,00 Barato
  Entre R$ 50,00 e R$ 120,00 Normal
  > = R$ 120,00 Caro
