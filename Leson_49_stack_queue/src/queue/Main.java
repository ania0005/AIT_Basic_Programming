package queue;

import interfaces.MyCollection;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> queue = new MyQueue<>();

        System.out.println("Empty? - " + queue.isEmpty());
        System.out.println("Size is - " + queue.size());
        System.out.println(queue);
        System.out.println();
        System.out.println();

        queue.push("AAA");
        queue.push("BBB");
        queue.push("DDD");
        queue.push("EEE");

        System.out.println("Empty? - " + queue.isEmpty());
        System.out.println("Size is - " + queue.size());
        System.out.println(queue);
        System.out.println();

        System.out.println("Delete element - " + queue.pop());
        System.out.println("Size is - " + queue.size());
        System.out.println(queue);
        System.out.println();

        System.out.println("Get element - " + queue.peek());
        System.out.println("Size is - " + queue.size());
        System.out.println(queue);
        System.out.println();



        System.out.println(queue);

        System.out.println("Number BBB - " + queue.search("BBB"));
        System.out.println("Number EEE - " + queue.search("EEE"));
        System.out.println("Number CCC - " + queue.search("GGG"));
    }
}
