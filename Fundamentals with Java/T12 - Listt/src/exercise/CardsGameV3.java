package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGameV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> firstPlayer  = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List <Integer> secondPlayer = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (firstPlayer.size() >= secondPlayer.size()) {
                size = secondPlayer.size();
            } else {
                size = firstPlayer.size();
            }
            if (size == 0) {
                break;
            }
            if (firstPlayer.get(i) > secondPlayer.get(i)) {
                firstPlayer.add(firstPlayer.get(i));
                firstPlayer.remove(i);
                firstPlayer.add(secondPlayer.get(i));
                secondPlayer.remove(i);
            } else if (firstPlayer.get(i) < secondPlayer.get(i)) {
                secondPlayer.add(secondPlayer.get(i));
                secondPlayer.remove(i);
                secondPlayer.add(firstPlayer.get(i));
                firstPlayer.remove(i);
            } else {
                firstPlayer.remove(i);
                secondPlayer.remove(i);
            }
            i--;
        }
        if (secondPlayer.size() == 0) {
            int sum = 0;
            for (int i = 0; i < firstPlayer.size(); i++) {
                sum += firstPlayer.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            int sum = 0;
            for (int i = 0; i < secondPlayer.size(); i++) {
                sum += secondPlayer.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}