public class LinkedStackOfStrings {
    private Node head = null;

    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(String item) {
        Node old = head;
        head = new Node();
        head.item = item;
        head.next = old;
    }

    public String pop() {
        String item = head.item;
        head = head.next;
        return item;
    }
}