# Trilha Java - Polimorfismo

## Aula realizada em 27/03/2023

### Exercicios

1. Escreva um código para o diagrama
apresentado ao lado. Use o conceito
de polimorfismo para sobrepor o
método getNome(). Instancie os
objetos PessoaFisica e
PessoaJuridica. O retorno deve
conter o nome e o cpf, se pessoa
física. Ou o nome e cnpj se pessoa
jurídica

Pessoa
- nome
- ----------
+ getNome()
+ setNome()

PessoaFisica
- cpf
- ----------
+ PessoaFisica()
+ getCpf()
+ setCpf()
+ getNome()

PessoaJuridica
- cnpj
- ---------
+ PessoaJuridica()
+ getCnpj()
+ setCnpj()
+ getNome()