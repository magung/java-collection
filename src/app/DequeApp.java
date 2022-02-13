package app;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.offerLast("Agung");
        stack.offerLast("Maulana");
        stack.offerFirst("Programmer");
        for (var value : stack) {
            System.out.println(value);
        }

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> deque = new LinkedList<>();
        deque.offerLast("Agung");
        deque.offerLast("Maulana");
        deque.offerLast("Programmer");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());

    }
}
