package lecture;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap <String, Integer> wordsOddOccurrences = new LinkedHashMap<>();
        String[] input = scanner.nextLine().split("\\s+");

        for (int i = 0; i < input.length; i++) {
            String words = input[i].toLowerCase();
            Integer occurrences = wordsOddOccurrences.get(words);
            if (occurrences == null) {
                occurrences = 0;
            }
            wordsOddOccurrences.put(words, occurrences + 1);
        }

        ArrayList<String> oddWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsOddOccurrences.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddWords.add(entry.getKey());
            }
        }

        for (int i = 0; i < oddWords.size(); i++) {
            System.out.print(oddWords.get(i));
            if (i < oddWords.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}