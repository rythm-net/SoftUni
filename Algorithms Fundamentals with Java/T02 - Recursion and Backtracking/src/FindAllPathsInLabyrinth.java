import java.util.Scanner;

public class FindAllPathsInLabyrinth {

    static String path = "";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());
        int cells = Integer.parseInt(sc.nextLine());

        char[][] matrix = new char[rows][cells];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = sc.nextLine().toCharArray();
        }

        findPath(matrix, 0, 0, '-');
    }

    public static void findPath(char[][] matrix, int r, int c, char d) {

        if (!inBounds(matrix, r, c)) return;
        if (isFree(matrix, r, c)) return;
        path += d;
        if (onTarget(matrix, r, c, d)) return;

        matrix[r][c] = 'x';

        findPath(matrix, r, c + 1, 'R');
        findPath(matrix, r + 1, c, 'D');
        findPath(matrix, r, c - 1, 'L');
        findPath(matrix, r - 1, c, 'U');

        path = path.substring(0, path.length() - 1);
        matrix[r][c] = '-';
    }

    public static boolean inBounds(char[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }

    public static boolean isFree(char[][] matrix, int r, int c) {
        return matrix[r][c] == 'x' || matrix[r][c] == '*';
    }

    public static boolean onTarget(char[][] matrix, int r, int c, char d) {
        if (matrix[r][c] == 'e') {
            System.out.println(path.substring(1));
            path = path.substring(0, path.length() - 1);
            return true;
        }
        return false;
    }
}