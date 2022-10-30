import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
    public T value;
    public List<Edge<T>> edges;
    public Vertex(T value) {
        this.value = value;
        edges=new ArrayList<>();
    }
}
