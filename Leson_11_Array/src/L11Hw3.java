//Создайте массив с названиями фильмов или книг. Программа случайным образом выбирает одно из них для
// просмотра или чтения и выводит это пользователю.

import java.util.Random;

public class L11Hw3 {
    public static void main(String[] args) {
        String[] media = new String[10];
        media[0] = "Три мушкитера";
        media[1] = "Война и мир";
        media[2] = "Крёстный отец";
        media[3] = "Матрица";
        media[4] = "Унесённые ветром";
        media[5] = "Гладиатор";
        media[6] = "Горе от ума";
        media[7] = "Джейн Эйр";
        media[8] = "Идиот";
        media[9] = "Мастер и Маргарита";
        Random generator = new Random();
        int randomNumber = generator.nextInt(9 - 0) + 0;
        System.out.println("Советуем Вам  - " + media[randomNumber]);
    }
}