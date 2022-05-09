package lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingListsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> firstList  = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List <Integer> secondList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List <Integer> mergedList = new ArrayList<>();
        int index = 0;

        while (index < firstList.size() || index < secondList.size()) {
            if (index < firstList.size()) {
                mergedList.add(firstList.get(index));
            }
            if (index < secondList.size()) {
                mergedList.add(secondList.get(index));
            }
            index++;
        }
        System.out.println(mergedList.toString().replaceAll("[\\[\\],]", "")
                .replaceAll(", ", " "));
    }
}