package Hw1;

public class Book {
    public String isbn;
    public String title;
    public String autor;

    public Book(String isbn, String title, String autor) {
        this.isbn = isbn;
        this.title = title;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public Book getContent() {
        return this.getContent();
    }
}
