package Collection;

public interface MyList<E> {
    void add(E o);
    E get(int index);
    void set(E o, int index);
    int size();
    boolean contains(E o);
    boolean remove(E o);
    E removeByIndex(int index);


}
