package exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <String, List<String>> courseRegister = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String[] tokens = input.split(" : ");
            String course   = tokens[0];
            String student  = tokens[1];

            courseRegister.putIfAbsent(course, new ArrayList<>());
            courseRegister.get(course).add(student);

            input = scanner.nextLine();
        }
        courseRegister.entrySet().stream().forEach(s -> {System.out.printf("%s: %s%n",
                s.getKey(),
                s.getValue().size());
                s.getValue().stream().forEach(e -> System.out.printf("-- %s%n", e));
        });
    }
}