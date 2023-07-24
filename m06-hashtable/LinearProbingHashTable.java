public class LinearProbingHashTable<Key, Value> {
    private Key[] keys;
    private Value[] vals; // the values
    private int capacity; // size of the hash table
    private int size = 0; // number of key-value pairs in the table

    public LinearProbingHashTable(int capacity) {
        this.capacity = capacity;
        keys = (Key[]) new Object[capacity];
        vals = (Value[]) new Object[capacity];
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    private void resize(int cap) {
        LinearProbingHashTable<Key, Value> t;
        t = new LinearProbingHashTable<Key, Value>(cap);
        for (int i = 0; i < capacity; i++)
            if (keys[i] != null)
                t.put(keys[i], vals[i]);
        keys = t.keys;
        vals = t.vals;
        capacity = t.capacity;
    }

    public void put(Key key, Value val) {
        if (size >= capacity / 2)
            resize(2 * capacity); // double M (see text)
        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % capacity)
            if (keys[i].equals(key)) {
                vals[i] = val;
                return;
            }
        keys[i] = key;
        vals[i] = val;
        size++;
    }

    public Value get(Key key) {
        for (int i = hash(key); keys[i] != null; i = (i + 1) % capacity)
            if (keys[i].equals(key))
                return vals[i];
        return null;
    }

    public boolean contains(Key key) {
        if (key == null)
            throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }

    public void delete(Key key) {
        if (!contains(key))
            return;
        int i = hash(key);
        while (!key.equals(keys[i]))
            i = (i + 1) % capacity;
        keys[i] = null;
        vals[i] = null;
        i = (i + 1) % capacity;
        while (keys[i] != null) {
            Key keyToRedo = keys[i];
            Value valToRedo = vals[i];
            keys[i] = null;
            vals[i] = null;
            size--;
            put(keyToRedo, valToRedo);
            i = (i + 1) % capacity;
        }
        size--;

        // downsize
        if (size > 0 && size == capacity / 8)
            resize(capacity / 2);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}