import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CyclesInGraph {

    private static StringBuilder out = new StringBuilder();
    private static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String input = rd.readLine();

        while (!input.equals("End")) {
            String[] token = input.split("-");
            graph.putIfAbsent(token[0], new ArrayList<>());
            graph.putIfAbsent(token[1], new ArrayList<>());
            graph.get(token[0]).add(token[1]);
            graph.get(token[1]).add(token[0]);

            input = rd.readLine();
        }
        rd.close();
        out.append("Acyclic: ");

        if (isCyclic()) {
            out.append("No");
        } else {
            out.append("Yes");
        }
        System.out.println(out);
    }

    private static boolean isCyclic() {

        Map<String, Boolean> visited = new HashMap<>();

        for (String key : graph.keySet()) {
            visited.putIfAbsent(key, false);
        }

        for (String key : graph.keySet()) {
            if (!visited.get(key)) {
                if (isCyclicUtil(key, visited, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isCyclicUtil(String key, Map<String, Boolean> visited, String parent) {

        visited.put(key, true);
        String i;
        Iterator<String> it = graph.get(key).iterator();

        while (it.hasNext()) {
            i = it.next();
            if (!visited.get(i)) {
                if (isCyclicUtil(i, visited, key)) {
                    return true;
                }
            } else if (!i.equals(parent)) {
                return true;
            }
        }
        return false;
    }
}