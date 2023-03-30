package Atividade2;

import java.util.Locale;
import java.util.Scanner;

public class Atividade {
   public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("DADOS DO PRODUTO");
        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Preco: ");
        double preco = entrada.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = entrada.nextInt();
        System.out.println();

        Produto produto = new Produto(nome, preco, quantidade);
        System.out.println("Dados dos Produtos: ");
        produto.status();
        System.out.println();

        System.out.print("Entre com o numero de produtos para adicionar no estoque: ");
        quantidade = entrada.nextInt();
        produto.addProdutos(quantidade);
        System.out.println();

        System.out.println("Dados Atualizados: ");
        produto.status();
        System.out.println();

        System.out.print("Entre com o numero de produtos para ser removido do estoque: ");
        quantidade = entrada.nextInt();
        produto.removeProdutos(quantidade);
        System.out.println();

        System.out.println("Dados atualizados: ");
        produto.status();
        entrada.close();
  
  }
}
