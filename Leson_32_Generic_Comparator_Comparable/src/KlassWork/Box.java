package KlassWork;

public class Box<T> {
    private T value;
    public Box(T value){
        this.value = value;
    }
    public T getContent(){
return this.value;
    }

}
