package colecoes;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // 1. Criação de um ArrayList para armazenar nomes
        ArrayList<String> nomes = new ArrayList<String>();

        // 2. Adicionando elementos ao ArrayList
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carlos");
        nomes.add("Diana");

        // 3. Exibindo os elementos do ArrayList
        System.out.println("Nomes na lista: " + nomes);

        // 4. Removendo um elemento da lista
        nomes.remove("Bob");
        System.out.println("Após remover Bob: " + nomes);

        // 5. Verificando o tamanho do ArrayList
        System.out.println("Tamanho da lista: " + nomes.size());

        // 6. Verificando se um elemento está presente na lista
        if (nomes.contains("Alice")) {
            System.out.println("A lista contém o nome Alice.");
        }

        // 7. Iterando sobre os elementos do ArrayList
        System.out.println("Iterando sobre os nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // 8. Limpando todos os elementos do ArrayList
        nomes.clear();
        System.out.println("Após limpar, a lista está vazia? " + nomes.isEmpty());
    }
}
