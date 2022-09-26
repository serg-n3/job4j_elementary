package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean firstSym = !name.isEmpty() && isLowerLatinLetter(name.codePointAt(0));
        if (firstSym) {
            for (int i = 0; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!(Character.isDigit(code) || isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code))) {
                    firstSym = false;
                    break;
                }
            }
        }
        return firstSym;
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
