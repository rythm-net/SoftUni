import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClusterBorder {

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int[] single = Arrays.stream(rd.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] pair = Arrays.stream(rd.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        //int[] single = {8, 5, 3, 9, 2, 1, 4, 4, 1, 17};
        //int[] pair = {1, 3, 9, 4, 2, 4, 9, 3, 8};

        rd.close();

        int sum = 0;
        int[] dp = new int[single.length + 1];
        dp[0] = 0;

        if (single.length > 0) {
            dp[1] = single[0];
        }

        for (int i = 2; i < dp.length; i++) {
            int one = dp[i - 1] + single[i - 1];
            int two = dp[i - 2] + pair[i - 2];
            dp[i] = Math.min(one, two);
        }

        StringBuilder out = new StringBuilder();
        out.append("Optimal Time: ").append(dp[dp.length - 1]).append(System.lineSeparator());
        List<String> cache = new ArrayList<>();

        int index = dp.length - 1;

        while (index > 0) {
            if (dp[index - 1] + single[index - 1] == dp[index]) {
                cache.add(single(index));
                index--;
            } else {
                cache.add(pair(index - 1, index));
                index -= 2;
            }
        }
        Collections.reverse(cache);

        for (String s : cache) {
            out.append(s);
        }
        System.out.print(out);
    }

    private static String single(int n) {
        return String.format("Single %d%n", n);
    }

    private static String pair(int n, int m) {
        return String.format("Pair of %d and %d%n", n, m);
    }
}