package task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Jack");
        Student student3 = new Student(3, "Bob");

        student1.addBook("Java basic");
        student1.addBook("Java pro");
        student1.addBook("Spring");
        student1.addBook("Phyton");

        student2.addBook("HTML");
        student2.addBook("CSS");
        student2.addBook("JavaScript");
        student2.addBook("Spring");

        student3.addBook("Phyton");
        student3.addBook("C++");
        student3.addBook("C#");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        //Можно создать лист вторым способом - с помощью List.of. Но надо учитывать что
        //такой лист в дальнейшем невозможно изменить:

        List<Student> students1 = List.of(student1, student2, student3);

        // вывести список книг, прочитаных студентами
        // и не сожержащих подстроку Java

        Set<String> books = students.stream()
                .flatMap(x -> x.getBooks().stream())
                .filter(x -> !x.contains("Java"))
                .collect(Collectors.toSet());
        System.out.println(books);

        System.out.println("1 строка\n2строка");//?
        books.forEach(System.out::println);
        books.forEach(x -> System.out.println(x));
    }
}
