import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Molecules {

    private static Map<Integer, Node> graph = new HashMap<>();
    private static boolean[] used;

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(rd.readLine());

        for (int i = 1; i <= n; i++) {
            graph.putIfAbsent(i, new Node());
        }

        int m = Integer.parseInt(rd.readLine());

        for (int i = 0; i < m; i++) {
            int[] nodes = Arrays.stream(rd.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            graph.get(nodes[0]).addChild(nodes[1]);
        }

        int start = Integer.parseInt(rd.readLine());
        used = new boolean[n + 1];
        dfs(start);

        StringBuilder out = new StringBuilder();

        for (int i = 1; i < used.length; i++) {
            if (!used[i]) {
                out.append(i).append(" ");
            }
        }
        System.out.println(out);
    }

    private static void dfs(int node) {

        if (used[node]) {
            return;
        }

        used[node] = true;

        for (Integer child : graph.get(node).children){
            if (!used[child]) {
                dfs(child);
            }
        }
    }

    private static class Node {

        private List<Integer> children = new ArrayList<>();

        public Node() {
            this.children = new ArrayList<>();
        }

        public Node(int[] children) {
            this.children = new ArrayList<>();
            for (int child : children) {
                this.children.add(child);
            }
        }

        public List<Integer> getChildren() {
            return children;
        }

        public Node setChildsren(List<Integer> children) {
            this.children = children;
            return this;
        }

        public Node addChild(int child) {
            this.children.add(child);
            return this;
        }
    }
}