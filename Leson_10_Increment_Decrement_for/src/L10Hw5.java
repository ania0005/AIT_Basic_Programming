//Необходимо, чтоб программа выводила на экран вот такую последовательность:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98
public class L10Hw5 {
    public static void main(String[] args) {
        multiplication7();
    }

    public static void multiplication7() {

        for (byte n = 1; n <= 14; n++) {
            System.out.println(n * 7);
        }
    }
}
