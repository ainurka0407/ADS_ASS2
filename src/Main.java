import Lists.MyArrayList;
import Lists.MyLinkedList;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        System.out.println("        queue test                ");

        System.out.println("queue empty " + queue.isEmpty());
        System.out.println("queue size: " + queue.size());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();

        System.out.println("queue peek "+queue.peek());

        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");



        System.out.println("        stack test              ");

        MyStack<Integer> stack = new MyStack<>();
        System.out.println("Is stack empty? " + stack.empty());
        System.out.println("Stack size: " + stack.size());


        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Is stack empty? " + stack.empty());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        System.out.println("Popping element "+ stack.pop());


        System.out.println("Is stack empty? " + stack.empty());

        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("                        ");
        System.out.println("        MinHeap test    ");

        MyMinHeap minHeap = new MyMinHeap();
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(5);
        minHeap.insert(15);

        System.out.println("Min heap:");
        minHeap.printHeap();

        System.out.println("Size of heap: " + minHeap.size());


        System.out.println("Extracting min element: " + minHeap.extractMin());
        System.out.println("Min heap after extraction:");
        minHeap.printHeap();


    }


}