import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumWithUnlimitedAmountOfCoins {

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int[] coins = Arrays.stream(rd.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int targetSum = Integer.parseInt(rd.readLine());
        rd.close();
        int[] dp = new int[targetSum + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= targetSum; j++) {
                dp[j] += dp[j - coin];
            }
        }
        System.out.println(dp[targetSum]);
    }
}