package LinkedList;

import java.util.Objects;

public class MyLinkedinTest<T> implements MyList<T> {
    private int size;
    private Node<T> first;


    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            first = new Node<>(element);
            return;
        }
        ;
        Node<T> current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void set(int index, T element) {

    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }
}
