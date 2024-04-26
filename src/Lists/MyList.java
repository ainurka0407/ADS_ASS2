package Lists;

public interface MyList<T>  extends  Iterable<T> {
    void add(T item);
    void set(int index, T item);
    void add(int index, T item);
    void addFirst(T item);
    void addLast(T item);
    T get (int index);
    T getFirst();
    T getLast();
    void remove(int index );
    void removeFirst();
    void removelast();
    void sort();
    int indexOf(T item);
    int lastIndexOf(T item);
    boolean exists(T item);
    public Object[] toArray();
    void display();
    void clear();
    int size();

}