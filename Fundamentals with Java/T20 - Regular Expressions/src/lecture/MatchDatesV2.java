package lecture;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDatesV2 {
    public static void main(String[] args) {
        String expression = "\\b(?<day>\\d{2})([./-])(?<month>[A-Z][a-z]{2})(\\2)(?<year>[\\d]{4})\\b";
        String text       = new Scanner(System.in).nextLine();

        Pattern pattern = Pattern.compile(expression);
        Matcher dates   = pattern.matcher(text);

        while (dates.find()) {
            String day   = dates.group("day");
            String month = dates.group("month");
            String year  = dates.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
