package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        // Criação e inicialização da Queue
        Queue<String> pedidos = new LinkedList<String>();

        // 1. Adicionando elementos à fila com add e offer
        pedidos.add("Pedido 1");
        pedidos.offer("Pedido 2");
        pedidos.offer("Pedido 3");

        // 2. Visualizando o elemento no início da fila com element e peek
        System.out.println("Primeiro pedido (element): " + pedidos.element()); // Saída: Pedido 1
        System.out.println("Primeiro pedido (peek): " + pedidos.peek()); // Saída: Pedido 1

        // 3. Removendo elementos da fila com remove e poll
        System.out.println("Processando e removendo pedido: " + pedidos.remove()); // Saída: Pedido 1
        System.out.println("Processando e removendo pedido: " + pedidos.poll()); // Saída: Pedido 2

        // 4. Verificando o próximo elemento após remoções
        System.out.println("Próximo pedido na fila: " + pedidos.peek()); // Saída: Pedido 3

        // 5. Removendo o último elemento
        pedidos.poll();

        // 6. Tentando verificar o próximo elemento em uma fila vazia
        System.out.println("Fila vazia (peek): " + pedidos.peek()); // Saída: null
        System.out.println("Fila vazia (element): " + (pedidos.isEmpty() ? "Fila está vazia" : pedidos.element())); // Tratamento de exceção
    }
}
