
public class Driver {
    public static void main(String[] args) {
        System.out.println("Testing LinkedStackOfStrings");
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        stack.push("Hello");
        System.out.println("Value added: Hello");
        stack.push("World");
        System.out.println("Value added: World");
        System.out.println("Value popped: " + stack.pop());
        System.out.println("Value popped: " + stack.pop());

        System.out.println("Testing LinkedQueueOfStrings");
        LinkedQueueOfStrings queue = new LinkedQueueOfStrings();
        queue.enqueue("Hello");
        System.out.println("Value added: Hello");
        queue.enqueue("World");
        System.out.println("Value added: World");
        System.out.println("Value dequeued: " + queue.dequeue());
        System.out.println("Value dequeued: " + queue.dequeue());

    }

}
