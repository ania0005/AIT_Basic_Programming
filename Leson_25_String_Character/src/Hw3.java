public class Hw3 {
    // Реализуйте метод, который принимает строку и возвращает новую строку,
    // в которой все слова перевернуты, но порядок слов остается прежним.

    public static void main(String[] args) {

        System.out.println(viceVersa( "Hello World"));
        System.out.println(viceVersa( "Java Programming"));
        System.out.println(viceVersa( "Easy come easy go"));
    }

    public static String viceVersa(String strIn) {
        System.out.println(strIn);
        String[] str = strIn.split(" ");
        for (int i = 0; i < str.length; i++) {
            char[] str1 = str[i].toCharArray();
            String result = "";
            for (int j = str1.length -1; j >= 0; j--) {
                result += str1[j];
            }
            str[i] = result;
        }
        String strOut = new String();
        for (int i = 0; i < str.length; i++) {
            strOut += str[i] + " ";
        }
       return strOut.trim();
    }
}
