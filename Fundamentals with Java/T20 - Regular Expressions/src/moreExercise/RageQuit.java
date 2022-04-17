package moreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text  = scanner.nextLine();
        String regex = "(?<string>[\\D]+)(?<count>\\d+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        StringBuilder nonDigits = new StringBuilder();

        while (matcher.find()) {
            int n = Integer.parseInt(matcher.group("count"));
            String word = matcher.group("string").toUpperCase();

            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    nonDigits.append(word);
                }
            }
        }

        System.out.printf("Unique symbols used: %d%n", nonDigits.chars().distinct().count());
        System.out.println(nonDigits);
    }
}