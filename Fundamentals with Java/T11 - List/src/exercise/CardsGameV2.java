package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGameV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> firstPlayer  = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List <Integer> secondPlayer = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            int firstPlayerSum  = 0;
            int secondPlayerSum = 0;

            for (int i = 0; i <= firstPlayer.size() - 1; i++) {
                for (int j = 0; j <= secondPlayer.size() - 1; j++) {
                    if (firstPlayer.get(i) > secondPlayer.get(j)) {
                        firstPlayer.add(firstPlayer.size() - 1, secondPlayer.get(j));
                        firstPlayer.add(firstPlayer.size() - 2, firstPlayer.get(i));
                        secondPlayer.remove(secondPlayer.get(j));
                        firstPlayerSum += firstPlayer.get(i);
                    } else if (secondPlayer.get(j) > firstPlayer.get(i)) {
                        secondPlayer.add(secondPlayer.size() - 1, firstPlayer.get(i));
                        secondPlayer.add(secondPlayer.size() - 2, secondPlayer.get(j));
                        firstPlayer.remove(firstPlayer.get(i));
                        secondPlayerSum += secondPlayer.get(j);
                    } else {
                        firstPlayer.remove(firstPlayer.get(i));
                        secondPlayer.remove(secondPlayer.get(j));
                    }
                }
            }
            if (firstPlayer.isEmpty()) {
                System.out.printf("Second player wins! Sum: %d", secondPlayerSum);
                break;
            }
            if (secondPlayer.isEmpty()) {
                System.out.printf("First player wins! Sum: %d", firstPlayerSum);
                break;
            }
        }
    }
}