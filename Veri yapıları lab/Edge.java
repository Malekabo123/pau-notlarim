public class Edge<T> {
    Vertex<T> from;
    Vertex<T> to;
    int weight;

    public Edge(Vertex<T> from, Vertex<T> to) {
        this.from = from;
        this.to = to;
        weight=1;
    }

    public Edge(Vertex<T> from, Vertex<T> to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}
