package Hw1;

import java.util.Scanner;

//Напишите программу, которая принимает строку с клавиатуры и определяет, является ли она палиндромом (строкой,
//которая читается одинаково с начала и с конца, игнорируя пробелы и регистр символов) и напишите тесты.

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введитее строку");  // А муза рада музе без ума да разума
        String line = scanner.nextLine();

        if (isPalindrom(line)) {
            System.out.println("Line is palindrome");
        } else {
            if (line == null || line == "") {
                System.out.println("Line not found");
            } else {
                System.out.println("Line is not palindrome");
            }
        }
    }
    public static boolean isPalindrom(String line) {
        if (line != null) {
            if (line != "") {
                String curentLine = line.replaceAll(" ", "");
                curentLine = curentLine.toLowerCase();
                String invertedLine = "";
                for (int i = curentLine.length() - 1; i >= 0; i--) {
                    invertedLine += curentLine.charAt(i);
                }
                if (invertedLine.equals(curentLine)) {
                    return true;
                } return false;
            } return false;
        } return false;
    }
}




