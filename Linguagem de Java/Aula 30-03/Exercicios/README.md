# Trilha Java - Exercicios de Metodos especiais

## Aula realizada em 30/03/2023

# Exercicios

1. Um site de internet registra um log
   de acessos dos usuários. Um
   registro de log consiste no nome de
   usuário (apenas uma palavra) e o
   instante em que o usuário acessou o
   site no padrão ISO 8601, separados
   por espaço, conforme exemplo.
   Fazer um programa que leia o log
   de acessos a partir de um arquivo,
   e daí informe quantos usuários
   distintos acessaram o site.

Crie uma arquivo .txt e cole tais acessos:
jose 2018-08-26T20:45:08Z
alex 2018-08-26T21:49:37Z
pedro2018-08-27T03:19:13Z
jose 2018-08-27T08:11:00Z
jeniffer3 2018-08-27T09:19:24Z
alex 2018-08-27T22:39:52Z
jose 2018-08-28T07:42:19Z
Execução:
Entre com o caminho: C:\ÁreadeTrabalho\logAcesso.txt
Total users: 4

2. Em um portal de cursos online, cada
   usuário possui um código único,
   representado por um número inteiro.
   Cada instrutor do portal pode ter vários
   cursos, sendo que um mesmo aluno pode
   se matricular em quantos cursos quiser.
   Assim, o número total de alunos de um
   instrutor não é simplesmente a soma dos
   alunos de todos os cursos que ele possui,
   pois pode haver alunos repetidos em mais
   de um curso.
   Atividade 2
   O instrutor José possui três
   cursos A, B e C, e deseja saber
   seu número total de alunos.
   Seu programa deve ler os alunos
   dos cursos A, B e C do instrutor
   José, depois mostrar a quantidade
   total e alunos dele, conforme
   exemplo.

Quantos estudantes para o curso A? 3
21
35
22
Quantos estudantes para o curso B? 2
21
50
Quantos estudantes para o curso C? 3
42
35
13
Total de Estudantes: 6

3. Na contagem de votos de uma
   eleição, são gerados vários registros
   de votação contendo o nome do
   candidato e a quantidade de votos
   (formato .csv) que ele obteve em uma
   urna de votação. Você deve fazer um
   programa para ler os registros de
   votação a partir de um arquivo, e daí
   gerar um relatório consolidado com
   os totais de cada candidato.

Crie uma arquivo .txt e cole tais informações:
Pitter Jonas,15
Steven Green,22
Ana Sarah,21
Pitter Jonas,30
Ana Sarah,15
Steven Green,27
Steven Green,22
Ana Sarah,25
Pitter Jonas,31
Execução:
Entre com o caminho: C:\ÁreadeTrabalho\contaVoto.txt
Pitter Jonas: 76
Steven Green: 71
Ana Sarah: 61

4. Fazer um programa para ler um número inteiro N e depois os dados (id, nome e
   salario) de N funcionários. Não deve haver repetição de id. Em seguida, efetuar o
   aumento de X por cento no salário de um determinado funcionário. Para isso, o
   programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
   mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos
   funcionários, conforme exemplos no próximo slides. Lembre-se de aplicar a
   técnica de encapsulamento para não permitir que o salário possa ser mudado
   livremente. Um salário só pode ser aumentado com base em uma operação de
   aumento por porcentagem dada.

Funcionario

- Id: Integer
- Name: String
- Salario: Double

* aumentoSalario(porcentagem : dobule): void

Quantos funcionarios serão registrados? 1
Funcionario #1:
Id: 0001
Nome: Jose Carlos
Salario: 3400
Entre com o Id do funcionario que vai receber aumento: 0001
Entre com a porcentagem: 10
Lista de Funcionarios:
1, Jose Carlos, 3740.00
