import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AreasInMatrix {

    private static StringBuilder out = new StringBuilder();

    private static int areas = 0;
    private static char[][] matrix;
    private static boolean[][] v;
    private static Map<Character, Integer> charAreas = new TreeMap<>();

    private static List<Edge> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(rd.readLine());
        matrix = new char[rows][];
        v = new boolean[rows][];

        for (int i = 0; i < rows; i++) {
            matrix[i] = rd.readLine().toCharArray();
            v[i] = new boolean[matrix[i].length];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!v[i][j]) {
                    areas++;
                    charAreas.putIfAbsent(matrix[i][j], 0);
                    charAreas.put(matrix[i][j], charAreas.get(matrix[i][j]) + 1);
                    dfs(i, j, matrix[i][j]);
                }
            }
        }

        out.append("Areas: ").append(areas).append(System.lineSeparator());
        for (Map.Entry<Character, Integer> entry : charAreas.entrySet()) {
            out.append("Letter '").append(entry.getKey()).append("' -> ").append(entry.getValue()).append(System.lineSeparator());
        }
        System.out.print(out);
    }

    private static void dfs(int row, int col, char areaSymbol) {

        if (outOfBounds(row, col, areaSymbol)) {
            return;
        }
        v[row][col] = true;

        if (indexCheck(row, col + 1, areaSymbol)) {
            graph.add(new Edge(row, col, row, col + 1));
            dfs(row, col + 1, areaSymbol);
        }

        if (indexCheck(row + 1, col, areaSymbol)) {
            graph.add(new Edge(row, col, row + 1, col));
            dfs(row + 1, col, areaSymbol);
        }

        if (indexCheck(row, col - 1, areaSymbol)) {
            graph.add(new Edge(row, col, row, col - 1));
            dfs(row, col - 1, areaSymbol);
        }

        if (indexCheck(row - 1, col, areaSymbol)) {
            graph.add(new Edge(row, col, row - 1, col));
            dfs(row - 1, col, areaSymbol);
        }
    }

    private static boolean outOfBounds(int row, int col, char areaSymbol) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length || v[row][col] || matrix[row][col] != areaSymbol;
    }

    private static boolean indexCheck(int row, int col, char areaSymbol) {
        return !(row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length) && !v[row][col] && matrix[row][col] == areaSymbol;
    }

    private static class Edge {

        private int[] src;
        private int[] dest;

        public Edge(int sRow, int sCol, int dRow, int dCol) {
            this.src = new int[] {sRow, sCol};
            this.dest = new int[] {dRow, dCol};
        }


        public int[] getSrc() {
            return src;
        }

        public Edge setSrc(int[] src) {
            this.src = src;
            return this;
        }

        public int[] getDest() {
            return dest;
        }

        public Edge setDest(int[] dest) {
            this.dest = dest;
            return this;
        }
    }
}