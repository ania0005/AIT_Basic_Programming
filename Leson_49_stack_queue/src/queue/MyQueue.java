package queue;

import interfaces.MyCollection;

public class MyQueue<T> implements MyCollection<T> {

private Object[] elements = new Object[7];
private int size;
private int head;
private int tail;

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
        if(!isEmpty()){
            tail++;
        }
        if(tail == elements.length - 1){
            System.out.println("Queue is crowded");
            return;
        }
        if(element == null) {
            System.out.println("Element is null!");
            return;
        }
        elements[tail] = element;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()){
            System.out.println("Queue is crowded");
            return null;
        }
        T element = (T) elements[head];
        elements[head++] = null;
        size--;
        if (isEmpty()){
            head = 0;
            tail = 0;
        }
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()){
            System.out.println("Queue is crowded");
            return null;
        }
        T element = (T) elements[head];
        return element;
    }


    @Override
    public int search(T element) {
        if (isEmpty()) {
            System.out.println("Queue is crowded");
            return -1;
        }
        for (int i = head; i <= tail; i++) {
            if (elements[i].equals(element)){
                return i - head;
            }
        }
        return -1;
    }

    public String toString() {
        if(isEmpty()){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = head; i <= tail; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}
