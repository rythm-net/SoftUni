import java.util.Scanner;

public class GeneratingVectors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        short[] arr = new short[n];

        generator(0, arr);
    }

    public static void generator(int index, short[] vector) {
        if (index >= vector.length) print(vector);
        else {
            for (short i = 0; i <= 1; i++) {
                vector[index] = i;
                generator(index + 1, vector);
            }
        }
    }

    public static void print(short[] vector) {
        int n = 0;
        while (n < vector.length) {
            System.out.print(vector[n]);
            n++;
        }
        System.out.println();
    }
}