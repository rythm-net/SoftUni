package lecture;

import java.util.Scanner;

public class CombinationsWithRepetitions {

    public static String[] elements;
    public static String[] combinations;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        elements = sc.nextLine().split("\\s+");
        int k = Integer.parseInt(sc.nextLine());

        combinations = new String[k];
        combine(0, 0);

    }

    private static void combine(int index, int start) {

        if (index == combinations.length) {
            print(combinations);
        } else {

            for (int i = start; i < elements.length; i++) {
                combinations[index] = elements[i];
                combine(index + 1, i);
            }
        }
    }

    private static void print(String[] elements) {
        System.out.println(String.join(" ", elements));
    }
}