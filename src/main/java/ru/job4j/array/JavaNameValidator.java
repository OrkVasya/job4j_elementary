package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        int code = name.codePointAt(0);
        if (!isLowerLatinLetter(code)) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            code = name.codePointAt(i);
            if (!isCorrectSymbol(code)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isCorrectSymbol(int code) {
        return Character.isDigit(code) || isSpecialSymbol(code) ||
                isUpperLatinLetter(code) || isLowerLatinLetter(code);
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
