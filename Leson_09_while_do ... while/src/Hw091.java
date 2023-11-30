//С помощью цикла while написать программу, выводящую на экран куб
// числа от 1 до заданного числа n
//Пример:для числа n=3
//1 в кубе 1
//2 в кубе 8
//3 в кубе 27
public class Hw091 {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 5) {
            System.out.println(n + " в кубе " + n * n * n);
            n++;
        }
        main1();
    }

    //С помощью цикла while написать программу, выводящую на экран результат
    // умножения данного цисла n на все целые числа от 0 до n

    public static void main1() {
        int j = 0;
        int n = 5;
        System.out.println();
        while (j <= 5) {
            System.out.println(j * n);
            j++;
        }
    }
}
