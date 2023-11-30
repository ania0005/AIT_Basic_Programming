package LinkedList;

public interface MyList<T>{
    void add(T element);
    T get(int index);
    int size();
    boolean isEmpty();
    void set(int index, T element);
    boolean contains(T element);
    T remove(int index);

}
