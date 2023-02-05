import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class ConnectedComponentsTests {

    @Test
    public void TestGraphConnectedComponents9Vertices() {
        // Arrange
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(new ArrayList<>(Arrays.asList(3, 6)));
        graph.add(new ArrayList<>(Arrays.asList(3, 4, 5, 6)));
        graph.add(new ArrayList<>(Arrays.asList(8)));
        graph.add(new ArrayList<>(Arrays.asList(0, 1, 5)));
        graph.add(new ArrayList<>(Arrays.asList(1, 6)));
        graph.add(new ArrayList<>(Arrays.asList(1, 3)));
        graph.add(new ArrayList<>(Arrays.asList(0, 1, 4)));
        graph.add(new ArrayList<>());
        graph.add(new ArrayList<>(Arrays.asList(2)));

        // Act
        List<Deque<Integer>> expected = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addAll(Arrays.asList(6, 4, 5, 1, 3, 0));
        expected.add(deque);
        deque = new ArrayDeque<>();
        deque.addAll(Arrays.asList(8, 2));
        expected.add(deque);
        deque = new ArrayDeque<>();
        deque.addAll(Arrays.asList(7));
        expected.add(deque);

        List<Deque<Integer>> connectedComponents = TopologicalSorting.getConnectedComponents(graph);

        // Assert
        for (int i = 0; i < connectedComponents.size(); i++) {
            Deque<Integer> expect = expected.get(i);
            Deque<Integer> result = connectedComponents.get(i);

            Set<Integer> e = new TreeSet<>();
            Set<Integer> r = new TreeSet<>();
            e.addAll(expect);
            r.addAll(result);

            Assert.assertEquals(e.toString(), r.toString());
        }
    }

    @Test
    public void TestGraphConnectedComponents1Vertex() {
        // Arrange
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(new ArrayList<>());

        // Act
        List<Deque<Integer>> expected = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addAll(Arrays.asList(0));
        expected.add(deque);

        List<Deque<Integer>> connectedComponents = TopologicalSorting.getConnectedComponents(graph);

        // Assert
        for (int i = 0; i < connectedComponents.size(); i++) {
            Deque<Integer> expect = expected.get(i);
            Deque<Integer> result = connectedComponents.get(i);

            Set<Integer> e = new TreeSet<>();
            Set<Integer> r = new TreeSet<>();

            e.addAll(expect);
            r.addAll(result);

            Assert.assertEquals(e.toString(), r.toString());
        }
    }

    @Test
    public void TestGraphConnectedComponents0Vertices() {
        // Arrange
        List<List<Integer>> graph = new ArrayList<>();

        // Act
        List<Deque<Integer>> expected = new ArrayList<>();
        List<Deque<Integer>> connectedComponents = TopologicalSorting.getConnectedComponents(graph);

        // Assert
        for (int i = 0; i < connectedComponents.size(); i++) {

            Deque<Integer> expect = expected.get(i);
            Deque<Integer> result = connectedComponents.get(i);

            Set<Integer> e = new TreeSet<>();
            Set<Integer> r = new TreeSet<>();

            e.addAll(expect);
            r.addAll(result);

            Assert.assertEquals(e.toString(), r.toString());
        }
    }

    @Test
    public void TestGraphConnectedComponents7Vertices() {
        // Arrange
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(new ArrayList<>());
        graph.add(new ArrayList<>(Arrays.asList(2, 6)));
        graph.add(new ArrayList<>(Arrays.asList(1)));
        graph.add(new ArrayList<>(Arrays.asList(4)));
        graph.add(new ArrayList<>(Arrays.asList(3)));
        graph.add(new ArrayList<>());
        graph.add(new ArrayList<>(Arrays.asList(1)));

        // Act
        List<Deque<Integer>> expected = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addAll(Arrays.asList(0));
        expected.add(deque);
        deque = new ArrayDeque<>();
        deque.addAll(Arrays.asList(2, 6, 1));
        expected.add(deque);
        deque = new ArrayDeque<>();
        deque.addAll(Arrays.asList(4, 3));
        expected.add(deque);
        deque = new ArrayDeque<>();
        deque.addAll(Arrays.asList(5));
        expected.add(deque);

        List<Deque<Integer>> connectedComponents = TopologicalSorting.getConnectedComponents(graph);

        // Assert
        for (int i = 0; i < connectedComponents.size(); i++) {
            Deque<Integer> expect = expected.get(i);
            Deque<Integer> result = connectedComponents.get(i);

            Set<Integer> e = new TreeSet<>();
            Set<Integer> r = new TreeSet<>();

            e.addAll(expect);
            r.addAll(result);

            Assert.assertEquals(e.toString(), r.toString());
        }
    }

    @Test
    public void TestGraphConnectedComponents4Vertices() {
        // Arrange
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        graph.add(new ArrayList<>(Arrays.asList(0, 1, 2, 3)));
        graph.add(new ArrayList<>(Arrays.asList(0, 1, 3)));
        graph.add(new ArrayList<>(Arrays.asList(1, 2)));

        // Act
        List<Deque<Integer>> expected = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addAll(Arrays.asList(3, 2, 1, 0));
        expected.add(deque);

        List<Deque<Integer>> connectedComponents = TopologicalSorting.getConnectedComponents(graph);

        // Assert
        for (int i = 0; i < connectedComponents.size(); i++) {
            Deque<Integer> expect = expected.get(i);
            Deque<Integer> result = connectedComponents.get(i);

            Set<Integer> e = new TreeSet<>();
            Set<Integer> r = new TreeSet<>();

            e.addAll(expect);
            r.addAll(result);

            Assert.assertEquals(e.toString(), r.toString());
        }
    }
}