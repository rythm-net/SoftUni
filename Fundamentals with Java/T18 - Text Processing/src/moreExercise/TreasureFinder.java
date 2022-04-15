package moreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split("\\s+");
        int[] keys = new int[str.length];

        for (int i = 0; i < keys.length; i++) {
            keys[i] = Integer.parseInt(str[i]);
        }
        String text = scanner.nextLine();

        while (!"find".equals(text)) {
            StringBuilder decryptedMsg = new StringBuilder();

            int keyLength = 0;
            for (int i = 0; i < text.length(); i++) {

                char decryptedCh = (char) (text.charAt(i) - keys[keyLength]);
                keyLength++;
                if (keyLength == keys.length) {
                    keyLength = 0;
                }
                decryptedMsg.append(decryptedCh);
            }

            String regEx = ".*([&])(?<type>[a-zA-Z]*)([&]).*([<])(?<coordinates>.*)([>])";
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(decryptedMsg);

            while (matcher.find()) {
                String type = matcher.group("type");
                String coordinates = matcher.group("coordinates");
                System.out.printf("Found %s at %s%n", type, coordinates);
            }
            text = scanner.nextLine();
        }
    }
}