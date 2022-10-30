public abstract class BinarySearchTree<T extends Comparable<T>> {
    private BTNode<T> root;

    public BinarySearchTree(BTNode<T> root) {
        this.root = root;
    }

    public BinarySearchTree() { }

    public BTNode<T> getRoot() {
        return root;
    }

    public BTNode<T> find(BTNode<T>node, T value){
        if(node==null || node.value==value)
            return node;
        else if(value.compareTo(node.value)<0)
            return find(node.left, value);
        else
            return find(node.right, value);
    }

    public boolean contains(T value){
        return find(root, value)!=null;
    }

    public void add(T value){
        add(root, value);
    }

    private void add(BTNode<T> node, T value) {
        if(root==null) {
            root = new BTNode<>(value, null, null);
            return;
        }
        if(value.compareTo(node.value)<0) {
            if(node.left==null)
                node.left = new BTNode<>(value, null, null);
            else
                add(node.left, value);
        }
        else if(value.compareTo(node.value)>0){
            if(node.right==null)
                node.right=new BTNode<>(value, null, null);
            else
                add(node.right, value);
        }
        else throw new RuntimeException("Eleman ağaçta mevcut!");
    }

    @Override
    protected abstract Object clone() throws CloneNotSupportedException;
    public abstract BTNode<T> successor(T value);
    public abstract BTNode<T> predecessor(T value);
    public abstract BTNode<T> findParent(BTNode<T> node);
}
