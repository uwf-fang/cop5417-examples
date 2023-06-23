
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

        System.out.println("Testing LinkedStack");
        LinkedStack<String> stack1 = new LinkedStack<>();
        stack1.push("Hello");
        System.out.println("Value added: Hello");
        stack1.push("World");
        System.out.println("Value added: World");
        System.out.println("Value popped: " + stack1.pop());
        System.out.println("Value popped: " + stack1.pop());

        System.out.println("Testing LinkedQueueOfStrings");
        LinkedQueueOfStrings queue = new LinkedQueueOfStrings();
        queue.enqueue("Hello");
        System.out.println("Value added: Hello");
        queue.enqueue("World");
        System.out.println("Value added: World");
        System.out.println("Value dequeued: " + queue.dequeue());
        System.out.println("Value dequeued: " + queue.dequeue());

        System.out.println("Testing LinkedQueue");
        LinkedQueue<String> queue1 = new LinkedQueue<>();
        queue1.enqueue("Hello");
        System.out.println("Value added: Hello");
        queue1.enqueue("World");
        System.out.println("Value added: World");
        System.out.println("Value dequeued: " + queue1.dequeue());
        System.out.println("Value dequeued: " + queue1.dequeue());

    }

}
