import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractGraph<T> {
    /**
     * Düğümleri tutan liste
     */
    protected List<Vertex<T>> vertices;
    /**
     * Değere göre düğümün kenar listesinin saklandığı map
     */
    protected Map<T, List<Edge<T>>> edges;
    /**
     * Düğümlere kolay erişmek için kullanılan map <değer, düğüm>
     */
    protected Map<T, Vertex<T>> verticesMap;
    /**
     * Çizge yönlü mü
     */
    boolean directed=true;

    public AbstractGraph() {
        vertices=new ArrayList<>();
        edges=new HashMap<>();
        verticesMap=new HashMap<>();
    }

    public AbstractGraph(boolean directed) {
        this();
        this.directed=directed;
    }

    /**
     * Çizgeye düğüm ekler
     * @param deger eklenecek düğümün değeri
     */
    public void addVertex(T deger){
        if(!vertices.contains(deger)) {
            Vertex<T> v=new Vertex<>(deger);
            vertices.add(v);
            edges.put(deger, v.edges);
            verticesMap.put(deger, v);
        }
    }

    /**
     * Çizgeye kenar ekler
     * @param from kenarın çıktığı düğüm
     * @param to kenarın girdiği düğüm
     */
    public void addEdge(T from, T to){
        addEdge(from,to,1);
    }

    /**
     * Çizgeye kenar ekler
     * @param from kenarın çıktığı düğüm
     * @param to kenarın girdiği düğüm
     * @param weight kenarın ağırlığı
     */
    public void addEdge(T from, T to, int weight) {
        Vertex<T> f=verticesMap.get(from);
        Vertex<T> t=verticesMap.get(to);
        if (f!=null && t!=null){
            for (Edge<T> e:f.edges)
                if(e.to.value.equals(to))
                    return;
            Edge e1=new Edge(f,t,weight);
            edges.get(from).add(e1);
            if(!directed){
                Edge e2=new Edge(t,f,weight);
                edges.get(to).add(e2);
            }
        }

    }

    /**
     * Çizgenin içeriğini ekrana yazdırır
     */
    public void print() {
        System.out.println(toString());
    }

    /**
     * Düğüm ve kenarları içeren metinsel temsil
     * @return Çizgenin metin temsilini verir
     */
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Vertices:\n");
        for (Vertex<T> vertex:vertices)
            sb.append(vertex.value+"\n");
        sb.append("Edges:\n");
        for (Map.Entry<T,List<Edge<T>>> entry:edges.entrySet())
            for (Edge<T> edge:entry.getValue())
                sb.append(edge.from.value+(edge.weight!=1?" - "+edge.weight:"")+" -> "+edge.to.value+"\n");
        return sb.toString();
    }

    public abstract int inDegree(T deger);
    public abstract int outDegree(T deger);
}
