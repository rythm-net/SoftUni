package moreExercise;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap <String, String> contests = new HashMap<>();
        TreeMap <String, LinkedHashMap<String, Integer>> students = new TreeMap<>();

        String input = scanner.nextLine();

        while (!"end of contests".equals(input)) {

            String[] tokens = input.split(":");
            String contest  = tokens[0];
            String password = tokens[1];

            contests.putIfAbsent(contest, password);
            if (!contests.containsKey(contest)) {
                contests.put(contest, password);
            }
            input = scanner.nextLine();
        }

        String line = scanner.nextLine();
        while (!"end of submissions".equals(line)) {

            String[] tokens = line.split("=>");
            String contest  = tokens[0];
            String password = tokens[1];
            String username = tokens[2];

            int points = Integer.parseInt(tokens[3]);

            if (contests.containsKey(contest)) {
                if (contests.get(contest).equals(password)) {

                    LinkedHashMap <String, Integer> courses = new LinkedHashMap<>();
                    courses.putIfAbsent(contest, points);

                    if (!students.containsKey(username)) {
                        students.put(username, courses);
                    } else {
                        if (!students.get(username).containsKey(contest)) {
                            students.get(username).put(contest, points);
                        } else {
                            students.get(username).put(contest, Math.max(points, students.get(username).get(contest)));
                        }
                    }
                }
            }

            line = scanner.nextLine();
        }

        int totalSum = 0;
        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : students.entrySet()) {
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > totalSum) {
                totalSum = sum;
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : students.entrySet()) {
            if (user.getValue().values().stream().mapToInt(i -> i).sum() == totalSum) {
                System.out.printf("Best candidate is %s with total %d points.%n",
                        user.getKey(), totalSum);
            }
        }

        System.out.println("Ranking:");
        students.forEach((key, value) -> {
            System.out.printf("%s%n", key);value.entrySet()
                    .stream()
                    .sorted((f, s) -> s.getValue() - f.getValue())
                    .forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });
    }
}