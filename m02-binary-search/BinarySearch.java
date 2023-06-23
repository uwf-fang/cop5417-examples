public class BinarySearch {
    public static int search(int [] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            // int mid = (lo + hi) / 2;
            int mid = lo + (hi - lo) / 2;
            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else { // key == arr[mid]
                return mid;
            }
        }
        return -1;
    }
    private static int searchHelper(int [] a, int low, int high, int key) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (a[mid] == key) {
            return mid;
        } else if (a[mid] > key) {
            return searchHelper(a, low, mid - 1, key);
        } else {
            return searchHelper(a, mid + 1, high, key);
        }
    }
    public static int searchRecursive(int [] arr, int key) {
        return searchHelper(arr, 0, arr.length - 1, key);
    }
}