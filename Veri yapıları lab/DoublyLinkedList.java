import java.util.Iterator;

public abstract class DoublyLinkedList<T> implements Iterable<T> {
    /**
     * Node sınıfı, inner
     * @param <T> Generic değer
     */
    public class Node<T> {
        public T value;
        public Node<T> next;
        public Node<T> previous;

        public Node(T value, Node<T> next, Node<T> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        size=0;
    }
    public int size(){return size;}
    public boolean isEmpty(){return size==0;}
    public void addFirst(T value){
        Node<T> node=new Node(value, head, null);
        if (head!=null)
            head.previous=node;
        head=node;
        if (tail==null)
            tail=node;
        size++;
    }
    public void addLast(T value){
        Node<T> node=new Node<>(value, null, tail);
        if (tail!=null)
            tail.next=node;
        tail=node;
        if(head==null)
            head=node;
        size++;
    }
    public T removeFirst(){
        Node<T> node=head;
        head=head.next;
        if(head!=null)
            head.previous=null;
        size--;
        return node.value;
    }
    public T removeLast(){
        Node<T> node=tail;
        tail=tail.previous;
        if(tail!=null)
            tail.next=null;
        size--;
        return node.value;
    }
    public void print(){
        Node<T> node=head;
        while(node!=null) {
            System.out.print(node.value + " ");
            node=node.next;
        }
        System.out.println();
    }
    public void reversePrint(){
        Node<T> node=tail;
        while(node!=null) {
            System.out.print(node.value + " ");
            node=node.previous;
        }
        System.out.println();
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    @Override
    public Iterator<T> iterator() {
        //Interface gerçekleştiren nesne oluşturma
        Iterator<T> iterator=new Iterator<T>() {
            private Node<T> node=head;
            @Override
            public boolean hasNext() { //Sonraki değer var mı
                return node!=null;
            }
            @Override
            public T next() { //Sonraki değeri döndür
                T rval=node.value;
                node=node.next; //iterator'u ilerlet
                return rval;
            }
        };
        return iterator;
    }

    @Override
    public String toString() {
        if (size==0)
            return "";
        String r="";
        for(T val:this)
            r+=val+", ";
        r=r.substring(0,r.length()-2);
        return r;
    }

    public void setSize(int size) {//size değerini değiştirmek için...
        this.size = size;
    }

    public abstract void insertAt(int index, T value);
    public abstract T removeAt(int index);
}