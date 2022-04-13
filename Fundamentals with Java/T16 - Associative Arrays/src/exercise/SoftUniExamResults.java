package exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap <String, Integer> contest      = new LinkedHashMap<>();
        LinkedHashMap <String, Integer> participants = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!"exam finished".equals(input)) {
            String[] tokens = input.split("-");
            String nameStudent = tokens[0];

            if (tokens.length == 3) {
                String language = tokens[1];
                int score = Integer.parseInt(tokens[2]);

                if (!contest.containsKey(nameStudent)) {
                    contest.putIfAbsent(nameStudent, score);
                }
                if (contest.get(nameStudent) < score) {
                    contest.put(nameStudent, score);
                }

                Integer count = participants.get(language);
                if (count == null) {
                    count = 0;
                }
                participants.put(language, count + 1);

            } else if (tokens.length == 2) {
                contest.remove(nameStudent);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        contest.entrySet().stream().forEach(user -> System.out.printf("%s | %d%n", user.getKey(), user.getValue()));

        System.out.println("Submissions:");
        participants.entrySet().stream().forEach(language -> System.out.printf("%s - %d%n", language.getKey(), language.getValue()));
    }
}
