package moreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Double> listInput = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        int halfSize = listInput.size() / 2;
        double timeLeftRacer = 0;

        for (int i = 0; i < halfSize; i++) {
            timeLeftRacer += listInput.get(i);
            if (listInput.get(i) == 0) {
                timeLeftRacer *= 0.8;
            }
        }

        double timeRightRacer = 0;

        for (int i = listInput.size() - 1; i >= listInput.size() - halfSize; i--) {
            timeRightRacer += listInput.get(i);
            if (listInput.get(i) == 0) {
                timeRightRacer *= 0.8;
            }
        }

        if (timeLeftRacer < timeRightRacer) {
            System.out.printf("The winner is left with total time: %.1f", timeLeftRacer);
        } else {
            System.out.printf("The winner is right with total time: %.1f", timeRightRacer);
        }
    }
}
