package moreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map <String, Map<String, Integer>> contests = new LinkedHashMap<>();

        while (!input.equals("no more time")) {

            String[] tokens = input.split(" -> ");
            String username = tokens[0];
            String contest  = tokens[1];

            int points = Integer.parseInt(tokens[2]);
            contests.putIfAbsent(contest, new LinkedHashMap<>());
            contests.get(contest).putIfAbsent(username, points);

            if (contests.get(contest).get(username) < points) {
                contests.get(contest).put(username, points);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> entry : contests.entrySet()) {
            AtomicInteger num = new AtomicInteger();
            System.out.printf("%s: %d participants%n", entry.getKey(), entry.getValue().size());

            entry.getValue().entrySet().stream().sorted
                    (Map.Entry.comparingByKey())
                    .sorted((v1, v2) -> v2.getValue()
                    .compareTo(v1.getValue()))
                    .forEach(e -> System.out.printf("%d. %s <::> %d%n", num.incrementAndGet(), e.getKey(), e.getValue()));

        }

        Map <String, Integer> students = new LinkedHashMap<>();

        for (Map<String, Integer> value : contests.values()) {
            for (Map.Entry<String, Integer> entry : value.entrySet()) {
                if (!students.containsKey(entry.getKey())) {
                    students.put(entry.getKey(), 0);
                }
                students.put(entry.getKey(), entry.getValue() + students.get(entry.getKey()));
            }

        }

        AtomicInteger num = new AtomicInteger();
        System.out.println("Individual standings:");

        students.entrySet().stream().sorted
                (Map.Entry.comparingByKey())
                .sorted((s1, s2) -> s2.getValue()
                .compareTo(s1.getValue()))
                .forEach(v -> System.out.printf("%d. %s -> %d%n", num.incrementAndGet(), v.getKey(), v.getValue()));
    }
}