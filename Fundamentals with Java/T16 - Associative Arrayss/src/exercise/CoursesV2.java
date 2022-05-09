package exercise;

import java.util.*;

public class CoursesV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap <String, List<String>> courses = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!"end".equals(input)){
            String[] tokens    = input.split(" : ");
            String course      = tokens[0];
            String studentName = tokens[1];

            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(studentName);
            input = scanner.nextLine();
        }

        courses.entrySet().stream().forEach(entry -> {System.out.printf("%s: %d%n",
                entry.getKey(),
                entry.getValue().size());
                entry.getValue().stream().forEach(e -> System.out.printf("-- %s%n", e));
        });
    }
}