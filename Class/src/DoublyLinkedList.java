// Generic DLL class (doublye linked list )
// T is a placeholder for the data type.
// Data type is plugged in during compilation time

public class DoublyLinkedList<T> {

    private DLLNode<T> front; // reference to the front of the list
    private int size;         // number of nodes in the list

    public DoublyLinkedList() {
        front = null;
        size = 0;
    }

    public void addToFront(T itemToInsert) {

        // lhs = rhs; the lhs is updated with the value of rhs
        // front contains the address of the first node
        DLLNode<T> oldFront = front; // step 1

        // step 2 - create a new node - front holds the address of the new node
        front = new DLLNode<T>();
        front.item = itemToInsert; // add the data
        front.next = oldFront; // update front to point to oldFront

        // step 3 - make second node (oldFront) point to front
        if ( oldFront != null ) {
            oldFront.prev = front; // can only be done if the list is not empty
        }
    }

    /*
     * Inserts a new node containing itemToInsert into the
     * list after the node containing target.
     * @itemToInsert new node's data.
     * @itemToInsert insert after node containing target.
     * @return true is insertion is successfull, false otherwise.
     * 
     * Running time: search time + create node and hook it up time
     *             : n + 1 => O(n)
     */
    public boolean addAfterTarget (T itemToInsert, T target) {

        // 1 - search for the node containing target
        DLLNode<T> ptr = front;
        while ( ptr != null && !ptr.item.equals(target) ) {
            ptr = ptr.next; // this has to be pepsi clear
        }

        // ptr refers to the node containing target
        // OR ptr refers to null (target is not found)
        if ( ptr == null ) {
            return false; // target not found
        }

        // 2. Create new node and insert into the list
        DLLNode<T> n = new DLLNode<T>();
        n.item = itemToInsert;
        n.next = ptr.next;
        ptr.next = n;
        n.prev = ptr;
    
        // Check if we are inserting in the middle
        // If we are inserting at the end then the assignment cannot happen
        // because n.next is null
        if ( n.next != null ) {
            n.next.prev = n;
        }

        size += 1;
        return true;
    }

    // You implement 
    public void print() {

    }

    public void reverseDLL(){
        if (front == null){
            return;
        }
        DLLNode<T> ptr = front;
        DLLNode<T> prev = null;
        while (ptr != null){
            DLLNode<T> tempPrev = ptr.prev;
            ptr.prev = ptr.next;
            ptr.next = tempPrev;
            ptr = ptr.prev;
            
            prev = ptr;
            ptr = tempPrev;
        }
        front = prev;
    }
    
    // client code to test
    public static void main (String[] args) {

        DoublyLinkedList<String> food = new DoublyLinkedList<>();
        food.addToFront("Soup");
        food.addToFront("Durr Burger");
        food.addToFront("Stromboli");
        food.addAfterTarget("Soup", "Sushi");

        food.print();
    }
}
