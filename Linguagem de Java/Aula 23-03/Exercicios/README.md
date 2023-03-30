# Trilha Java - Exercicios Heranças

## Aula realizada em 23/03/2023

### Exercicios

1. Herança é um tipo de associação que
   permite que uma classe herde todos dados
   e comportamentos de outra, o que faz da
   sua grande vantagem o reuso de código.
   Pensando nessa definição, suponha um
   negócio de banco que possui uma conta
   comum e uma conta para empresas,
   sendo que a conta para empresa possui
   todos membros da conta comum, mais um
   limite de empréstimo e uma operação de
   realizar empréstimo.

Veja que as contas possuem
características semelhantes. Isso
obviamente permite o
reaproveitamento de código.
Construa um programa que use o
conceito de herança. Reaproveite o
código e faça a classe
"ContaJuridica" herdar da classe
"Conta" todos os atributos e métodos.

## Conta

- numeroConta
- proprietario
- balanco

---

- deposito()
- saque()

## ContaJuridica

- numeroConta
- proprietario
- balanco
- limiteEmprestimo

---

- deposito()
- saque()
- emprestimo

Suponha que, para realizar um
empréstimo, é descontada uma taxa no
valor de 10 reais. Crie essa lógica dentro
do método apropriado. Faça com que o
usuário digite o valor desejado para o
empréstimo. Caso o valor esteja dentro
do limite(estabelecido pelo banco),
apresente o balanço com o valor correto
na conta. Caso o empréstimo não seja
permito, apresente a mensagem dizendo
ser impossível. Tente com um valor
menor.

## Conta

- numeroConta
- proprietario
- balanco

---

- deposito()
- saque()

## ContaJuridica

- numeroConta
- proprietario
- balanco
- limiteEmprestimo

---

- deposito()
- saque()
- emprestimo

Por fim, crie dois objetos. Um
objeto conta e outro objeto
contaJuridica. Entre com os
devidos dados de cada conta.
Número da conta, nome do
proprietário, o empréstimo
realizado (ou não) e o balanço
final

## Conta

- numeroConta
- proprietario
- balanco

---

- deposito()
- saque()

## ContaJuridica

- numeroConta
- proprietario
- balanco
- limiteEmprestimo

---

- deposito()
- saque()
- emprestimo

2. Métodos abstratos são importantes na
   construção de códigos. Não possuem
   implementação e precisam ser abstratos quando
   a classe é genérica demais para conter sua
   implementação. Se uma classe possuir pelo
   menos um método abstrato, então esta classe
   também é abstrata.
   Quando pensamos na "forma" de algum objeto,
   podemos dizer que esta forma é algo muito
   genérico. Logo, pode cair bem como uma classe
   abstrata que contém algum método abstrato.

Faça um programa para ler os dados de N
figuras (N fornecido pelo usuário), e depois
mostre as áreas destas figuras na mesma
ordem em que foram digitadas. Considere o
método area() abstrato na classe Forma.
Desenvolva todo o código de acordo com o
diagrama ao lado e acrescente o que achar
necessário. Insira no projeto uma estrutura de
dado organizado enum com o objetivo de
classificar em 3 cores. Faça com que o atributo
cor na classe Forma seja do tipo Cor. Ligando
portanto a Classe Forma e enum.
Faça o método area() em Retângulo e Circulo
sobrescrever o mesmo método em Forma

Forma

- cor

---

- area();

Retangulo

- largura
- altura

---

- area()

Circulo

- raio

---

- area()

<enum>
Cor
------
- BLACK
- BLUE
- RED

Enum no Java São tipos de campos
que consistem em um conjunto fixo
de constantes (static final), sendo
como uma lista de valores prédefinidos.
Todos os tipos enums implicitamente
estendem a classe java.lang.Enum,
sendo que o Java não suporta
herança múltipla, não podendo
estender nenhuma outra classe.

Pense no programa quando for
executado conforme exemplo ao lado.
Veja que inicialmente é perguntado
quantas vezes ou número de formas
se deseja fazer.
Na Forma1 foi inserido os dados para
retângulo e na Forma2 foi inserido os
dados para círculo. Pra cada um dos
casos foi perguntado a cor desejada.
Tentem reproduzir esses valores e
chegar nos resultados mostrados de
vermelho

Entre com o numero de formas: 2
Forma #1 Dados:
Retangulo ou Circulo (r/c)? r
Cor (BLACK/BLUE/RED): BLUE
Largura: 5
Altura: 4
Forma #2 Dados:
Retangulo ou Circulo (r/c)? c
Cor (BLACK/BLUE/RED): RED
Raio: 6
FORMA AREAS:
20.00
113.10

3. Suponha um arquivo inexistente sendo lido pela entrada Scanner. Como
   o arquivo não existe, isso deve dar uma exceção. Logo o Bloco Try não
   vai funcionar. Independente disso funcionar ou não, o bloco Finally deve
   funcionar para fechar a entrada de dados, ainda que seja nula. Essa é a
   tarefa do bloco Finally.
   Refaça o programa a seguir:
   Primeiro: sem o arquivo.
   Segundo: com o arquivo.

Faça um arquivo do tipo .txt e escreva as três frases, da seguinte forma:
Bom dia!
Boa tarde!
Boa noite!
Em seguida insira o caminho correto no código apresentado
anteriormente e veja o resultado.
Observe que mesmo funcionando o bloco Try, o bloco Finally também
será executado.
