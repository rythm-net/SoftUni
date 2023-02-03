package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationsWithRepetition {

    private static StringBuilder out = new StringBuilder();
    private static int[] arr;
    private static int n;
    private static int k;

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(rd.readLine());
        k = Integer.parseInt(rd.readLine());

        arr = new int[k];
        combinator(0, 1);

        System.out.print(out.toString());
    }

    private static void combinator(int index, int start) {

        if (index == arr.length) {
            printArray();
        } else {
            for (int i = start; i <= n; i++) {
                arr[index] = i;
                combinator(index + 1, i);
            }
        }
    }

    private static void printArray() {

        for (int i = 0; i < arr.length; i++) {
            out.append(arr[i]).append(" ");
        }
        out.append(System.lineSeparator());
    }
}