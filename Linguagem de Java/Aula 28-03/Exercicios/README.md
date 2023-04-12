# Trilha Java - Atividade de Polimorfismo

## Exercicios da aula dia 28-03-2023

## Atividades

1. Uma empresa possui funcionários próprios e
   terceirizados. Para cada funcionário, deseja-se
   registrar nome, horas trabalhadas e valor por
   hora. Funcionários terceirizado possuem ainda
   uma despesa adicional.
   O pagamento dos funcionários corresponde ao
   valor da hora multiplicado pelas horas
   trabalhadas, sendo que os funcionários
   terceirizados ainda recebem um bônus
   correspondente a 110% de sua despesa adicional.

2. Fazer um programa para ler os dados de N
   funcionários (N fornecido pelo usuário) e
   armazená-los em uma lista. Depois de ler todos os
   dados, mostrar nome e pagamento de cada
   funcionário na mesma ordem em que foram
   digitados. Construa o programa conforme projeto
   ao lado. Insira setters, getters e construtores.
   O método pagamento() em
   FuncionarioTercerizado deve sobrepor o
   de Funcionario.
   Por fim, instancie objetos e imprima o resultado.

Funcionario

- nome
- horas
- valorPorHora

* pagamento();

FuncionarioTercerizado

- nome
- horas
- valorPorHora

* pagamento();

Dica:
ArrayList é uma parte da estrutura de coleção e está presente no pacote
java.util. Ele nos fornece matrizes dinâmicas em Java. Porém, pode ser mais
lento do que os arrays padrão, mas pode ser útil em programas onde é
necessária muita manipulação no array. Esta classe é encontrada no
pacote java.util .
Portanto, instancie objetos como uma lista de funcionários. Algo do tipo:
List<Funcionario> list = new ArrayList<>();

2. Suponha que uma dada empresa
   trabalha com a venda de produtos que
   precisam ser organizados através de
   dados como preços e etc.
   Crie um programa para ler os dados
   de N produtos (N fornecido pelo
   usuário). Ao final, mostre a etiqueta
   de preço de cada produto na mesma
   ordem em que foram digitados.

Todo produto possui nome e preço.
Produtos importados possuem uma
taxa de alfândega, e produtos usados
possuem data de fabricação. Estes
dados específicos devem ser
acrescentados na etiqueta de preço
conforme exemplo (próxima página).
Para produtos importados, a taxa e
alfândega deve ser acrescentada ao
preço final do produto

Favor implementar o
programa conforme
projeto ao lado.

Produto

- nome
- preco

* etiquetaPreco();

ProdutoImportado

- taxaAlfandega

* precoTotal();
* etiquetaPreco();

ProdutoUsado

- dataFabricacao

* etiquetaPreco();

Dica:
Leve em consideração que a etiqueta a ser impressa como resultado final,
deve seguir a ideia proposta abaixo. Este é apenas uma exemplo de como
deve ser impresso o resultado conforme os dados fornecidos.
ETIQUETAS PREÇO:
Tablet R$ 2800.00 (Taxa Alfandega: $ 20.00)
Notebook R$ 8000.00
Iphone10 (usado) R$ 900.00 (Data de Fabricacao: 25/04/2018)

3. Desenvolva o código apropriado para
   um dos últimos exemplos apresentado
   na aula de polimorfismo. Siga o
   diagrama ao lado e as informações
   apresentadas.

Implemente o Polimorfismo de
Sobreposição, pois o método
“emitirSom”:
Possui assinaturas semelhantes.
Estão em classes diferentes.
superClasse é abstrato.

Animal
Mamífero
peso
idade
membros
[abs]locomover( )
[abs]alimentar( )
[abs]emitirSom( )
CorPelo
emitirSom( ) // "som de mamífero"
Cachorro
emititSom() // "Au Au Au Au..."
reagir()
enterrarOsso()
abanarRabo()

Além disso, suponha que o método
“reagir()”, da classe cachorro, tenha
comportamentos diferentes.
Para tipo de ação o “reagir()” pode ser
de forma diferente.
Isso é conhecido como polimorfismo
de sobrecarga. Portanto, implemente
também o polimorfismo de sobrecarga.
Siga a regra apresentada ao lado.
Acrescente o que achar necessário.

Reagir( )
Falar frase Agradável: abanar e latir
Agressiva: rosnar
Horário do dia Manhã: abanar
Tarde: abanar e latir
Noite: ignorar
dono É dono: abanar
Não é: rosnar e latir
Idade e peso
Novo < 5
Leve < 10
Novo e leve: abanar
Novo e pesado: latir
Velho e leve: rosnar
Velho e pesado: ignorar

4. Nesta atividade leia atentamente o
   conteúdo que será apresentado nos
   próximos slides. Este conteúdo aborda o
   processo de ler arquivos textos com as
   Classes Files e Scanner.
   Após a leitura cuidadosa. Reproduza o
   código apresentado como exemplo.
   Para fazer a leitura crie um arquivo qualquer
   de texto do tipo .txt
   Atividade 4
   Lendo arquivo texto com classes File e Scanner:
   Trabalhamos com as Classes: (os links abaixo apresenta mais informações sobre o tema)
   File - Representação abstrata de um arquivo e seu caminho
   File (Java SE 10 & JDK 10 ) (oracle.com)
   Scanner - Leitor de texto
   Scanner (Java SE 10 & JDK 10 ) (oracle.com)
   IOException (Exception)
   IOException (Java SE 10 & JDK 10 ) (oracle.com)
   Atividade 4: Trabalhando com Arquivos
   No programa apresentado na próxima página, um objeto File é instanciado, veja
   que existe uma biblioteca do mesmo sendo importada.
   Em seguida, um objeto Scanner também é instanciado para fazer a leitura do
   arquivo.
   Como essa leitura pode levar algumas exceções, é importante que um bloco try
   catch seja feito.
   A biblioteca IOException também é importada.
   Essa é uma das formas de ler arquivos!!

5. Nesta atividade leia atentamente o
   conteúdo que será apresentado nos
   próximos slides. Este conteúdo aborda
   o processo de ler arquivos textos com
   as Classes FileReader
   e BufferedReader.
   Após a leitura cuidadosa.
   Reproduza o código apresentado
   como exemplo.
   Para fazer a leitura crie um arquivo
   qualquer de texto do tipo .txt
   Atividade 5
   Uma outra forma de ler arquivos é usando as classes:
   FileReader (stream de leitura de caracteres a partir de arquivos):
   FileReader (Java SE 10 & JDK 10 ) (oracle.com)
   BufferedReader (deixa a leiura mais rápido e pode ser usado com FileReader):
   BufferedReader (Java SE 10 & JDK 10 ) (oracle.com)
   Essa é uma das formas de ler arquivos!!

Dica de hoje
Toda classe em Java é uma subclasse da classe Object.
Object possui os seguintes métodos:
getClass - retorna o tipo do objeto
equals - compara se o objeto é igual a outro
hashCode - retorna um código hash do objeto
toString - converte o objeto para string
Pesquisa um pouco mais sobre!!
Boa pesquisa!!
Os dois códigos apresentados na aula de hoje tem um grande potencial para a
leitura de arquivos.
Faça também uma leitura do arquivos abaixo para compreender melhor o uso
de ambos.
java - Specific difference between bufferedreader and filereader - Stack
Overflow
Essa é uma das formas de ler arquivos!!
