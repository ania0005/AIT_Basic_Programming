package L16Hw2;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        Book book1 = new Book("Mathematic", "Ivanov", 2022, "45BA8", true);
        Book book2 = new Book("Physik", "Petrov", 2021, "87BA8", false);
        Book book3 = new Book("Chemie", "Smirnov", 2020, "12BA8", true);
        Book book4 = new Book("Biology", "Sidorov", 2003, "12CA8", true);
        Book book5 = new Book("Astronomy", "Nazarov", 2022, "72BW8", true);
        Book book6 = new Book("Geometry", "Novikov", 2009, "13BA8", false);
        Book book7 = new Book("Algebra", "Volin", 2017, "52BS8", false);



        Book[] books = new Book[10];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;
        books[5] = book6;
        books[6] = book7;
        books[7] = addBook();
        books[8] = addBook();


        book1.displayKatalog();
        book2.displayKatalog();
        book3.displayKatalog();
        book4.displayKatalog();
        book5.displayKatalog();
        book6.displayKatalog();
        book7.displayKatalog();

    }



    public static Book addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ISBN книги");
        String isbn = scanner.nextLine();
        System.out.println("Введите название книги");
        String title = scanner.nextLine();
        System.out.println("Введите автора книги");
        String author = scanner.nextLine();
        System.out.println("Введите год издания книги");
        int year = scanner.nextInt();
        Book bookNew = new Book(title, author, year, isbn, true);
        bookNew.displayKatalog();
        return  bookNew;


    }

    }

