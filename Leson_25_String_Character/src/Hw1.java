public class Hw1 {
//Реализуйте метод, который подсчитает количество цифр в строке.

        public static void main(String[] args) {

            /**
             * numberIsDigit - метод, который подсчитает количество цифр в строке c помощью Character.isDigit();
             */

            numberIsDigit("I am agent 007");
            numberIsDigit("In 2022, I went to the sea twice");
            numberIsDigit("I was in Berlin 3 times in 2023, and in 2022 I was there twice");
            System.out.println();

            /**
             * numberUniCod - метод, который подсчитает количество цифр в строке c помощью Character.isDigit();
             */

            numberUniCod("I am agent 007");
            numberUniCod("In 2022, I went to the sea twice");
            numberUniCod("I was in Berlin 3 times in 2023, and in 2022 I was there twice");
        }
        public static int numberIsDigit (String str) {
            int counter = 0;
            for (int i = 0; i < str.length(); i++) {
                char current = str.charAt(i);
                if (Character.isDigit(current)) {
                    counter += 1;
                }
            }
            System.out.println("В строке: " + counter + " цифр(ы)");
            return counter;
        }
        public static int numberUniCod (String str){
            int counter = 0;
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (currentChar >= '\u0030' && currentChar <= '\u0039'){
                    counter += 1;
                }
            }
            System.out.println("В строке: " + counter + " цифр(ы)");
            return counter;
        }
    }


