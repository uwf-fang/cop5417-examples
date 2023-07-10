import java.util.ArrayList;
import java.util.List;

public class MaxHeapPriorityQueue {
    private List<Integer> heap;

    public MaxHeapPriorityQueue() {
        heap = new ArrayList<>();
    }

    public void enqueue(int value) {
        heap.add(value);
        int currentIndex = heap.size() - 1;
        int parentIndex = getParentIndex(currentIndex);

        while (currentIndex > 0 && heap.get(currentIndex) > heap.get(parentIndex)) {
            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
            parentIndex = getParentIndex(currentIndex);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty");
        }

        int maxValue = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int currentIndex = 0;
        int leftChildIndex = getLeftChildIndex(currentIndex);
        int rightChildIndex = getRightChildIndex(currentIndex);

        while (notInOrder(currentIndex, leftChildIndex, rightChildIndex)) {
            int largerChildIndex = getLargerChildIndex(leftChildIndex, rightChildIndex);
            swap(currentIndex, largerChildIndex);
            currentIndex = largerChildIndex;
            leftChildIndex = getLeftChildIndex(currentIndex);
            rightChildIndex = getRightChildIndex(currentIndex);
        }

        return maxValue;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    private boolean notInOrder(int currentIndex, int leftChildIndex, int rightChildIndex) {
        if (leftChildIndex >= heap.size()) {
            return false; // No children
        }

        int currentValue = heap.get(currentIndex);
        int leftChildValue = heap.get(leftChildIndex);

        if (rightChildIndex >= heap.size()) {
            return currentValue < leftChildValue; // Only left child
        }

        int rightChildValue = heap.get(rightChildIndex);
        return (currentValue < leftChildValue || currentValue < rightChildValue);
    }

    private int getLargerChildIndex(int leftChildIndex, int rightChildIndex) {
        if (rightChildIndex >= heap.size() || heap.get(leftChildIndex) > heap.get(rightChildIndex)) {
            return leftChildIndex;
        } else {
            return rightChildIndex;
        }
    }

}
