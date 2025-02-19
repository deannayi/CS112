// Generic Node class (doubly linked list node)
// T is a placeholder for the data type.
// Data type is plugged in during compilation time
public class DLLNode<T> {
 
    T item;          // data part of the node
    DLLNode<T> next; // link to the next node
    DLLNode<T> prev; // link to the previous node

    DLLNode () {
        item = null;
        next = null;
        prev = null;
    }
}