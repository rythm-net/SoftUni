package moreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Character> text    = Arrays.stream(scanner.nextLine()
                .split(""))
                .map(a -> a.charAt(0))
                .collect(Collectors.toList());
        List <String> nonNumbers = new ArrayList<>();
        List <Integer> numbers   = new ArrayList<>();

        text.forEach(character -> {
            if (Character.isDigit(character)) {
                numbers.add(Integer.parseInt(String.valueOf(character)));
            } else {
                nonNumbers.add(String.valueOf(character));
            }
        });

        StringBuilder output = new StringBuilder();
        int count = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numbers.get(i); j++) {
                    if (count != nonNumbers.size()) {
                        output.append(nonNumbers.get(count));
                        count++;
                    }
                }
            } else {
                count += numbers.get(i);
            }
        }
        System.out.println(output);
    }
}