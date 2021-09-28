package com.aca.homework.week8.phonewithbuttons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static final String[] digitToLetterMapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        System.out.println(getAllPossibleCombinations(2122));

    }

    //in case of pressing "0" or "1" corresponding number will be added to all possible strings at respective position
    public static List<String> getAllPossibleCombinations(final int num) {
        final String digitAsString = String.valueOf(num);
        if (digitAsString.length() == 0) {
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();
        result.add("");

        for (int i = 0; i < digitAsString.length(); i++) {
            result = addSubstrings(digitToLetterMapping[digitAsString.charAt(i) - '0'], result);
        }

        return result;
    }

    public static List<String> addSubstrings(final String digit, final List<String> substring) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < digit.length(); i++)
            for (final String s : substring)
                result.add(s + digit.charAt(i));

        return result;
    }
}
