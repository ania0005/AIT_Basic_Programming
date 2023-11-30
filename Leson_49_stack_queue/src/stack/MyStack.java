package stack;

import interfaces.MyCollection;

import java.util.Arrays;

public class MyStack <T> implements MyCollection <T> {
    private Object[] elements = new Object[7];
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(T element) {
        if(size == elements.length){
            System.out.println("Stack is crowded");
            return;
        }
        if(element == null){
            System.out.println("Element is null!");
            return;
        }
        elements[size++] = element;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        size--;
        T element = (T) elements[size];
        elements[size] = null;
        return element;
    }

    @Override
    public T peek() {
        if(isEmpty()){
        System.out.println("Stack is empty");
        return null;
    }
        T element = (T) elements[size - 1];
        return element;
    }

    @Override
    public int search(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)){
                return size - i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
    // *****

}
