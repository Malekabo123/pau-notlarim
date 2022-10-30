public class BTNode<T> {
    public BTNode<T> left;
    public BTNode<T> right;
    public T value;

    public BTNode(T value, BTNode<T> left, BTNode<T> right) {
        this.left = left;
        this.right = right;
        this.value = value;
    }
}
