import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        System.out.println(summarize(arr, arr.length - 1));
    }

    public static int summarize(int[] a, int n) {
        if (n < 0) return 0;
        return a[n] + summarize(a, n - 1);
    }
}