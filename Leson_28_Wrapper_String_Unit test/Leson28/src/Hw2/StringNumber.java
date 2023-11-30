package Hw2;

//Напишите программу, которая которая сравнивает две версии строковых чисел (например, "1.2.3" и "2.0.1")
// и возвращает результат сравнения и напишите тесты.
//Если 'version1' меньше чем 'version2', метод возвращает '-1'.
// Если 'version1' равен 'version2', метод возвращает '0'.
//Eсли 'version1' больше чем 'version2', метод '1'.

public class StringNumber {

    public static void main(String[] args) {
        stringNumberEquals("88.994560.43", "-20.43");
    }

    public static int stringNumberEquals(String numberString1, String numberString2) {
        int result = 0;
        if (numberString1 == null || numberString1 == "" || numberString2 == null || numberString2 == "") {
            result = 2;
            System.out.println("Incorrect data for comparison");
        } else {
            String nummer1 = "";
            String nummer2 = "";
            for (int i = 0; i < numberString1.length(); i++) {
                if (numberString1.charAt(i) >= '\u0030' && numberString1.charAt(i) <= '\u0039') {
                    nummer1 += numberString1.charAt(i);
                }
            }
            for (int i = 0; i < numberString2.length(); i++) {
                if (numberString2.charAt(i) >= '\u0030' && numberString2.charAt(i) <= '\u0039') {
                    nummer2 += numberString2.charAt(i);
                }
            }
            if (nummer1 == "" || nummer2 == "") {
                System.out.println("Incorrect data for comparison");
                return 2;
            } else {
                Long longNummer1 = Long.valueOf(nummer1);
                Long longNummer2 = Long.valueOf(nummer2);
                if (numberString1.charAt(0) == '\u002D') {
                    longNummer1 = -longNummer1;
                }

                if (numberString2.charAt(0) == '\u002D') {
                    longNummer2 = -longNummer2;
                }

                if (longNummer1 < longNummer2) {
                    result = -1;
                    System.out.println("Number 1 is less than number 2 : " + longNummer1 + " < " + longNummer2);
                }
                if (longNummer1 == longNummer2) {
                    result = 0;
                    System.out.println("Numbers are equal: " + longNummer1 + " = " + longNummer2);
                }
                if (longNummer1 > longNummer2) {
                    result = 1;
                    System.out.println("Number 1 is greater than number 2 : " + longNummer1 + " > " + longNummer2);
                }
            }

        }
        return result;
    }
}











