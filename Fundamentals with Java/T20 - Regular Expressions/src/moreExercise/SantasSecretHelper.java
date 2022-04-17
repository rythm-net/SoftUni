package moreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());

        String regex   = "[@](?<name>[A-Za-z]+)([^-@!:>]+)?(!(?<behaviour>[G|N])!)";
        String message = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        while (!"end".equals(message)) {
            StringBuilder decryptedMessage = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = (char) (message.charAt(i) - key);
                decryptedMessage.append(ch);
            }
            Matcher matcher = pattern.matcher(decryptedMessage);

            while (matcher.find()) {
                String name = matcher.group("name");
                String behaviour = matcher.group("behaviour");
                if (behaviour.equals("G")) {
                    System.out.println(name);
                }
            }
            message = scanner.nextLine();
        }
    }
}