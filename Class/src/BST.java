
/*
 * Generic implementation of a BST
 * K is the data type for the key
 * V is the data type for the value
 * 
 * Interfaces in Java have methods signatures but NO implementation.
 * 
 * When a class extends an interface it is obligated to have 
 * an implementation for the interfaces' method(s).
 * 
 * The Comparable interface: has one method - compareTo()
 * 
 * K extends Comparable<K>: this means that the data type K is 
 * obligated to implement the method compareTo()
 * 
 */
public class BST <K extends Comparable<K>, V> {

    // inner class that will ONLY be used inside BST
    private class Node {
        K key;              // key is used for searching (e.g. ruid)
        V value;            // value that is associated with the key (e.g. student's record)
        private Node left;  // link to the left subtree
        private Node right; // link to the right subtree

        public Node (K key, V value) {
            this.key = key;
            this.value = value;
            left = right = null;
        }
    }
    
    // instance variables of the BST class
    private Node root; // root node of the BST
    private int size;  // number of items in the BST

    public BST () {
        root = null; // empty tree
        size = 0;
    }

    public Node getRoot() {
        return root;
    }

    // Insert the pair <key, value> into the BST.
    // If the key is already present, update the value.
    // Running time best-case: O(log n) when the tree is balanced
    // Running time worst-case: O(n) when the tree is skewed
    public void put (K targetKey, V value) {

        Node ptr = root;
        Node prev = null;
        int c = 0;

        while ( ptr != null ) {

            c = targetKey.compareTo(ptr.key);
            if ( c == 0 ) {
                // targetKey is present, update value
                ptr.value = value;
                return;
            } else if ( c < 0 ) {
                // targetKey < ptr.key
                prev = ptr;
                ptr = ptr.left;
            } else {
                // targetKey > ptr.key
                prev = ptr;
                ptr = ptr.right;
            }
        }

        // ptr is null, targetKey is not present
        // insert it
        Node newNode = new Node(targetKey, value);
        if ( prev == null ) {
            // tree is empty
            root = newNode;
        } else if ( c < 0 ) {
            prev.left = newNode;
        } else {
            prev.right = newNode;
        }
        size += 1;
    }
    // Running time for success - how many comparisons
    // Running time is 1 + depth of the node
    // Best-case: searching for the root is 1 comparison
    // Worst-case: searching for a key at the leaf level 
    // (tree might be skewed) O(n)
    // Search for targetKey, return the value associated with it
    public V get (K targetKey) {

        Node ptr = root;
        while ( ptr != null ) {

            int c = targetKey.compareTo(ptr.key);
            if ( c == 0 ) {
                return ptr.value;
            } else if ( c < 0 ) {
                // targetKey < ptr.key
                ptr = ptr.left;
            } else {
                // c > 0
                // targetKey > ptr.key
                ptr = ptr.right;
            }
        }
        // walked out of the tree, targetKey wasn't found
        return null;
    }

    // Traverse the tree in ascending order: inorder traversal
    // The tree has n items
    // Running time: O(n)
    public void inorder (Node x) {

        if ( x == null ) return;
        inorder (x.left);              // traverse the left subtree
        System.out.print(x.key + " "); // count towards running time
        inorder (x.right);             // traverse the right subtree
    }

    public void preorder (Node x) {

    }

    public void postorder (Node x) {
     
    }

    private static boolean search(Node n, int k){
        
    }

    public static void main (String[] args) {

        BST<String, String> example = new BST();
        example.put("S", "S's value");
        example.put("E", "E's value");
        example.put("R", "R's value");
        example.put("A", "A's value");
        example.put("C","C's value");
        example.put("H","H's value");
        example.put("M","M's value");

        example.put("X", "X's value");
        example.inorder(example.getRoot());
        System.out.println();
        example.preorder(example.getRoot());
        System.out.println();
        example.postorder(example.getRoot());
        System.out.println();
    }

}
