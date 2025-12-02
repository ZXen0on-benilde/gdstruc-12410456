public class CardStack {


    private static class Node {
        Card value;
        Node next;

        Node(Card value) {
            this.value = value;
        }
    }

    private Node top;
    private int size;

    public CardStack() {
        top = null;
        size = 0;
    }

    public void push(Card card) {
        Node node = new Node(card);
        node.next = top;
        top = node;
        size++;
    }

    public Card pop() {
        if (isEmpty()) {
            return null;
        }
        Card card = top.value;
        top = top.next;
        size--;
        return card;
    }

    public Card peek() {
        if (isEmpty()) {
            return null;
        }
        return top.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
