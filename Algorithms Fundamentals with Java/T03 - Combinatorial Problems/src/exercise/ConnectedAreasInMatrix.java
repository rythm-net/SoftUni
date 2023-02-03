package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectedAreasInMatrix {

    public static char[][] matrix;
    public static List<int[]> areas;

    private static StringBuilder out = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int r = Integer.parseInt(rd.readLine());
        int c = Integer.parseInt(rd.readLine());

        matrix = new char[r][c];

        for (int i = 0; i < r; i++) {
            matrix[i] = rd.readLine().toCharArray();
        }

        areas = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == '-') {
                    areas.add(new int[] {row, col, 0});
                    findAreas(row, col);
                }
            }
        }

        out.append("Total areas found: ").append(areas.size()).append(System.lineSeparator());
        AtomicInteger counter = new AtomicInteger(1);

        areas.stream().sorted((f, s) -> Integer.compare(s[2], f[2])).forEach(a -> {out.append("Area #")
                .append(counter.getAndIncrement())
                .append(" at (").append(a[0])
                .append(", ").append(a[1])
                .append("), size: ")
                .append(a[2])
                .append(System.lineSeparator());});

        System.out.print(out);
    }

    private static void findAreas(int row, int col) {

        if (isOutOfBounds(row, col) || isNotTraversal(row, col)) {
            return;
        }

        matrix[row][col] = 'V';
        areas.get(areas.size() - 1)[2]++;

        findAreas(row - 1, col);
        findAreas(row, col - 1);
        findAreas(row, col + 1);
        findAreas(row + 1, col);
    }

    private static boolean isNotTraversal(int row, int col) {
        return matrix[row][col] == 'V' || matrix[row][col] == '*';
    }

    private static boolean isOutOfBounds(int row, int col) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }
}