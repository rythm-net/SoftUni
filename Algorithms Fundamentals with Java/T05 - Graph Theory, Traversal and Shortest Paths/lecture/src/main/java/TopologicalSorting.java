import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class TopologicalSorting {

    public static void main(String[] args) throws IOException {

        StringBuilder out = new StringBuilder();
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(rd.readLine());

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String nextLine = rd.readLine();

            if (nextLine.trim().equals("")) {
                graph.add(new ArrayList<>());
            } else {
                graph.add(Arrays.stream(nextLine.split("\\s+"))
                        .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()));
            }
        }
        rd.close();

        List<Deque<Integer>> connectedComponents = getConnectedComponents(graph);

        for (Deque<Integer> connectedComponent : connectedComponents) {
            out.append("Connected component: ");
            for (Integer integer : connectedComponent) {
                out.append(integer).append(" ");
            }
            out.append(System.lineSeparator());
        }
        System.out.print(out);
    }

    public static List<Deque<Integer>> getConnectedComponents(List<List<Integer>> graph) {

        boolean[] visited = new boolean[graph.size()];

        List<Deque<Integer>> components = new ArrayList<>();

        for (int i = 0; i < graph.size(); i++) {
            if (!visited[i]) {
                components.add(new ArrayDeque<>());
                dfs(i, graph, visited, components);
            }
        }
        return components;
    }

    private static void bfs(int start, List<List<Integer>> graph, boolean[] visited, List<Deque<Integer>> components) {

        Deque<Integer> queue = new ArrayDeque<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            components.get(components.size() - 1).offer(node);

            for (int child : graph.get(node)) {
                if (!visited[child]) {
                    visited[child] = true;
                    queue.offer(child);
                }
            }
        }
    }

    private static void dfs(int node, List<List<Integer>> graph, boolean[] visited, List<Deque<Integer>> components) {
        if (!visited[node]) {
            visited[node] = true;

            for (int child : graph.get(node)) {
                dfs(child, graph, visited, components);
            }
            components.get(components.size() - 1).offer(node);
        }
    }

    private static Map<String, Integer> getDependenciesCount(Map<String, List<String>> graph) {

        Map<String, Integer> dependenciesCount = new LinkedHashMap<>();

        for (Map.Entry<String, List<String>> node : graph.entrySet()) {
            dependenciesCount.putIfAbsent(node.getKey(), 0);

            for (String child : node.getValue()) {
                dependenciesCount.putIfAbsent(child, 0);
                dependenciesCount.put(child, dependenciesCount.get(child) + 1);
            }
        }
        return dependenciesCount;
    }

    public static Collection<String> topSort(Map<String, List<String>> graph) {

        Set<String> visited = new HashSet<>();
        Set<String> cycles = new HashSet<>();
        List<String> sorted = new ArrayList<>();

        for (String node : graph.keySet()) {
            topSortDfs(sorted, visited, cycles, node, graph);
        }
        return sorted;
    }

    private static void topSortDfs(List<String> sorted, Set<String> visited, Set<String> cycles, String node, Map<String, List<String>> graph) {

        if (cycles.contains(node)) {
            throw new IllegalArgumentException();
        }

        if (!visited.contains(node)) {
            visited.add(node);
            cycles.add(node);

            for (String child : graph.get(node)) {
                topSortDfs(sorted, visited, cycles, child, graph);
            }

            cycles.remove(node);
            sorted.add(0, node);
        }
    }
}