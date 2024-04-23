import list.MyList;

import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    @Override
    public void add(T item) {

    }

    @Override
    public void add(T item, int index) {

    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {

    }

    @Override
    public void set(T item, int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(T item) {
        return 0;
    }

    @Override
    public int lastIndexOf(T item) {
        return 0;
    }

    @Override
    public boolean exists(T item) {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    private static class MyNode<T> {
        private final T element;
        private final MyNode<T> next;

        public MyNode(T element, MyNode<T> next, MyNode<T> prev) {
            this.element = element;
            this.next = next;
        }
    }

    private final MyNode<T> head;

    public MyLinkedList() {
        head = null;
        MyNode<T> tail = null;
        int size = 0;
    }

    // Implement all methods from MyList interface

    // ...

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private MyNode<T> currentNode;

        public LinkedListIterator() {
            currentNode = head;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            T element = currentNode.element;
            currentNode = currentNode.next;
            return element;
        }
    }

    // ...
}