import list.MyList;

import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private final Object[] elements;
    private final int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    // Implement all methods from MyList interface

    // ...

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

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

    private class ArrayListIterator implements Iterator<T> {
        private int currentIndex;

        public ArrayListIterator() {
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T next() {
            return (T) elements[currentIndex++];
        }
    }

    // ...
}