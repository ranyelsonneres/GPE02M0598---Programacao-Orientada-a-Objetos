package colecoes;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        // Criação e inicialização do Map
        Map<String, Integer> idades = new HashMap<String, Integer>();
       
        // 1. Adicionando pares chave-valor
        idades.put("João", 25);
        idades.put("Maria", 30);
        idades.put("Pedro", 22);

        // 2. Obtendo um valor com a chave
        System.out.println("Idade de Maria: " + idades.get("Maria")); // Saída: 30

        // 3. Verificando se uma chave existe
        if (idades.containsKey("João")) {
            System.out.println("João está na lista.");
        }

        // 4. Removendo um par chave-valor
        idades.remove("Pedro");
        System.out.println("Após remover Pedro: " + idades);

        // 5. Iterando sobre as entradas do Map
        System.out.println("Listando idades:");
        for (Map.Entry<String, Integer> entry : idades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 6. Verificando o tamanho do Map
        System.out.println("Total de pessoas: " + idades.size());

        // 7. Limpando o Map
        idades.clear();
        System.out.println("Após limpar, o Map está vazio? " + idades.isEmpty());
    }
}

