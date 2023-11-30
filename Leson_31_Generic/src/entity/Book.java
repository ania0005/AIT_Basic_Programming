package entity;

public class Book{
    public Integer id;
    public String title;

    public Book(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    private final Book[] arrayBook = new Book[10];


}

   
