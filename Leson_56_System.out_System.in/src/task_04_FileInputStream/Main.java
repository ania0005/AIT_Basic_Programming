package task_04_FileInputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

              try {
            InputStream in = new FileInputStream("C:\\Users\\ania0\\ait\\lesons\\basic programming\\Leson_56_System.out_System.in\\src\\test.txt");
                 System.out.println((char) in.read());
                  int data = in.read();
                  while (data != -1){
                      System.out.print((char) data);
                      data = in.read();
                  }
                  in.skip(5); // пропустит 5 байт информации

        } catch (Exception e) {
            throw new RuntimeException(" Not found test.txt", e);
        }
    }
}
