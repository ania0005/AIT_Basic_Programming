import java.util.Random;
import java.util.Scanner;

public class Hw2 {
    //Цель:
    //Разработать программу на Java для кодирования и декодирования пароля с использованием следующих условий:
    //Каждый четный индекс символа пароля сдвигается на 1000 символов вправо в Unicode.
    //Каждый нечетный индекс символа пароля сдвигается на 10 символов влево в Unicode.
    //В закодированный пароль добавляются 6 случайных символов из таблицы Unicode.
    //Функциональные требования:
    //Программа должна иметь два основных метода: encodePassword для кодирования пароля и decodePassword для декодирования пароля.
    //Метод encodePassword должен принимать строку с паролем в качестве входных данных и возвращать закодированный пароль в виде строки.
    //Метод decodePassword должен принимать закодированный пароль в виде строки и возвращать исходный пароль в виде строки.
    //Программа должна добавлять 6 случайных символов из Unicode в закодированный пароль при каждой кодировке пароля.
    //Нефункциональные требования:
    //Программа должна быть простой в использовании через текстовый интерфейс в консоли.
    //Программа должна быть легко читаемой и поддерживаемой.
    //Программа должна быть протестирована (smoke test - https://ru.wikipedia.org/wiki/Smoke_test).



    public static String encodePassword(String code, int n){ // n - число рандомных значений в нонце пароля
        String codeOut = "";
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if(i % 2 == 0){
                current  += 1000;
                codeOut += current;
            } else {current -= 10;
                codeOut += current;}
        }
        System.out.println(codeOut);
        Random random = new Random();
        String res = "";
        for (int i = 0; i < n; i++) {
            res += (char)random.nextInt(Character.MAX_CODE_POINT);
        }
        codeOut +=  res;
        System.out.println("Закодированный пароль " + codeOut);
        return codeOut;
    }
    public static String decodePassword(String code, int n ){
        String codeOut = "";
        for (int i =0; i < code.length() - n; i++) {
            char current = code.charAt(i);
            if(i % 2 == 0){
                current  -= 1000;
                codeOut += current;
            } else {current += 10;
                codeOut += current;}
        }
        System.out.println("Декодированный пароль " + codeOut);
        return codeOut;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль:");
        encodePassword(String.valueOf(scanner.nextLine()), 6); // n - число рандомных значений в нонце пароля

        System.out.println("Введите закодированный пароль:");
        decodePassword(String.valueOf(scanner.nextLine()), 6);
    }
}