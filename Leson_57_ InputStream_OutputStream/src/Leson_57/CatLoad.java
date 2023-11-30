package Leson_57;

import java.io.*;

import static java.lang.System.in;

public class CatLoad {
    public static void main(String[] args) {

        File file = new File("cat.txt");

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {

            Cat cat1 = (Cat) in.readObject();
            Cat cat2 = new Cat(5, "gray", 7.12);

            System.out.println("Cats were reited");
            System.out.println(cat1);
            System.out.println(cat2);

        } catch (Exception e) {

        }
    }
}
