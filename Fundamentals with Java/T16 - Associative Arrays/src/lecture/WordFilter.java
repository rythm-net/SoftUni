package lecture;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] words = Arrays.stream(input.split("\\s+")).filter(w -> w.length() % 2 == 0).toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(), words));
    }
}