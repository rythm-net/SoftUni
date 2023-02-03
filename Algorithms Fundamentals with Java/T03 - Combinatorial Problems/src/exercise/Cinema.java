package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cinema {

    private static StringBuilder out = new StringBuilder();

    private static String[] seats;
    private static String[] combinations;
    private static boolean[] used;
    private static List<String> people;

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        people = Arrays.stream(rd.readLine().split(", ")).collect(Collectors.toList());
        seats = new String[people.size()];

        String line = rd.readLine();

        while (!line.equals("generate")) {
            String[] tokens = line.split(" - ");

            String name = tokens[0];
            int position = Integer.parseInt(tokens[1]) - 1;

            seats[position] = name;

            people.remove(name);

            line = rd.readLine();
        }

        combinations = new String[people.size()];
        used = new boolean[people.size()];
        permute(0);

        System.out.print(out);
    }

    private static void permute(int index) {

        if (index == combinations.length) {
            print();
        } else {
            for (int i = 0; i < people.size(); i++) {
                if (!used[i]) {
                    used[i] = true;
                    combinations[index] = people.get(i);
                    permute(index + 1);
                    used[i] = false;
                }
            }
        }
    }

    private static void print() {
        int index = 0;

        for (String seat : seats) {
            if (seat != null) {
                out.append(seat).append(" ");
            } else {
                out.append(combinations[index++]).append(" ");
            }
        }
        out.deleteCharAt(out.length() - 1);
        out.append(System.lineSeparator());
    }
}