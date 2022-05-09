package moreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tickets = scanner.nextLine().split("\\s*,\\s*");
        String winningRegex = "(?<match>\\@{6,10}|\\${6,10}|\\^{6,10}|\\#{6,10})";
        Pattern pattern = Pattern.compile(winningRegex);

        for (int i = 0; i < tickets.length; i++) {
            String ticket = tickets[i];
            if (ticket.length() == 20) {
                String firstPart  = ticket.substring(0, 10);
                String secondPart = ticket.substring(10);

                Matcher firstMatcher  = pattern.matcher(firstPart);
                Matcher secondMatcher = pattern.matcher(secondPart);

                if (firstMatcher.find() && secondMatcher.find()) {
                    String firstMatch  = firstMatcher.group("match");
                    String secondMatch = secondMatcher.group("match");

                    int minLength = Math.min(firstMatch.length(), secondMatch.length());

                    String leftPart  = firstMatch.substring(0, minLength);
                    String rightPart = secondMatch.substring(0, minLength);

                    if (leftPart.equals(rightPart)) {
                        int count = leftPart.length();
                        if (count <= 9) {
                            System.out.printf("ticket \"%s\" - %d%s%n", ticket, count, leftPart.charAt(0));
                        } else if (count == 10) {
                            System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", ticket, count, leftPart.charAt(0));
                        }
                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", ticket);
                }
            } else {
                System.out.println("invalid ticket");
            }
        }
    }
}