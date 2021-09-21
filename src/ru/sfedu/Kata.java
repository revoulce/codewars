package ru.sfedu;

public class Kata {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        java.util.Formatter formatter = new java.util.Formatter(sb);

        formatter.format("(%d%d%d) ", numbers[0], numbers[1], numbers[2]);
        formatter.format("%d%d%d-", numbers[3], numbers[4], numbers[5]);
        formatter.format("%d%d%d%d", numbers[6], numbers[7], numbers[8], numbers[9]);

        return sb.toString();
    }

    public static int multiple(int number) {
        int sum = 0;

        if (number < 3) return sum;

        for (int i = 0; i < number; ++i) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }

        return sum;
    }
}
