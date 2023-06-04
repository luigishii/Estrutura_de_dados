package fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteMergeFilas {
    public static Queue<Integer> mergeQueues(
        Queue<Integer> queue1,
        Queue<Integer> queue2
    ) {
        Queue<Integer> mergedQueue = new LinkedList<>();

        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            if (!queue1.isEmpty()) {
                mergedQueue.offer(queue1.poll());
            }
            if (!queue2.isEmpty()) {
                mergedQueue.offer(queue2.poll());
            }
        }

        return mergedQueue;
    }

    public static void main(String[] args) {
        Queue<Integer> dados1 = new LinkedList<>();
        dados1.offer(1);
        dados1.offer(3);
        dados1.offer(5);
        dados1.offer(7);
        dados1.offer(9);

        Queue<Integer> dados2 = new LinkedList<>();
        dados2.offer(2);
        dados2.offer(4);
        dados2.offer(6);
        dados2.offer(8);
        dados2.offer(10);
        dados2.offer(12);
        dados2.offer(14);

        Queue<Integer> resultado = mergeQueues(dados1, dados2);

        while (!resultado.isEmpty()) {
            System
                .out
                .print(resultado.poll() + " ");
        }
    }
}
