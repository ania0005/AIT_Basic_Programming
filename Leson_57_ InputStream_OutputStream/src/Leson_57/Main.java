package Leson_57;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            copyFile("home_work_file.txt", "target.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void copyFile(String sourse, String target) throws FileNotFoundException {

        File soursFile = new File(sourse);

        if (!soursFile.exists()) {
            throw new FileNotFoundException("File is not found");
        }

        File targetFile = new File(target);

        try (FileInputStream in = new FileInputStream(soursFile);
             FileWriter out = new FileWriter(targetFile, true)) {

            targetFile.createNewFile();

            while (in.available() != 0) {
                out.write(in.read());
            }
            out.write("\n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
