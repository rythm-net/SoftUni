import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {

    private static long[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int[] s = Arrays.stream(rd.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        //int[] s = { 3, 14, 5, 12, 15, 7, 8, 9, 11, 10, 1 };
        rd.close();

        int[] length = new int[s.length];
        int[] prev = new int[s.length];
        int maxIndex = -1;
        int maxLength = 0;

        for (int i = 0; i < s.length; i++) {
            int current = s[i];
            int ls = 1;
            int lastIndex = -1;

            for (int j = 0; j < i; j++) {
                if (s[j] < current && length[j] + 1 > ls) {
                    ls += length[j];
                    lastIndex = j;
                }
            }
            prev[i] = lastIndex;
            length[i] = ls;

            if (maxLength < ls) {
                maxLength = ls;
                maxIndex = i;
            }
        }

        List<Integer> lis = new ArrayList<>();

        while (maxIndex != -1) {
            lis.add(s[maxIndex]);
            maxIndex = prev[maxIndex];
        }

        for (int i = lis.size() - 1; i >= 0; i--) {
            System.out.print(lis.get(i) + " ");
        }
    }
}