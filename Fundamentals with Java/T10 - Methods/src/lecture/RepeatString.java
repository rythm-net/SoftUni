package lecture;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());
        String repeated = repeatString(s, repetitions);
        System.out.println(repeated);
    }

    private static String repeatString(String s, int repetitions) {
        String[] strings = new String[repetitions];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = s;
        }
        String repeated = String.join("", strings);

        return repeated;
    }
}