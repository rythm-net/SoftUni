import java.util.Arrays;
import java.util.Scanner;

public class OddTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int result = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                result = numbers[i] ^ numbers[j + 1];
                if (result == 0) {
                    numbers[i] = 0;
                    numbers[j + 1] = 0;
                    break;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.print(numbers[i]);
            }
        }
    }
}