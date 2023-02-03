package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.stream.Collectors;

public class TowerOfHanoi {

    public static StringBuilder out = new StringBuilder();

    public static Deque<Integer> source = new ArrayDeque<>();
    public static Deque<Integer> spare = new ArrayDeque<>();
    public static Deque<Integer> destination = new ArrayDeque<>();

    public static int steps = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());

        for (int i = n; i >= 1 ; i--) {

            source.push(i);
        }
        printRods();
        solve(n, source, destination, spare);

        System.out.println(out.toString());
    }

    private static void solve(int n, Deque<Integer> source, Deque<Integer> destination, Deque<Integer> spare) {

        if (n == 1) {destination.push(source.pop());
            out.append("Step #").append(steps++).append(": Moved disk").append(System.lineSeparator());
            printRods();
        } else {

            solve(n - 1, source, spare, destination);
            solve(1, source, destination, spare);
            solve(n - 1, spare, destination, source);
        }
    }

    public static void printRods() {
        out.append("Source: ")
                .append(formatRod(source))
                .append(System.lineSeparator())
                .append("Destination: ")
                .append(formatRod(destination))
                .append(System.lineSeparator())
                .append("Spare: ")
                .append(formatRod(spare))
                .append(System.lineSeparator())
                .append(System.lineSeparator());
    }

    private static String formatRod(Deque<Integer> stack) {
        return stack.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}