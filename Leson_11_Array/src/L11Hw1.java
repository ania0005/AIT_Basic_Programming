//"Симметричный ли массив?"
//Проверьте, является ли массив симметричным. Симметричный массив выглядит одинаково при чтении слева направо и справа налево.
public class L11Hw1 {
    public static void main(String[] args) {

        int[] data = new int[11];
        data[0] = 6;
        data[1] = 3;
        data[2] = 16;
        data[3] = 8;
        data[5] = 6;
        data[7] = 8;
        data[8] = 16;
        data[9] = 3;
        data[10] = 6;
        int n = data.length;
        int i = 0;
        String w = "";
        while (i < n) {
            w = w + data[i];
            i++;
        }
        System.out.println(w);

        String w1 = "";
        i = 0;
        n--;
        while (n >= i) {
            w1 = w1 + data[n];
            n--;
        }
        System.out.println(w1);
        if (w.equals(w1)) {
            System.out.println("Маассив симметричный");
        } else {
            System.out.println("Маассив не симметричный");
        }
    }
}
