# Trilha Java - (POO) Encapsulamento

## Aula realizada em 20/03/2023

### Atividades

1. Crie um programa que contenha os métodos e
   atributos conforme diagrama de classe. Imagine
   que o carro(motor) só deve ligar se este conter
   gasolina em seu tanque. No entanto, perceba que
   usar o motor ou até mesmo a gasolina, não deve
   ser uma ação direta do usuário. Use o conceito de
   encapsulamento e crie uma interface para os
   métodos citados. Instancie um objeto motor.
   Apresente o resultado.
   Se tem gasolina, apresente a mensagem "O motor
   foi ligado", caso contrário indique "não temos
   gasolina para ligar o motor"

## Motor

+ligado

- gasolina

---

- ligar()
- temGasolina()

2. Faça um programa com as características
   apresentadas no diagrama de classe e
   acrescente o que achar necessário.
   Apresente o resultado no final criando um
   objeto "pessoa". Use a ideia do
   relacionamento entre Classes. Suponha que
   num futuro próximo essa empresa pretende
   usar diferentes classes para
   pessoas(funcionarios, clientes, fornecedores
   e etc), e todas essas pessoas irão se
   beneficiar da classe "Endereco". Portanto,
   ter uma classe separada que defina somente
   ela, poderá ser usada mais facilmente.

Pessoa

- inscricao
- nome
- sobrenome
- endereco

---

- apresentar()
- cadastrar()

## Endereco

- rua
- numero
- bairro
- cidade
- estado
