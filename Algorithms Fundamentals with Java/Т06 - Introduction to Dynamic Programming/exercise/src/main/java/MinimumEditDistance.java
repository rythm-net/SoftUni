import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumEditDistance {

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int costReplace = Integer.parseInt(rd.readLine());
        int costInsert = Integer.parseInt(rd.readLine());
        int costDelete = Integer.parseInt(rd.readLine());

        char[] first = rd.readLine().toCharArray();
        char[] second = rd.readLine().toCharArray();

        rd.close();

        int[][] dp = new int[first.length + 1][second.length + 1];

        for (int i = 1; i <= second.length; i++) {
            dp[0][i] = dp[0][i - 1] + costInsert;
        }

        for (int i = 1; i <= first.length; i++) {
            dp[i][0] = dp[i - 1][0] + costDelete;
        }

        for (int i = 1; i <= first.length; i++) {
            for (int j = 1; j <= second.length; j++) {
                if (first[i - 1] == second[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int insert = dp[i][j - 1] + costInsert;
                    int replace = dp[i - 1][j - 1] + costReplace;
                    int delete = dp[i - 1][j] + costDelete;
                    dp[i][j] = Math.min(insert, Math.min(replace, delete));
                }
            }
        }
        System.out.println("Minimum edit distance: " + dp[first.length][second.length]);
    }
}