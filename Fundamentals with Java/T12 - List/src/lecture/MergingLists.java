package lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> firstArray  = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List <Integer> secondArray = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = Math.min(firstArray.size(), secondArray.size());

        for (int i = 0; i < size; i++) {
            System.out.print(firstArray.get(i) + " " + secondArray.get(i) + " ");
        }
        printTheRest(firstArray, size);
        printTheRest(secondArray, size);
    }

    public static void printTheRest(List<Integer> numbers, int index) {
        for (int i = index; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}