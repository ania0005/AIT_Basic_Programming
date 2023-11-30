package Hw1;
//Задача 1
//Посмотрите вокруг себя. Напишите три класса, описывающие какие-то сущности вокруг Вас.
//Например, опишите студента, стол, клавиатуру и т.д.
//Вы можете выбрать свои сущности(объекты) для описания.

public class Documents {
    private String nummer;
    private String validity;

    public Documents(String nummer,String validity ) {
        this.nummer = nummer;
        this.validity = validity;
    }
    public void aboutDocument() {
       System.out.print("Document\t" + nummer +"\t"+ validity) ;
    }

}
