public class Driver {
    public static void main(String[] args) {
        MaxHeapPriorityQueue queue = new MaxHeapPriorityQueue();
        System.out.println("Enqueueing 7 4 9 2 5");
        queue.enqueue(7);
        queue.enqueue(4);
        queue.enqueue(9);
        queue.enqueue(2);
        queue.enqueue(5);

        System.out.print("Dequeueing ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }

}
