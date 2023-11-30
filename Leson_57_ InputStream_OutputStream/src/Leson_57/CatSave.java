package Leson_57;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CatSave {
    public static void main(String[] args) {
        File file = new File("cat.txt");

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file, true))){

            Cat cat1 = new Cat(3, "black", 2.56);
            Cat cat2 = new Cat(5, "gray", 7.12);

            System.out.println("Cats were created");
            System.out.println(cat1);
            System.out.println(cat2);

            file.createNewFile();

            out.writeObject(cat1);
            out.writeObject(cat2);
        }
        catch (Exception e){

        }
    }

}
