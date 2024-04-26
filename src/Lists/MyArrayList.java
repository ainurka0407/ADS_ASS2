package Lists;

import java.util.Iterator;

public class MyArrayList<T extends Object & Comparable<T>>  implements MyList<T> {
    private T[] arr ;
    private int size;
    private final int DEFAULT_capacity=5;






    public MyArrayList(int capacity){
        if(capacity <=0) {
            throw new IllegalArgumentException("Capacity<=0");
        }
        else {
            arr=(T[]) new Object[capacity];
            size=0;
        }
    }
    public MyArrayList(){
        arr = (T[]) new Object[DEFAULT_capacity];
        size= 0;
    }

    @Override
    public void add (T item){
        if(size>=arr.length) increaseBuffer();
        arr[size++] =item;
    }

    private void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = (T) arr[i];
        }
        arr = newArr;
    }

    @Override
    public void set ( int index, T item){
        checkIndex(index);
        arr[index] = item;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("index not correct");
        }

    }

    @Override
    public void add ( int index, T item){
        checkIndex(index);
        if(size>=arr.length) increaseBuffer();
        for (int i = size ; i > index  ; i--) {
            arr[i]=arr[i-1];

        }
        arr[index]=item;
        size++;
    }

    @Override
    public void addFirst (T item){
        add(0,  item);
    }

    @Override
    public void addLast (T item){
        add(size-1, item);

    }

    @Override
    public T get ( int index){
        checkIndex(index);
        return (T) arr[index];
    }

    @Override
    public T getFirst () {
        return (T) arr[0];
    }

    @Override
    public T getLast () {
        return (T)arr[size-1];
    }

    @Override
    public void remove ( int index){
        checkIndex(index);
        if (size * 2 < arr.length)
            decreaseSize();
        for(int i = index; i < size; i++)
            arr[i] = arr[i+1];
        size--;

    }
    private void decreaseSize() {
        T[] newArr = (T[]) new Object[(size / 2)];
        for (int i = 0; i < size; i++)
            newArr[i] = arr[i];
        arr = newArr;
    }

    @Override
    public void removeFirst () {
        remove(0);

    }

    @Override
    public void removelast () {
        remove(size-1);

    }

    @Override
    public void sort () {
        for (int i = 0; i < size - 1; i++)
            for (int j = i + 1; j < size; j++)
                if (arr[i].compareTo(arr[j]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }

    }

    @Override
    public int indexOf (T item){

        for (int i = 0; i < size; i++)
            if (item ==(arr[i]))
                return i;
        return -1;
    }

    @Override
    public int lastIndexOf (T item){
        for(int i = size - 1; i >= 0; i--)
            if(item ==(arr[i]))
                return i;
        return -1;
    }

    @Override
    public boolean exists (T item){
        return indexOf(item) >= 0;
    }

    @Override
    public T[] toArray () { T[] array = (T[]) new Object[size];
        for (int i = 0; i < size; i++)
            array[i] = arr[i];
        return array;
    }

    @Override
    public void display() {
        for( T elem:arr){
            if( elem == null) break;
            System.out.print(elem+" ");
        }

    }

    @Override
    public void clear () {
        for(int i = 0; i < size; i++) {
            arr[i] = null;
        }
    }

    @Override
    public int size () {
        return size;
    }



    @Override
    public Iterator iterator() {
        return new MyIterator();
    }
    private class MyIterator implements Iterator<T> {
        int index=0;

        public MyIterator() {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return index<size;
        }

        @Override
        public T next() {
            return arr[index++];
        }
    }
}



