/**
 *
 * Binary Search Tree implementation of a symbol table.
 * Duplicate keys are not allowed.
 * Assumption: Both keys and values are integers. The key space can be any
 *   integer. The values must be positive.
 * The value -1 is returned if a key is not found.
 *
 * @author Ian Fang
 */
public class BST {
    private Node root;

    private class Node {
        private int key;
        private int value;
        private Node left, right;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(int key, int value) {
        root = put(root, key, value);
    }

    private Node put(Node node, int key, int value) {
        if (node == null) {
            return new Node(key, value);
        }

        if (key < node.key) {
            node.left = put(node.left, key, value);
        } else if (key > node.key) {
            node.right = put(node.right, key, value);
        } else {
            node.value = value;
        }

        return node;
    }

    public int get(int key) {
        Node node = get(root, key);
        return (node != null) ? node.value : -1; // Return -1 if key not found
    }

    private Node get(Node node, int key) {
        if (node == null || node.key == key) {
            return node;
        }

        if (key < node.key) {
            return get(node.left, key);
        } else {
            return get(node.right, key);
        }
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    private Node delete(Node node, int key) {
        if (node == null) {
            return null;
        }

        if (key < node.key) {
            node.left = delete(node.left, key);
        } else if (key > node.key) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node minNode = findMin(node.right);
                node.key = minNode.key;
                node.value = minNode.value;
                node.right = delete(node.right, minNode.key);
            }
        }

        return node;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + size(node.left) + size(node.right);
    }

    public boolean contains(int key) {
        return get(key) != -1;
    }

    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Returns a string representation of the BST.
     * It prints the key-value pairs in order.
     * Implemented using recursive in-order traversal.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(root, sb);
        return sb.toString();
    }

    private void toString(Node node, StringBuilder sb) {
        if (node == null) {
            return;
        }

        toString(node.left, sb);
        sb.append("(").append(node.key).append(", ").append(node.value).append(")").append(", ");
        toString(node.right, sb);
    }

}
