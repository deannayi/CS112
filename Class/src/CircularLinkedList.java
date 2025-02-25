// Generic circular linked list
// T is a placeholder for the data type.
// Data type is plugged in during compilation time
public class CircularLinkedList<T> {
    
    @SuppressWarnings("hiding")
    private class Node<T> {
        private T item;
        private Node<T> next;
    } 
    
    // instance variable of the CLL
    private Node<T> last; // refers to the last node of the list
    private int size;     // number of nodes in the list

    // Constructor
    public CircularLinkedList () {
        last = null; // list is empty
        size = 0;
    }

    // The data to be at the node inserted at the front
    // of the list.
    // Running time O(1)
    public void addToFront (T item) {
        
        if ( last == null ) {
            // list is empty
            last = new Node<T>();
            last.item = item; // store the data
            last.next = last; // points to itself 
        } else {

            Node<T> n = new Node<T>();
            n.next = last.next; // point to the current first node
            n.item = item; // store the data
            last.next = n; // make last point to first node
        }
        size += 1;
    }

    // Running time: O(1)
    public T removeFront () {

        if ( last == null ) {
            // list is empty
            return null;
        } else if ( last.next == last ) {
            // only one item in the list
            T item = last.item; // grab first node's data to return to user
            last = null;
            size -= 1; 
            return item;
        } else {
            // more than one item in the list
            T item = last.next.item; // grab first node's data to return to user
            last.next = last.next.next; // last points to second node
            // first node will be garbage collected later.
            size -= 1;
            return item;
        }
   
    }

    // Worst-case running time for success: O(n)
    // scenario? target is at the last node of the list
    public boolean search (T target) {

        if ( last == null ) {
            System.out.println("List is empty. Not found.");
            return false;
        }

        Node<T> ptr = last.next; // ptr is at the first node

        do {
            if ( ptr.item.equals(target)) {
                return true;
            } else {
                ptr = ptr.next;
            }

        } while ( ptr != last.next );

        // traverse the entire list and didn't find target
        return false;
    }

    // Start at front printing each node's item
    public void print () {

        if ( last == null ) {
            System.out.println("List is empty");
            return;
        }
        Node<T> ptr = last.next; // ptr points to the first node of the list

        do {
            System.out.print(ptr.item + " -> ");
            ptr = ptr.next; // move to the next node
        } while ( ptr != last.next ); // loops until ptr is not back at the front
        System.out.println();
    }

    // CLient, tester, driver
    public static void main (String[] args) {

        // cats is the reference name to the CLL
        CircularLinkedList<String> cats = new CircularLinkedList<String>();
        cats.addToFront("Ploc");
        cats.addToFront("Flo");
        cats.addToFront("Lilo");
        cats.print();
        String removedItem = cats.removeFront();
        System.out.println("Just removed " + removedItem);
        cats.print();
    } 
}
