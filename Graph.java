package PERTEMUAN8;

public class Graph {
    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        countVertex = 0;
        for (int i = 0; i < vertexList.length; i++) {
            for (int j = 0; j < vertexList.length; j++) {
                if (i == j) {
                    adjacencyMatrix[i][j] = 0;
                } else {
                    adjacencyMatrix[i][j] = -1;
                }
            }
        }
    }

    public void addVertex(char label) {
        vertexList[countVertex] = new Vertex(label);
        countVertex++;
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
        adjacencyMatrix[destination][source] = weight;
    }

    public void addEdge(char source, char destination, int weight) {
        addEdge(indexVertex(source), indexVertex(destination), weight);
    }

    public int indexVertex(char label) {
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i] != null) {
                if (vertexList[i].getLabel() == label) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void print() {
        System.out.println("Graph:");
        for (int i = 0; i < countVertex; i++) {
            System.out.print("\t"+vertexList[i].getLabel());
        }
        System.out.println();
        for (int i = 0; i < countVertex; i++) {
            System.out.print(vertexList[i].getLabel() + "\t");
            for (int j = 0; j < countVertex; j++) {
                System.out.print(adjacencyMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
