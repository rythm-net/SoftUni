package lecture;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWordsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        Random rnd     = new Random();

        for (int i = 0; i < words.length; i++) {
            int pos1 = rnd.nextInt(words.length);
            int pos2 = rnd.nextInt(words.length);
            String oldPos1 = words[pos1];
            words[pos1] = words[pos2];
            words[pos2] = oldPos1;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}