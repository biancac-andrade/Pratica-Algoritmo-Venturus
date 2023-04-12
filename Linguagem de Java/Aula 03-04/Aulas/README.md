# Trilha Java - Programação Funcional

## Aula realizada em 03/04/2023

1. Interface Comparable
2. public class Produto
   implements
   Comparable<Produto>

3. Classe Separada

Além da classe Produto,
deve ser criada de forma
separada a classe
Comparacao.

public class Comparacao
implements
Comparator<Produto>

3.  Classe Anonima

Uma classe
anônima é criada no
programa
principal.

A variável comp é
instanciada como
um objeto do tipo
Comparator.

4. expressão lambda com chaves
   Podemos deixar o
   programa menos
   verboso. Basta
   usar Expressões
   Lambda.

A forma mais simplifica é inserindo a Expressão Lambda , que é uma função anônima,
dentro do argumento.

5. A função removeIf(),
   remove da lista os
   produtos conforme a lógica
   dentro do argumento.
   Predicate
   Exemplo 5:
   Veja que há inferência que
   p é uma produto, sem
   precisar explicitar.

6. Uma instância da classe
   ProdutoPredicate foi
   inserida no argumento da
   função removeIf().
   Exemplo 6:
   Predicate
   Essa interface
   ProdutoPredicate constrói a
   lógica/critério que deve ser
   executado, quando chamado
   no código.

7. É uma referência para
   método utilizando método
   estático.
   Um método estático foi
   criado dentro da classe
   Produto e referenciada no
   programa principal

8. expressao lambda inline

Uma expressão lâmbida é
criada entro do programa
principal.
A variável pred é criada para
o tipo Predicate e possui a
lógica do que deve ser
executado.

A expressão lâmbida é
inserida diretamente no lugar
da variável.
Veja que há inferência que
p é uma produto, sem
precisar explicitar

9. implementacao consumer

A classe
PrecoAtualizado é
instanciada dentro do
forEach.
Consumer: implementação consumer
O método println também
pode ser executado dentro
do forEach.

10. Reference method
    O método
    staticPrecoAtualizado é
    criado dentro da classe
    Produto.
    Este método é chamado
    como argumento do
    fotEach no programa
    principal.

11. Expressão lambda declarada
    Uma variável cons
    do tipo Consumer é
    criada.
    A expressão
    lambda é
    desenvolvida.

12. implementação Function
    A classe UpperCaseName é instanciada dentro da função map().
    A list é transformada em stream e depois transformada em list novamente.

13. Reference method

O método
UpperCaseName é
criado dentro da classe
Produto.
Este método é chamado
como argumento do
map() no programa
principal.

14. Expressão lambda declarada

Uma variável func
do tipo Function é
criada.
A expressão
lambda é
desenvolvida em
func.

## Atividade

1. Reproduza o código anterior e aplique os
   10% nos produtos, utilizando o caminhos
   citados abaixo:
   Reference method com método estático.
   Expressão lambda declarada.
   Expressão lambda inline.
