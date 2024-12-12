public class LinkedQueue<T> {
    private Node head, tail;

    private class Node {
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(T item) {
        Node oldTail = tail;
        tail = new Node();
        tail.item = item;
        tail.next = null;
        if (isEmpty())
            head = tail;
        else
            oldTail.next = tail;
    }

    public T dequeue() {
        T item = head.item;
        head = head.next;
        if (isEmpty())
            tail = null;
        return item;
    }
}