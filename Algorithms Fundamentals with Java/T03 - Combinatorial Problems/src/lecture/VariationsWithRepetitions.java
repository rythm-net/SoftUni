package lecture;

import java.util.Scanner;

public class VariationsWithRepetitions {

    public static String[] elements;
    public static String[] variations;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        elements = sc.nextLine().split("\\s+");
        int k = Integer.parseInt(sc.nextLine());

        variations = new String[k];
        variate(0);

    }

    private static void variate(int index) {

        if (index == variations.length) {
            print(variations);
            return;
        }

        for (int i = 0; i < elements.length; i++) {
            variations[index] = elements[i];
            variate(index + 1);
        }
    }

    private static void print(String[] elements) {
        System.out.println(String.join(" ", elements));
    }
}