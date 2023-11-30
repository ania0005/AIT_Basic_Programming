package Hw1;

public class BoxAppRunner {


        public static void main(String[] args) {
            Book book = new Book("1IN-543","Winter", "Kron" );
            Book book1 = new Book("2IR-441","Summer", "Virt" );

            Book bookResult = book.getContent();
            Book book1Result = book1.getContent();

            Computer computer = new Computer(4322, "Laptop",3599.99); // обобщенный класс Box без использования generics
            Computer computer1 = new Computer(5521, "SmartPhone",1500.50 );


            System.out.println(computer.getContent());
            System.out.println(computer1.getContent());
            Box<Book> boxBook = new Box<>(new Book("3TT-5543", "Spring", "li"));
            System.out.println(boxBook.getContent() instanceof Book);
        }

}
