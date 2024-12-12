public class LinkedQueueOfStrings {
    private Node head, tail;

    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(String item) {
        Node oldTail = tail;
        tail = new Node();
        tail.item = item;
        tail.next = null;
        if (isEmpty())
            head = tail;
        else
            oldTail.next = tail;
    }

    public String dequeue() {
        String item = head.item;
        head = head.next;
        if (isEmpty())
            tail = null;
        return item;
    }
}