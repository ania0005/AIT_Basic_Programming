package ArryLisr;

import java.util.Arrays;
import java.util.Objects;

public class MyArryList<T> implements MyList <T>{

    private Object[] elements;
    private int size = 0;

    public MyArryList(){
        elements = new Object[10];
    }
    @Override
    public void add(T element) {
        if(size == elements.length){
            growSize();
        }
        elements[size++] = element;
    }
    private void growSize(){
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Неверный индекс!");
        }
        return (T) elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
//        if(size == 0){
//            return true;              //рассписанное решение
//        } else return false;
//    }
        return size == 0;               //короткое решение
    }

    @Override
    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        elements[index] = element;
        return;
    }

    @Override
    public boolean contains(T element) {
            for (int i = 0; i < size; i++) {
                if(Objects.equals(element, elements[i])){
                    return true;
                }
            }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
           // throw new IllegalArgumentException("Неверный индекс!");
            System.out.println("Неверный индекс!");
            return null;
        }
            System.arraycopy(elements, index + 1, elements, index, size-- - (1 + index));
            return (T) elements[index];
    }


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
}
