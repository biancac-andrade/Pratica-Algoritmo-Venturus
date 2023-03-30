# Trilha Java – Exercicios de (POO) Viisibilidade e Métodos Especiais

## Aula foi feita no dia 16/03/2023

## Exercicio

1. Crie um programa com as seguintes
   características:
   Crie uma classe “ContaBanco”.
   • O “tipo” de conta só pode ser conta corrente “CC”
   ou conta poupança “CP”.
   • Na hora de “abrirConta()” lembre-se que é
   necessário mudar o “status” pra verdadeiro. Se a
   conta não está aberta o “status” é falso.
   • Suponha que se a pessoa abrir uma conta “CC” a
   pessoa ganha “R$50,00” e se abrir uma conta “CP”
   ganha “R$150,00”
   • Para o método “fecharConta()” lembre-se que a
   pessoa não pode ter dinheiro e nem dívida na
   conta.
   • Para o método “depositar()” veja que só é
   possível se o “status” estiver “Verdadeiro”.
   • E pra “sacar()” dinheiro só é possível se a conta
   estiver aberta, ou seja, com “status” verdadeiro
   e além disso, é necessário ter dinheiro. E por
   fim, o cliente vai pagar mensalmente uma taxa
   “pagarMensal()”. Cliente “CC” paga “R$12,00” e
   cliente “CP” paga “R$20,00”.
   De acordo com o diagrama de classes, insira
   os atributos e métodos. Veja as visibilidades
   de cada atributo e método. Além disso, insira
   os métodos Get e Set para cada atributo.
   Insira também um “construtor”, onde cada
   conta que é aberta já recebe o “status” como
   falso, ou seja está fechada ainda. E o “saldo”
   como “zero”.

ContaBanco

- numConta

# tipo

- dono
- saldo
- status

---

- abrirConta()
- fecharConta()
- depositar()
- sacar()
- pegarMensal()

Por fim, instancie:
A conta corrente 0001 do João Silva,
que vai precisar depositar R$300,00.
A conta poupança 0002 de Maria Silva
que vai precisar depositar R$400,00.

2. Crie uma classe Carro com as seguintes
   características:
   Use o construtor para definir o início padrão
   do carro. Ele deve estar desligado e marcha
   zero.
   Insira os getters e setters.
   Dentro do método desligar(), avise com uma
   mensagem "Carro está desligado".

Carro

- cor
- marca
- ano
- marcha
- ligado
- velocidadeAtual
- velocidadeMaxima
- ***
- ligar()
- desligar()
- acelegar()
- pegarMarcha

Dentro do método ligar(), avise com a
mensagem quando estiver ligado "O carro
está ligado". E ao acelerar que apresente o
valor da velocidade Atual.
Dentro do método acelerar crie a lógica
necessária. Considere uma
quantidade/aumento de 10km/h para cada
acelerada que for incrementado.

Dentro do método acelerar crie a lógica
necessária. Considere a seguinte marcha:
(-1) Ré : velocidade < 0
(0 ) Ponto Morto : velocidade = 0
(1 ) Media: 0 < velocidade < 40
(2 ) Alta : 40 =< velocidade =< 80
(3 ) qualquer valor diferente do previsto.

Por fim, instancie
dois objetos carro.
Teste os carros com
características e
comportamentos diferentes.

3. Faça uma programa para ler um número
   inteiro (N), e depois dizer se este número
   é negativo ou não. Além disso dizer
   também se este número é par ou ímpar.
   Crie o programa principal e crie uma
   classe operaçãoMatematica com dois
   métodos, ParOuImpar() e
   NegativoOuPositivo(), onde deve conter
   a lógica do problema. Considere os
   métodos como públicos. E Considere a
   variável N como protegido. Depois tente
   trocar para privado e discuta o resultado.

4. Baseado na tabela ao lado, escreva
   um programa que leia o código de
   um item e a quantidade deste item.
   A seguir, calcule e mostre o valor da
   conta a pagar. Crie o programa
   principal para instanciar os objetos
   e crie a classe Produtos para criar
   lógica do problema. Implemente as
   variáveis/atributos como protegido e
   os métodos como píblico.

Código Produto Preço
1 CachorroQuente 7.00
2 X-Salada 9.00
3 X-Bacon 11.00
4 Torrada 5.00
5 Refrigerante 4.00
