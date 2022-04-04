package moreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> firstNumbersList  = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List <Integer> secondNumbersList = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List <Integer> finalNumbersList  = new ArrayList<>();

        while (!(firstNumbersList.isEmpty() || secondNumbersList.isEmpty())) {
            finalNumbersList.add(firstNumbersList.get(0));
            finalNumbersList.add(secondNumbersList.get(secondNumbersList.size() - 1));
            firstNumbersList.remove(0);
            secondNumbersList.remove(secondNumbersList.size() - 1);
        }

        int min;
        int max;

        if (!firstNumbersList.isEmpty()) {
            min = Math.min(firstNumbersList.get(firstNumbersList.size() - 1),
                    firstNumbersList.get(firstNumbersList.size() - 2));
            max = Math.max(firstNumbersList.get(firstNumbersList.size() - 1),
                    firstNumbersList.get(firstNumbersList.size() - 2));
        } else {
            min = Math.min(secondNumbersList.get(0), secondNumbersList.get(1));
            max = Math.max(secondNumbersList.get(0), secondNumbersList.get(1));
        }
        for (int i = 0; i < finalNumbersList.size(); i++) {
            if (finalNumbersList.get(i) >= max || finalNumbersList.get(i) <= min) {
                finalNumbersList.remove(i);
                i--;
            }
        }
        Collections.sort(finalNumbersList);
        System.out.println(finalNumbersList.toString()
                .replaceAll("[\\[\\],]", "")
                .replaceAll(", ", " "));
    }
}