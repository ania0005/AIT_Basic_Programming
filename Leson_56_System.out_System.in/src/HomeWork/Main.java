package HomeWork;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        //1. Создать файл (при помощи кода, не вручную).
        //2. Записать в файл строку - "Hello, World! I *** study ***** Java!".
        //3. Читать из файла информацию и выводить в консоль.
        //4. После слова Hello пропустить нужное число байт, чтобы подстрока ", World" не была выведена.
        //5. Продолжить вывод так, чтобы выводилось в консоль всё, кроме звёздочек (не при помощи skip).
        //6. Итоговый вывод в консоль должен быть - "Hello! I study Java!".

        try {
            File file = new File("home_work_file.txt");
            file.createNewFile();

            FileWriter writer = new FileWriter(file);
            writer.append("Hello, World! I *** study ***** Java!");
            writer.flush();
            writer.close();

            FileInputStream in = new FileInputStream(file);
            int data = in.read();

            while (true){
                char output = (char) data;
                System.out.print(output);
                if (output == 'o'){
                    in.skip(7);
                    break;
                }
                data = in.read();
            }
            while (data != -1){
                char output = (char) data;
                if(output != '*'){

                }
            }


//            InputStream in = new FileInputStream(file);
//
//            System.out.print((char) in.read());
//            int data = in.read();
//            String text = "";
//            while (data != -1){
//                System.out.print((char) data1);
//                text += (char)data;
//                data = in.read();
//            }
//
//           String result = text.replaceAll("\\, World", "");
//           System.out.println(result.replaceAll("\\*", ""));




        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
