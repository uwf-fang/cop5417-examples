public class TestLinearProbing {
   public static void main(String[] args) {
        LinearProbingHashTable<String, Integer> hashTable = new LinearProbingHashTable<>(10);

        // Insert key-value pairs into the hash table
        hashTable.put("one", 1);
        hashTable.put("two", 2);
        hashTable.put("three", 3);
        hashTable.put("four", 4);

        // Get values by keys
        System.out.println("Value of 'one': " + hashTable.get("one"));
        System.out.println("Value of 'three': " + hashTable.get("three"));
        System.out.println("Value of 'five': " + hashTable.get("five")); // Key not found

        // Remove a key-value pair
        hashTable.delete("two");

        // Check if the hash table contains a key
        System.out.println("Contains 'two': " + hashTable.contains("two")); // false

        // Check if the hash table is empty
        System.out.println("Is empty: " + hashTable.isEmpty()); // false

        // Get the size of the hash table
        System.out.println("Size of hash table: " + hashTable.size()); // 3
   }

}
