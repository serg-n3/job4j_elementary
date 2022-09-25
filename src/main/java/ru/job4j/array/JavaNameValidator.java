package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        char[] array = name.toCharArray();
        if (Character.isUpperCase(array[0])) {
            return false;
        } else {
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            return (isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code));
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (code >= 65 && code <= 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (code >= 97 && code <= 122);
    }

}
