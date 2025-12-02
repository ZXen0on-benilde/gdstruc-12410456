import java.util.NoSuchElementException;

public class ArrayQueue {
    private Player[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Player[capacity];
        front = 0;
        back = 0;
    }

    // Enqueue
    public void add(Player player) {

        if (size() == queue.length) {
            int size = size();
            Player[] newArray = new Player[queue.length * 2];
            System.arraycopy(queue, front, newArray, 0, size);
            queue = newArray;
            front = 0;
            back = size;
        }

        queue[back] = player;
        back++;
    }


    public Player remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Player removedPlayer = queue[front];
        queue[front] = null;
        front++;


        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return removedPlayer;
    }

    public int size() {
        return back - front;
    }

    public Player peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void printQueue() {
        if (size() == 0) {
            System.out.println("[ Queue is empty ]");
            return;
        }

        System.out.println("Current queue:");
        for (int i = front; i < back; i++) {
            System.out.println("  " + queue[i]);
        }
    }
}
