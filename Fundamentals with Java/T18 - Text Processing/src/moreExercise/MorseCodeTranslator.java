package moreExercise;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] english = {
                "A", "B", "C", "D", "E",
                "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y",
                "Z"};

        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--",
                "--.."};

        String[] input = scanner.nextLine().split("\\s+\\|\\s+");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            String[] words = input[i].split("\\s+");
            for (int j = 0; j < words.length; j++) {
                for (int k = 0; k < morse.length; k++) {
                    if (words[j].equals(morse[k])) {
                        output.append(english[k]);
                        break;
                    }
                }
            }
            output.append(" ");
        }
        System.out.println(output);
    }
}