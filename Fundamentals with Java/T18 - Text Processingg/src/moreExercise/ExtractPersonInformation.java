package moreExercise;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            String text = scanner.nextLine();

            int startIndexName = text.indexOf('@') + 1;
            int endIndexExclusiveName = text.indexOf('|');
            String name = text.substring(startIndexName, endIndexExclusiveName);

            int startIndexAge = text.indexOf('#') + 1;
            int endIndexExclusiveAge = text.indexOf('*');
            String age = text.substring(startIndexAge, endIndexExclusiveAge);

            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}