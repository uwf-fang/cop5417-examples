public class TypeTest {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // Using assignment (=) with reference-typed variables
        int[] array3 = array1; // array3 now holds the memory address of array1

        System.out.println(array1 == array2); // false, different memory addresses
        System.out.println(array1 == array3); // true, same memory address

        array1[0] = 10; // Modifying the array through array1
        System.out.println(array3[0]); // 10, since array3 points to the same memory location

        modifyArray(array2);
        System.out.println(array2[0]); // 100, since the method modified the array

        System.out.println(array1 == array2); // false, modified array2 but not array1
    }

    public static void modifyArray(int[] array) {
        array[0] = 100;
    }
}
