# Trilha Java - Exercicio de (POO) Encapsulamento

## Aula realizada em 21/03/2023

## Exercicios

1. Diante dos dados apresentados, crie um programa
   que realize o cadastro de uma conta, dando opção
   para que seja ou não informado o valor de depósito
   inicial. Em seguida, realize um depósito e depois um
   saque, sempre mostrando os dados da conta após
   cada operação.
   Use o conceito de interface/encapsulamento e
   considere os métodos depositar() e sacar() como
   uma interface. Isso é importante para o contrato.

## Conta

- numeroConta
- proprietario
- balanco

---

- depostar()
- sacar()

<inteface>
ControleConta
----------------
public abstract depositar();
public abstract sacar();

2. O quadrado e o triângulo são
   figuras geométricas que partilham de
   algumas características semelhantes.
   Eles possuem perímetro, área, nome e
   etc.
   Estes valores muitas das vezes são
   essenciais para o cálculo de muitas
   outras atividades.
   Pensando nestes cálculos, é proposto
   o seguinte problema:

Crie um programa que contenha duas classes
"Quadrado" e "Triangulo". Estas classes devem
possuir suas principais características, como:
nome, lado, altura, base e etc.
Faça um contrato através da interface e para tal
use os seguintes métodos:
public abstract void getNomeFigura();
public abstract void getArea();
public abstract void getPerimetro();

public abstract void getNomeFigura();
public abstract void getArea();
public abstract void getPerimetro();
Além da interface citada acima, construa as
classes apresentadas ao lado. Acrescente
todos os getters e setters e qualquer outra
informação que achar relevante nas
respectivas classes.
Por fim, instancie os objetos "quadrado" e
"triangulo". Apresente o resultado.

## Quadrado

- lado

---

- getNomeFigura();
- getArea();
- getPerimetro();

## Triangulo

- base;
- altura;
- ladoA;
- ladoB;
- ladoC;

---

- getNomeFigura();
- getArea();
- getPerimetro();

3. Crie um programa que contenha três
   classes conforme apresentado no
   diagrama ao lado. O programa deve
   apresentar duas pessoas contendo nome,
   a linguagem de programação que trabalha
   e quantos anos de experiência. Faça um
   contrato através da interface e depois
   implemente os métodos. Instancia o
   objeto Maria que trabalha a 15 anos com
   Python e João que trabalha a 10 anos
   com Java.

<interface>
Linguagem
-------------
+ pessoa();
+ linguagemProgramacao();
+ experiencia();

## LinguagemPrograma

- nome;
- linguagem;
- experiencia;
- ***
- pessoa();
- linguagemProgramacao();
- experiencia()

  4.Sobre estrutura Try-Cacth: Tratamento Exceções

Sem Exceção:
Digite 3 Strings seguidas de espaços: Maria Jose Joao
Digite Position: 1
Resultado: O nome Jose deve ser impresso.
Exceção 1:
Digite 3 strings seguidas de espaços: Maria Jose Joao
Digite Position: e (digite uma letra)
Resultado: InputMismatchException. (erro de entrada)
Exceção 2:
Digite 3 strings seguidas de espaços: Maria Jose Joao
Digite Position: 5
Resultado: ArrayIndexOutOfBoundsException. (erro de indice inexistente)

Exemplo:
A solução é tratar as
exceções conforme o
código ao lado.
As exceções agora irão
enviar uma mensagem
mais explicativa, caso elas
ocorram.
Refaça o exercício anterior
com esse código.
