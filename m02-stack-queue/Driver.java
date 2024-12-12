
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
        LinkedStack<Integer> stack1 = new LinkedStack<>();
        stack1.push(1);
        System.out.println("Value added: 1");
        stack1.push(2);
        System.out.println("Value added: 2");
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
        LinkedQueue<Integer> queue1 = new LinkedQueue<>();
        queue1.enqueue(1);
        System.out.println("Value added: 1");
        queue1.enqueue(2);
        System.out.println("Value added: 2");
        System.out.println("Value dequeued: " + queue1.dequeue());
        System.out.println("Value dequeued: " + queue1.dequeue());

    }

}
