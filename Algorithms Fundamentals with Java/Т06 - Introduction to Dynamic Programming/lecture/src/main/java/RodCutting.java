import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RodCutting {

    private static int[] prices;
    private static int[] bestPrices;
    private static int[] bestCombo;

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        prices = Arrays.stream(rd.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int length = Integer.parseInt(rd.readLine());
        rd.close();

        bestPrices = new int[length + 1];
        bestCombo = new int[length + 1];

        int maxProfit = cutRod(length);

        System.out.println(maxProfit);
        reconstructSolution(length);
    }

    private static int cutRod(int n) {
        for (int i = 1; i <= n; i++) {
            int current;
            for (int j = 1; j <= i; j++) {
                current = Math.max(bestPrices[i], prices[j] + bestPrices[i - j]);
                if (current > bestPrices[i]) {
                    bestPrices[i] = current;
                    bestCombo[i] = j;
                }
            }
        }
        return bestPrices[n];
    }

    private static void reconstructSolution(int n) {
        while (n - bestCombo[n] != 0) {
            System.out.print(bestCombo[n] + " ");
            n = n - bestCombo[n];
        }
        System.out.println(bestCombo[n]);
    }
}