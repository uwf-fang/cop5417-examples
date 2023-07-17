public class BSTTestRunner {
    public static void main(String[] args) {
        BST bst = new BST();

        // Testing put()
        System.out.println("Putting key-value pairs in the BST...");
        bst.put(1, 10);
        bst.put(2, 20);
        bst.put(3, 30);

        // Testing toString()
        System.out.println("Printing the BST...");
        System.out.println(bst);

        // Testing get()
        System.out.println("Getting values from the BST...");
        System.out.println("Value for key 2: " + bst.get(2));
        System.out.println("Value for key 1: " + bst.get(1));
        System.out.println("Value for key 3: " + bst.get(3));

        // Testing delete()
        System.out.println("Deleting key 2...");
        bst.delete(2);
        System.out.println("Value for key 2 after deletion: " + bst.get(2));

        // Testing size()
        System.out.println("Size of the BST: " + bst.size());

        // Testing contains()
        System.out.println("Contains key 3: " + bst.contains(3));
        System.out.println("Contains key 2: " + bst.contains(2));

        // Testing isEmpty()
        System.out.println("Is the BST empty? " + bst.isEmpty());
    }
}
