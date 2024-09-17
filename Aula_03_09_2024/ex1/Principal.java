package produto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Criar um objeto Produto
        Produto produto = new Produto();

        // Ler os dados do produto
        System.out.print("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: R$ ");
        produto.preco = scanner.nextDouble();

        System.out.print("Digite a quantidade no estoque: ");
        produto.quantidade = scanner.nextInt();

        // Mostrar os dados iniciais do produto
        System.out.println("\nDados do produto:");
        produto.exibirDados();

        // Realizar uma entrada no estoque
        System.out.print("\nDigite a quantidade para adicionar ao estoque: ");
        int quantidadeAdicionar = scanner.nextInt();
        produto.entradaEstoque(quantidadeAdicionar);
        System.out.println("\nDados do produto após entrada no estoque:");
        produto.exibirDados();

        // Realizar uma saída no estoque
        System.out.print("\nDigite a quantidade para remover do estoque: ");
        int quantidadeRemover = scanner.nextInt();
        produto.saidaEstoque(quantidadeRemover);
        System.out.println("\nDados do produto após saída do estoque:");
        produto.exibirDados();
        
        

        scanner.close();

	}

}
