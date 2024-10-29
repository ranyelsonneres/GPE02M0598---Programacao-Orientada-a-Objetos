package colecoes;


import java.util.ArrayList; //importar a classe

public class ExemploArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lista - pode ter elementos duplicados
		ArrayList<String> nomes = new ArrayList<>();
		
		//adicionar de maneira ordenada
		//permite elementos duplicados
		nomes.add("Alice");
		nomes.add("Alice");
		nomes.add("Bob");
		
		//visualizar
		System.out.println("Nomes: " + nomes);
		
		//tamanho
		System.out.println("Tamanho: " + nomes.size());
		
		//remover
		nomes.remove("Bob");
		System.out.println("Nomes: " + nomes);
		System.out.println("Tamanho: " + nomes.size());
		
		//verificar algum item da lista
		if (nomes.contains("Bob")) {
			System.out.println("Encontrou!");
		} else {
			System.out.println("Não encontrou!");
		}
		
		//zerar a lista
		nomes.clear();
		System.out.println("Nomes: " + nomes);
		System.out.println("Lista vazia? " + nomes.isEmpty());
	}

}
