public class Tree {

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.transverseInOrder();
        }
    }

    public void traverseInOrderDescending() {
        if (root != null) {
            root.transverseInOrderDescending();
        }
    }

    public Node get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public Node getMin() {
        if (root == null) {
            return null;
        }
        return root.getMin();
    }

    public Node getMax() {
        if (root == null) {
            return null;
        }
        return root.getMax();
    }
}
