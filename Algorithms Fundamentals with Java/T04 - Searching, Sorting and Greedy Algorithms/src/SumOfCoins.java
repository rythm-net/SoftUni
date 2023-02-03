import java.util.*;

public class SumOfCoins {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] elements = in.nextLine().substring(7).split(", ");

        int[] coins = new int[elements.length];

        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(elements[i]);
        }
        int targetSum = Integer.parseInt(in.nextLine().substring(5));

        Map<Integer, Integer> usedCoins = chooseCoins(coins, targetSum);

        for (Map.Entry<Integer, Integer> usedCoin : usedCoins.entrySet()) {
            System.out.println(usedCoin.getKey() + " -> " + usedCoin.getValue());
        }
    }

    public static Map<Integer, Integer> chooseCoins(int[] coins, int targetSum) {

        Map<Integer, Integer> change = new LinkedHashMap<>();
        List<Integer> sortedCoins = Arrays.stream(coins).boxed().sorted(Collections.reverseOrder()).toList();

        int currentSum = 0;
        int index = 0;

        while (currentSum != targetSum && index < sortedCoins.size()) {
            int currentCoin = sortedCoins.get(index);
            int remainder = targetSum - currentSum;
            int numberOfCoins = remainder / currentCoin;

            if (currentSum + currentCoin <= targetSum) {
                change.put(currentCoin, numberOfCoins);
                currentSum += numberOfCoins * currentCoin;
            }
            index++;
        }

        if (currentSum != targetSum) {
            throw new IllegalArgumentException();
        }
        return change;
    }
}