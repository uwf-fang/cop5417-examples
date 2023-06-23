public class LinkedStack<T> {
    private Node head = null;

    private class Node {
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(T item) {
        Node old = head;
        head = new Node();
        head.item = item;
        head.next = old;
    }

    public T pop() {
        T item = head.item;
        head = head.next;
        return item;
    }
}