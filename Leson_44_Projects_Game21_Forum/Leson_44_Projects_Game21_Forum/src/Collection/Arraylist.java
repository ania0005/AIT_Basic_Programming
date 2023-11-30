package Collection;

import java.util.Arrays;

public class Arraylist <E> implements MyList<E> {

    private E[] sourse;
    private  int size;
    public Arraylist(){
        this.sourse = (E[])(new Object[16]);
    }
    public Arraylist(int copacity){
        sourse = (E[])(new Object[16]);
    }
    @Override
    public void add(E o) {
      if(size == sourse.length){
          int newSize = sourse.length + (sourse.length / 2);
          sourse = Arrays.copyOf(sourse, newSize);
      }
      sourse[size++] = o;
    }

    @Override
    public E get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return (E) sourse[index];
    }

    @Override
    public void set(E o, int index) {
        if(index < 0 || index >= size || o == null) {
            throw new IndexOutOfBoundsException();
        }
        if(size == sourse.length) {
            int newSize = sourse.length + (sourse.length / 2);
            sourse = Arrays.copyOf(sourse, newSize);
        }
        System.arraycopy(sourse, index, sourse, index+1, sourse.length - index);
        sourse[index] = o;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E o) {
        for (int i = 0; i < sourse.length; i++) {
            if(sourse[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(E o) {
        for (int i = 0; i < sourse.length; i++) {
            if(sourse[i].equals(o)){
                sourse[i] = null;
                System.arraycopy(sourse, i+1, sourse, i, sourse.length - 1 - i);
                return true;
            }
        }
            return false;
    }

    @Override
    public E removeByIndex(int index) {
        for (int i = 0; i < sourse.length; i++) {
            if(i == index){
                sourse[i] = null;
                System.arraycopy(sourse, i+1, sourse, i, sourse.length - 1 - i);
                return sourse[i];
            }
        }
       return null;
    }
}
