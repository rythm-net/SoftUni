package moreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s*\\|\\s*");

        String upperLetters       = input[0];
        String asciiCodeAndLength = input[1];
        String words              = input[2];

        Pattern upperLettersPattern = Pattern.compile("([\"#$%&*])(?<capitals>[A-Z]+)\\1");
        Matcher matcher = upperLettersPattern.matcher(upperLetters);

        while (matcher.find()) {
            String capitals = matcher.group("capitals");

            for (int index = 0; index < capitals.length(); index++) {
                char startLetter = capitals.charAt(index);
                Pattern digitsPattern =
                        Pattern.compile(String.format("%d:(?<length>[\\d]{2})", (int) startLetter));
                matcher = digitsPattern.matcher(asciiCodeAndLength);

                while (matcher.find()) {
                    int length = Integer.parseInt(matcher.group("length"));

                    Pattern wordsPattern =
                            Pattern.compile(String.format("(?<=\\s|^)%c[^\\s]{%d}(?=\\s|$)", startLetter, length));
                    matcher = wordsPattern.matcher(words);

                    while (matcher.find()) {
                        String word = matcher.group();
                        System.out.println(word);
                    }
                }
            }
        }
    }
}