import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DistanceBetweenVertices {

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(rd.readLine());
        int p = Integer.parseInt(rd.readLine());

        List<Node> graph = new ArrayList<>();
        Set<String> paths = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = rd.readLine().split(":");
            int value = Integer.parseInt(tokens[0]);
            int[] children = (tokens.length < 2)? new int[0]: Arrays.stream
                    (tokens[1].split("\\s+")).mapToInt(Integer::parseInt).toArray();
            graph.add(new Node(value, children));
        }

        for (int i = 0; i < p; i++) {
            paths.add(rd.readLine());
        }
        rd.close();

        StringBuilder out = new StringBuilder();

        for (String path : paths) {

            int[] token = Arrays.stream(path.split("-")).mapToInt(Integer::parseInt).toArray();
            int src = token[0];
            int dest = token[1];
            int[] dist = new int[n];
            int length = -1;

            if (pathLengthBfs(graph, src, dest, dist)) {
                length = dist[transIn(graph, dest)];
            }
            out.append("{").append(src).append(", ").append(dest).append("} -> ").append(length).append(System.lineSeparator());
        }
        System.out.println(out);
    }

    private static boolean pathLengthBfs(List<Node> graph, int src, int dest, int[] dist) {

        int indexOfNode = transIn(graph, src);
        Deque<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[graph.size()];

        for (int i = 0; i < graph.size(); i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
        }

        visited[indexOfNode] = true;
        dist[indexOfNode] = 0;
        queue.offer(indexOfNode);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int child : graph.get(u).children){
                indexOfNode = transIn(graph, child);
                if (!visited[indexOfNode]) {
                    visited[indexOfNode] = true;
                    dist[indexOfNode] = dist[u] + 1;
                    queue.offer(indexOfNode);

                    if (graph.get(indexOfNode).value == dest) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static int transIn(List<Node> graph, int s) {
        return graph.indexOf(graph.stream().filter(v -> v.value == s).findFirst().get());
    }

    private static class Node {

        private int value;
        private int[] children;

        public Node(int value, int[] children) {
            this.value = value;
            this.children = children;
        }

        public int getValue() {
            return value;
        }

        public Node setValue(int value) {
            this.value = value;
            return this;
        }

        public int[] getChildren() {
            return children;
        }

        public Node setChildren(int[] children) {
            this.children = children;
            return this;
        }
    }
}