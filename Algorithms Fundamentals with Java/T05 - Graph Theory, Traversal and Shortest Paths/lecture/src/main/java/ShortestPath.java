import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ShortestPath {

    private static boolean[] visited;
    private static int[] prevNodes;

    public static void main(String[] args) throws IOException {

        StringBuilder out = new StringBuilder();

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        int e = Integer.parseInt(rd.readLine());
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int[] paths = Arrays.stream(rd.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            graph.get(paths[0]).add(paths[1]);
        }

        int start = Integer.parseInt(rd.readLine());
        int end = Integer.parseInt(rd.readLine());
        rd.close();

        visited = new boolean[n + 1];
        prevNodes = new int[n + 1];
        Arrays.fill(prevNodes, -1);
        shortestPathBfs(graph, start, end);
        List<Integer> path = new ArrayList<>();
        path.add(end);

        int prevNode = prevNodes[end];

        while (prevNode != -1) {
            path.add(prevNode);
            prevNode = prevNodes[prevNode];
        }
        out.append("Shortest path length is: ").append(path.size() - 1).append(System.lineSeparator());

        for (int i = path.size() - 1; i >= 0; i--) {
            out.append(path.get(i)).append(" ");
        }
        out.append(System.lineSeparator());

        System.out.print(out);
    }

    private static void shortestPathBfs(List<List<Integer>> graph, int start, int end) {

        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == end) {
                return;
            }
            for (Integer child : graph.get(node)) {
                if (!visited[child]) {
                    visited[child] = true;
                    prevNodes[child] = node;
                    queue.offer(child);
                }
            }
        }
    }
}