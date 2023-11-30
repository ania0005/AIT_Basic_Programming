package L16Hw2;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, int year, String isbn, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
    }


    public void settitle(String title) {
        this.title = title;
    }

    public String gettitle() {
        return this.title;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public String getauthor() {
        return this.author;
    }

    public void setyear(int year) {
        this.year = year;
    }

    public int getyear() {
        return this.year;
    }

    public void setisbn(String isbn) {
        this.isbn = isbn;
    }

    public String getisbn() {
        return this.isbn;
    }

    public boolean getisBorrowed() {
        return this.isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }



        public void displayKatalog() {
            System.out.println(this.title + "  " + this.author +
                    "  " + this.year + "  " + this.isbn + "  " + this.isBorrowed);
    }
}





