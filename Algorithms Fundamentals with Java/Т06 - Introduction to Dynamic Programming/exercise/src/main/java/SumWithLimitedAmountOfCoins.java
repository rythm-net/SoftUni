import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumWithLimitedAmountOfCoins {

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(rd.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(rd.readLine());
        rd.close();

        Map<Integer, Integer> dp = new HashMap<>();

        int result = 0;
        dp.put(0, 0);

        for (int currentCoin : array) {

            for (Integer number : new ArrayList<>(dp.keySet())) {
                int newSum = currentCoin + number;

                if (newSum == target) {
                    result++;
                }
                dp.putIfAbsent(newSum, number);
            }
        }
        System.out.println(result);
    }
}