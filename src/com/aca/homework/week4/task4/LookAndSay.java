package com.aca.homework.week4.task4;

public class LookAndSay {
    public static void main(String[] args) {

        System.out.println(lookAndSay(5));

    }

    public static String lookAndSay(int n) {
        if (n <= 0) {
            throw new RuntimeException("invalid input");
        }
        if (n == 1) {
            return "1";
        }

        StringBuilder result = new StringBuilder();
        //any ideas how to name this variable better?
        String numberAtEachStep = lookAndSay(n - 1);

        int count = 1;

        for (int i = 0; i < numberAtEachStep.length(); i++) {
            if (i == numberAtEachStep.length() - 1 || numberAtEachStep.charAt(i + 1) != numberAtEachStep.charAt(i)) {
                result.append(count).append(numberAtEachStep.charAt(i));
                count = 0;
            }
            count++;
        }
        return result.toString();
    }
}
