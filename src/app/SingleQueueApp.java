package app;

import java.util.Queue;

import app.collection.SingleQueue;

public class SingleQueueApp {
    public static void main(String[] args) {
        
        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());
        System.out.println(queue.offer("Agung"));
        System.out.println(queue.offer("Maulana"));
        System.out.println(queue.offer("Belajar"));
        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());        
    }
}
