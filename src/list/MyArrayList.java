package list;

import list.MyList;

import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private T[] elements;
    private int size;

    public MyArrayList() {
        elements = (T[]) new Object[5];
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    @Override
    public void add(T item) {
        if (size >= elements.length)
            increaseSize();
        elements[size++] = item;
    }

    private void increaseSize() {
        T[] newArr = (T[]) new Object[size * 2];
        for (int i = 0; i < size; i++)
            newArr[i] = elements[i];
        elements = newArr;
    }

    @Override
    public void add(T item, int index) {
        if(size==0){
            add(item);
            return;
        }
        CheckIndex(index);
        if(size >=elements.length)
            increaseSize();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = item;
        size++;
    }

    private void CheckIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }


    @Override
    public void addFirst(T item) {
        add(item,0);
    }

    @Override
    public void addLast(T item) {
        add(item);
    }

    @Override
    public void set(T item, int index) {
        CheckIndex (index);
        elements[index]=item;
    }

    @Override
    public T get(int index) {
        CheckIndex(index);
        return elements[index];
    }

    @Override
    public T getFirst() {
        return elements[0];
    }

    @Override
    public T getLast() {
        return elements[size-1];
    }

    @Override
    public void remove(int index) {
        CheckIndex(index);
        for(int i=index;i<size;i++)
            elements[i]=elements[i+1];
        size--;

    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(size-1);
    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(T item) {
        for(int i=0;i<size;i++)
            if(item.equals(elements[i]))
                return i;
        return -1;
    }

    @Override
    public int lastIndexOf(T item) {
        for(int i=size-1;i>=0;i--)
            if(item.equals(elements[i]))
                return i;
        return -1;
    }

    @Override
    public boolean exists(T item) {
        return indexOf(item)>=0;
    }

    @Override
    public T[] toArray() {
        T[] arr = (T[]) new Object[size];
        for(int i = 0; i<size;i++)
            arr[i]=elements[i];
        return arr;

    }

    @Override
    public void clear() {
        for(int i=0;i<size;i++)
            elements[i]=null;
    }

    @Override
    public int size() {
        return size;
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

}