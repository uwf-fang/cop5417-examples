import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr = {5, 3, 8, 1, 2};

    System.out.println("Original array: " + Arrays.toString(arr));

    IntSortingAlgorithms.insertionSort(arr);
    System.out.println("Sorted using Insertion Sort: " + Arrays.toString(arr));

    arr = new int[]{5, 3, 8, 1, 2}; // Reset the array

    IntSortingAlgorithms.selectionSort(arr);
    System.out.println("Sorted using Selection Sort: " + Arrays.toString(arr));

    arr = new int[]{5, 3, 8, 1, 2}; // Reset the array

    IntSortingAlgorithms.mergeSort(arr);
    System.out.println("Sorted using Merge Sort: " + Arrays.toString(arr));

    arr = new int[]{5, 3, 8, 1, 2}; // Reset the array

    IntSortingAlgorithms.quickSort(arr);
    System.out.println("Sorted using Quick Sort: " + Arrays.toString(arr));
  }
}
