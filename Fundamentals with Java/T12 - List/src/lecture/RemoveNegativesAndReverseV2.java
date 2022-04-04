package lecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverseV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> listNumbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < listNumbers.size(); i++) {
            if (listNumbers.get(i) < 0) {
                listNumbers.remove(i);
                i--;
            }
        }

        if (listNumbers.size() == 0) {
            System.out.print("empty");
        }

        Collections.reverse(listNumbers);
        for (int items : listNumbers) {
            System.out.print(items + " ");
        }
    }
}