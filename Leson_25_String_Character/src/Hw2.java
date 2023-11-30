public class Hw2 {

    //Задача 2. Реализуйте метод, который подсчитает количество только верхнего регистра в строке от A до Z.

    public static void main(String[] args) {

        upperCaseDigsts("Hello World");
        upperCaseDigsts("In 2022, I went to the sea twice");
        upperCaseDigsts("I was in Berlin 3 times in 2023, and in 2022 I was there twice");
    }
    public static void upperCaseDigsts (String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isUpperCaseContains = Character.isUpperCase(current);
            if (isUpperCaseContains) {
                counter += 1;
            }
        }
        System.out.println(counter + " букв(ы) верхнего регистра");
    }

}
