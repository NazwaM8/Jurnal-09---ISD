import java.util.LinkedList;

public class Adjacency {
    int n;
    LinkedList<Integer> adjacencyList[];

    public Adjacency(int N) {
        this.n = N;

        adjacencyList = new LinkedList[n];

        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjacencyList[src].add(dest);
    }


    public String convert(int i) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        return alphabet[i];
    }

    public void printGraph() {
        for (int i = 0; i < n; i++) {
            if (adjacencyList[i].size() > 0) {
                System.out.print("Vertex " + convert(i) + " is connected to: ");
                for (int j = 0; j < adjacencyList[i].size(); j++) {
                    System.out.print(convert(adjacencyList[i].get(j)) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Adjacency myList = new Adjacency(10);

        myList.addEdge(0, 1);
        myList.addEdge(0, 3);
        myList.addEdge(0, 4);

        myList.addEdge(3, 6);

        myList.addEdge(6, 7);

        myList.addEdge(7, 8);

        myList.addEdge(8, 5);

        myList.addEdge(5, 2);

        myList.addEdge(2, 1);

        myList.addEdge(1, 4);

        myList.addEdge(4, 7);
        myList.addEdge(4, 5);

        myList.addEdge(5, 7);

        myList.printGraph();
    }

}