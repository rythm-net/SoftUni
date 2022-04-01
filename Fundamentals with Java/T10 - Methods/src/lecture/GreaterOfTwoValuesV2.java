package lecture;

import java.util.Scanner;

public class GreaterOfTwoValuesV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        switch (type) {
            case "int":
                System.out.println(getMax(Integer.parseInt(first), Integer.parseInt(second)));
                break;

            case "char":
                System.out.println(getMax(first.charAt(0), second.charAt(0)));
                break;

            case "string":
                System.out.println(getMax(first, second));
                break;
        }
    }

    static int getMax(int first, int second) {
        return Math.max(first, second);
    }

    static char getMax(char first, char second) {
        return (char) Math.max(first, second);
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}