# Trilha Java – (POO) Viisibilidade e Métodos Especiais

## Aula foi feita no dia 15/03/2023

# Atividade 1

Fazer um programa para ler os dados de um
produto em estoque (nome, preço e quantidade
no estoque). Em seguida mostrar os dados do
produto (nome, preço, quantidade no estoque,
valor total no estoque).
Realizar uma entrada no estoque e mostrar
novamente os dados do produto atualizado.
Realizar uma saída no estoque e mostrar
novamente os dados do produto atualizado.
Para resolver este problema, você deve criar
uma CLASSE conforme projeto ao lado.

Produto

- nome: String

# preco: double

# quantidade: int

- totalValorEmEstoque(): double
- addProdutos(): void
- removeProdutos(): void

Exemplo 1

Métodos Especiais
Para construir o objeto.
Pode-se usar os atributos.
Mas é muito mais conveniente e
seguro usar os métodos get e set

c1 = new Caneta
c1.setModelo("Bic")
c1.setCor("Vermelho")
c1.setPonta(0.7)
Escrever(c1.getModelo())
Escrever(c1.getCor())

Atividade 2

Proposta de melhoria:
Ao executar o comando abaixo, instanciamos um "produto" com seus atributos
vazios.

product = new Product();

Memoria :

nome preco quantidade
null 0.0 0

Entretanto, faz sentido um produto que não tem nome? Faz sentido um produto
que não tem preço? Com o intuito de evitar a existência de produtos sem nome e
sem preço, refaça o programa anterior com a inserção do construtor, tornando
obrigatória a iniciação desses valores
