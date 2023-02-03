package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] elements = rd.readLine().split("\\s+");

        printReversedArray(elements, elements.length - 1);
    }

    private static void printReversedArray(String[] elements, int i) {

        if (i < 0) {
            return;
        }

        System.out.print(elements[i] + " ");
        printReversedArray(elements, i - 1);
    }
}