public class BinarySearchDriver {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 23;

        int index = BinarySearch.search(arr, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index); // 5
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}