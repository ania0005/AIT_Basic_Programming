package stack;

import interfaces.MyCollection;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Stack <String> stack = new Stack<>();
//        for (String current : stack) {
//        }
        MyCollection <String> stack = new MyStack<>();
        System.out.println("Empty? - " + stack.isEmpty());
        System.out.println("Size? - " + stack.size());
        System.out.println(stack);
        System.out.println();

        stack.push("AAA");
        stack.push("BBB");
        stack.push("DDD");

        System.out.println("Empty? - " + stack.isEmpty());
        System.out.println("Size? - " + stack.size());
        System.out.println(stack);
        System.out.println();

        System.out.println("Delete element - " + stack.pop());
        System.out.println("Size is - " + stack.size());
        System.out.println(stack);
        System.out.println();

        System.out.println("Get element - " + stack.peek());
        System.out.println("Size is - " + stack.size());
        System.out.println(stack);
        System.out.println();

        stack.push("DDD");
        stack.push("EEE");
        stack.push("FFF");

        System.out.println(stack);

        System.out.println("Number AAA - " + stack.search("AAA"));
        System.out.println("Number EEE - " + stack.search("EEE"));
        System.out.println("Number CCC - " + stack.search("GGG"));


    }
}
