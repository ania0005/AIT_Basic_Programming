package Validator;

public class PasswordValidator {
    private final int minLowerCase;
    private final int minUpperCase;
    private final int minDigits;
    private final int minLength;
    private final String symbolList;
    private final int minSymbolCount;

    /**
     * Конструктор класса PasswordValidator для инициализации параметров проверки пароля.
     *
     * @param minLowerCase   Минимальное количество букв нижнего регистра.
     * @param minUpperCase   Минимальное количество букв верхнего регистра.
     * @param minDigits      Минимальное количество цифр.
     * @param minLength      Минимальная длина пароля.
     * @param symbolList     Список символов, которые должны быть в пароле.
     * @param minSymbolCount Минимальное количество символов из списка.
     */
    public PasswordValidator(int minLowerCase, int minUpperCase, int minDigits, int minLength, String symbolList, int minSymbolCount) {
        this.minLowerCase = minLowerCase;
        this.minUpperCase = minUpperCase;
        this.minDigits = minDigits;
        this.minLength = minLength;
        this.symbolList = symbolList;
        this.minSymbolCount = minSymbolCount;
    }
    /**
     * Проверяет, соответствует ли заданный пароль требованиям.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль соответствует требованиям, и false в противном случае.
     */
    public boolean isValid(String password) {
        if (isDigitsContains(password) &&
                isSymbolsContains(password) &&
                isUpperCaseContains(password) &&
                isLowerCaseContains(password) &&
                isLengthValid(password)) {
            return true;
        }
        return false;
    }
    /**
     * Проверяет, содержит ли пароль заданное количество цифр.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество цифр, и false в противном случае.
     */
    public boolean isDigitsContains(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '\u0030' && password.charAt(i) <= '\u0039') {
                counter++;
            }
        }
        if (counter >= minDigits) {
            return true;
        } else
            return false;
    }
    /**
     * Проверяет, содержит ли пароль заданные символы из списка.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов из списка, и false в противном случае.
     */
    public boolean isSymbolsContains(String password) {
        int counter = 0;
        char[] symbols = symbolList.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < symbols.length; j++) {
                if (password.charAt(i) == symbols[j]) {
                    counter++;
                }
            }
        }
        if (counter >= minSymbolCount) {
            return true;
        }
        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданное количество символов верхнего регистра.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов верхнего регистра, и false в противном случае.
     */
    public boolean isUpperCaseContains(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '\u0041' && password.charAt(i) <= '\u005A') {
                counter++;
            }
        }
        if (counter >= minUpperCase) {
            return true;
        }
        return false;
    }
    /**
     * Проверяет, содержит ли пароль заданное количество символов нижнего регистра.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов нижнего регистра, и false в противном случае.
     */
    public boolean isLowerCaseContains(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '\u0061' && password.charAt(i) <= '\u007A') {
                counter++;
            }
        }
        if (counter >= minLowerCase) {
            return true;
        }
        return false;
    }
    /**
     * Проверяет, является ли длина пароля достаточной.
     *
     * @param password Пароль для проверки.
     * @return true, если длина пароля больше или равна минимальной длине, и false в противном случае.
     */
    public boolean isLengthValid(String password) {
        if (password.length() >= minLength) {
            return true;
        }
        return false;
    }
}

