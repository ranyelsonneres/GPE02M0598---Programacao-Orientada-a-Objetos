package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        // 1. Criação de um HashSet
        Set<String> frutas = new HashSet<String>();

        // 2. Adicionando elementos ao Set
        frutas.add("pera");
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Maçã"); // Não será adicionada, pois é uma duplicata

        // 3. Exibindo os elementos do Set
        System.out.println("Frutas no Set: " + frutas);

        // 4. Verificando se um elemento está presente
        if (frutas.contains("Banana")) {
            System.out.println("Banana está no Set.");
        }

        // 5. Removendo um elemento
       frutas.remove("Laranja");
       // System.out.println("Após remover Laranja: " + frutas);

        // 6. Iterando sobre os elementos do Set
        System.out.println("Iterando sobre as frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // 7. Verificando o tamanho do Set
        System.out.println("Tamanho do Set: " + frutas.size());

        // 8. Limpando o Set
       frutas.clear();
       System.out.println("O Set está vazio? " + frutas.isEmpty());
    }
}

