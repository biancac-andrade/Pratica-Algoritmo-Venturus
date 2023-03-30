# Trilha Java - Herancas

## Aula realizada em 22/03/2023

### Atividade

1. Crie uma programa que siga as instruções conforme o diagrama de classe ao
lado. Crie uma lógiga para a senha e instancie objetos do tipo funcionário e
do tipo Gerente. Veja que a todo momento que for criado um objeto do tipo
Gerente, este objeto possuirá também os atributos definidos na classe
Funcionario, pois Gerente é um Funcionario!


Funcionario
- nome: String
- cpf: String
- salario: double
Getters
Setters
----------------------

        ^
        
----------------------
Gerente
- senha: int
- autentica(int): boolean


2. Faça uma classe “Animal” com um método
“falar” e acrescente os atributos “Nome” e
“Idade”. Faça as classes Homem, Cão,
Gato e Papagaio, herdando de animal,
redefinindo o método “falar” para retornar
“Oi”, “Au au”, “Miau” e "Qué Café",
respectivamente. Acrescente o atributo
fome e o método comer(), caso o animal
esteja com fome dê a comida adequada.
Caso contrário, diga que não está com
fome. Instancie todos os objetos possíveis.
Ao instanciar apresente o objeto e o
método “Falar” e "Comer".