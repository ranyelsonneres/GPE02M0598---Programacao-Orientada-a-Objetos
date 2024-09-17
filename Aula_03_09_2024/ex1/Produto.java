package produto;

public class Produto {
	
	String nome;
    double preco;
    int quantidade;

    // Método para calcular o valor total no estoque
    public double calcularValorTotal() {
        return preco * quantidade;
    }

    // Método para exibir os dados do produto
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade no estoque: " + quantidade);
        System.out.println("Valor total no estoque: R$ " + calcularValorTotal());
    }

    
    public void entradaEstoque(int quantidadeAdicionada) {
        quantidade += quantidadeAdicionada;
    }

    // Método para remover unidades do estoque
    public void saidaEstoque(int quantidadeRemovida) {
        if (quantidadeRemovida <= quantidade) {
            quantidade -= quantidadeRemovida;
        } else {
            System.out.println("Quantidade removida excede a quantidade disponível no estoque.");
        }
    }
 

}
