# Trilha Java - Metodos especiais

## Aula realizada em 29/03/2023

## Exemplos e Exercicios

### Exemplos

2. : Faça um programa que leia uma
   quantidade N, e depois leia os N números inteiros. Ao
   final, imprima esses números de forma organizada
   conforme exemplo. Em seguida, informe qual foi o
   primeiro valor digitado.
   Quantidade? 4
   10
   8
   1
   6
   [10, 8, 1, 6]
   Primeiro: 10
   Generics
   Criar um serviço de impressão:
   ServicoImpressão

- adicionaValor(valor: int): void
- primeiro(): int
- imprime(): void

3. Funciona bem para
   String e Inteiros.
   Problema: Se resolver
   guardar o resultado numa
   variável Integer.
   Type Safety
   Performace

4. O tipo Integer pode ser
   alterado pra String. O
   programa funciona.
   Veja que se estiver
   inteiro, não aceita
   "Maria".
   Não precisa do Casting.

5. Crie um programa que instancie um
   objeto do tipo Set. Adicione os
   objetos TV, NOTEBOOK e TABLET.
   Em seguida faça a confirmação se
   este Set contém o objeto
   NOTEBOOK. Imprima o resultado e
   o conjunto de objetos.

6. Crie um programa com uma classe
   Produto conforme ao lado. Na classe
   principal instancie os objetos Set e
   Produto. Adicione em Set os produtos
   conforme a tabela. E para o objeto
   Produto, instancie o "Notebook" com o
   preço "1200". Faça uma comparação e
   veja se o objeto Set contém o objeto
   Produto. True ou False

Produto

- String name
- Double price
  Implemente o
  construtor, Getters e
  Setters.

Produtos
TV 900.0
Notebook 1200.0
Tablet 400.0

8. Crie um programa que instancie
   um objeto Map. Insira os
   valores/chaves conforme
   mostrado na tabela. Em seguida
   faça testes como remover() e
   put() para algumas chaves e veja
   o resultado. Imprima o resultado
   final para cada caso.
   Map<K,V>
   Chave Valor
   username Maria
   email maria@gmail.com
   phone 99128097

9. Crie um programa com uma classe
   Produto conforme ao lado. Na classe
   principal instancie os objetos Map e
   Produto. Adicione em Map os produtos
   conforme a tabela. E para o objeto
   Produto, instancie a "TV" com o preço
   "900". Faça uma comparação e veja se o
   objeto Map contém o objeto Produto.

True ou False

Produto

- String name
- Double price
  Implemente o
  construtor, Getters e
  Setters.

Produtos
TV 900.0
Notebook 1200.0
Tablet 400.0

### Atividaes

1. Crie um programa que instancie dois objetos do tipo Set, veja o exemplo
   abaixo. Em seguida faça as operações UNIÃO, INTERSEÇÃO e
   DIFERENÇA entre esses conjuntos. Imprima o resultado.
   a -> (0,2,4,5,6,8,10)
   b -> (5,6,7,8,9,10)
