import java.util.Scanner;
import java.util.stream.IntStream;

public class MonkeyBusiness {

    private static StringBuilder out = new StringBuilder();
    private static int solutionsCount = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sc.close();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        int[] expressions = new int[numbers.length];

        variations(0, numbers, expressions);
        out.append("Total Solutions: ").append(solutionsCount);
        System.out.print(out);
    }

    private static void variations(int index, int[] numbers, int[] expressions) {

        if (index >= numbers.length) {
            if (IntStream.of(expressions).sum() == 0) {
                solutionsCount++;
                for (int expression : expressions) {
                    if (expression > 0) {
                        out.append("+");
                    }
                    out.append(expression).append(" ");
                }
                out.append(System.lineSeparator());
            }
            return;
        }
        expressions[index] = numbers[index];
        variations(index + 1, numbers, expressions);

        expressions[index] = -numbers[index];
        variations(index + 1, numbers, expressions);
    }
}