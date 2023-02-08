import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveDownRight {

    private static long[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(rd.readLine());
        int cols = Integer.parseInt(rd.readLine());
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(rd.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        rd.close();

        int[][] dp = new int[rows][cols];
        dp[0][0] = matrix[0][0];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row == 0 && col == 0) {
                    continue;
                } else if (row == 0) {
                    dp[row][col] = dp[row][col - 1] + matrix[row][col];
                } else if (col == 0) {
                    dp[row][col] = dp[row - 1][col] + matrix[row][col];
                } else {
                    if (dp[row - 1][col] > dp[row][col - 1]) {
                        dp[row][col] = dp[row - 1][col] + matrix[row][col];
                    } else {
                        dp[row][col] = dp[row][col - 1] + matrix[row][col];
                    }
                }
            }
        }

        List<String> path = new ArrayList<>();
        rows--; cols--;

        while (rows >= 0 && cols >= 0) {
            path.add("[" + rows + ", " + cols + "]");
            if (rows == 0) {
                cols--;
            } else if (cols == 0) {
                rows--;
            } else if (dp[rows - 1][cols] <= dp[rows][cols - 1]) {
                cols--;
            } else {
                rows--;
            }
        }

        Collections.reverse(path);
        System.out.println(String.join(" ", path));
    }
}