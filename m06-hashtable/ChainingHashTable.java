import java.util.ArrayList;

class ChainingHashTable<K, V> {
    private int capacity; // Total number of buckets
    private ArrayList<ArrayList<Entry<K, V>>> table; // ArrayList of ArrayLists to store key-value pairs

    // Entry class to store key-value pairs
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor to create the hash table with the specified capacity
    public ChainingHashTable(int capacity) {
        this.capacity = capacity;
        this.table = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            this.table.add(null);
        }
    }

    // Hash function to calculate the index of the key in the ArrayList
    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Method to insert a key-value pair into the hash table
    public void put(K key, V value) {
        int index = hash(key);
        ArrayList<Entry<K, V>> chain = table.get(index);

        if (chain == null) {
            chain = new ArrayList<>();
            table.set(index, chain);
        }

        // Check if the key already exists, if so, update its value
        for (Entry<K, V> existingEntry : chain) {
            if (existingEntry.key.equals(key)) {
                existingEntry.value = value;
                return;
            }
        }

        // Key doesn't exist, add a new entry to the ArrayList
        chain.add(new Entry<>(key, value));
    }

    // Method to get the value associated with a given key
    public V get(K key) {
        int index = hash(key);
        ArrayList<Entry<K, V>> chain = table.get(index);

        if (chain != null) {
            for (Entry<K, V> entry : chain) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }

        return null; // Key not found
    }

    // Method to remove a key-value pair from the hash table
    public void delete(K key) {
        int index = hash(key);
        ArrayList<Entry<K, V>> chain = table.get(index);

        if (chain != null) {
            for (Entry<K, V> entry : chain) {
                if (entry.key.equals(key)) {
                    chain.remove(entry);
                    return;
                }
            }
        }
    }

    // Method to check if the hash table contains a given key
    public boolean contains(K key) {
        int index = hash(key);
        ArrayList<Entry<K, V>> chain = table.get(index);

        if (chain != null) {
            for (Entry<K, V> entry : chain) {
                if (entry.key.equals(key)) {
                    return true;
                }
            }
        }

        return false;
    }

    // Method to check if the hash table is empty
    public boolean isEmpty() {
        for (ArrayList<Entry<K, V>> chain : table) {
            if (chain != null && !chain.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    // Method to get the size of the hash table (number of key-value pairs)
    public int size() {
        int size = 0;
        for (ArrayList<Entry<K, V>> chain : table) {
            if (chain != null) {
                size += chain.size();
            }
        }
        return size;
    }
}
