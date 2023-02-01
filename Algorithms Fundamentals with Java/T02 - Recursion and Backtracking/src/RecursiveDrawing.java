import java.util.Scanner;

public class RecursiveDrawing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        draw(n);
    }

    public static void draw(int n){
        if (n > 0) {
            drawLine(n, '*');
            draw(n - 1);
            drawLine(n, '#');
        }
    }

    public static void drawLine(int n, char s) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
        System.out.println();
    }
}