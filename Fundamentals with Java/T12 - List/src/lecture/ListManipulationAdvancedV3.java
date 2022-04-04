package lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvancedV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command  = tokens[0];

            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(tokens[1]);
                    if (numbers.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        printEven(numbers);
                    } else if (evenOrOdd.equals("odd")) {
                        printOdd(numbers);
                    }
                case "Get":
                    String sum = tokens[1];
                    if (sum.equals("sum")) {
                        getSum(numbers);
                    }
                    break;
                case "Filter":
                    String condition = tokens[1];
                    int conditionNumber = Integer.parseInt(tokens[2]);
                    fulfillsCondition(numbers, condition, conditionNumber);
                    break;

            }
            input = scanner.nextLine();
        }
    }

    private static void fulfillsCondition(List<Integer> numbers, String condition, int conditionNumber) {
    }

    private static void getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static void printOdd(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int element = numbers.get(i);
            if (element % 2 == 1) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    private static void printEven(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int element = numbers.get(i);
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}