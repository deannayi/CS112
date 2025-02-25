/*
 * generic linked list implementation
 * 
 * T stands for Type => placeholder for data type
 */

public class LinkedList <T> {
    
    // Node class only visible in LinkedList class (no other class can use it)
    @SuppressWarnings("hiding")
    private class Node <T> {
        T item; // data
        Node <T> next; // link to next node
    }
    
    private Node <T> front; // reference to first node

    /*
     * creating an empty linked list
     */
   public LinkedList(){
        front = null;
    }

    /*
     * Add a new node to the beginning of the list.
     * The parameter data will be the new node's item
     * 
     * List has n nodes:
     * Running time? Count all operations
     * There are only 4 operations --> O(1)
     */ 

    public void addToFront(T data){
        Node <T> oldFront = front;
        front = new Node <T>();
        front.item = data;
        front.next = oldFront;
    }
    
    /*
     * Starting at the front, print every item of the list.
     * List has n nodes:
     * Running time? count print towards running time
     * f(n) = n --> O(n)
     */
    public void traverse(){
        Node <T> pointer = front; // pointer contains same object location as front
        while (pointer != null){
            System.out.print(pointer.item + " -> ");
            pointer = pointer.next; // moving pointer to next node
        }
        System.out.println("\\");
    }

    /* Remove first node, returns the item 
     * 
     * List has n nodes.
     * Running time? Count all operations
     * There are 2 operations --> O(1)
    */
    public T removeFront(){
        T item = front.item; // save item
        front = front.next; // make front point to second node
        return item;
    }

    public T remove(T data){
        Node <T> pointer = front;
        Node <T> prev = null; // prev pointer one node behind pointer
        while(pointer != null && !pointer.item.equals(data)){
            prev = pointer; // update prev
            pointer = pointer.next; // move pointer ahead
        }

        // either we walked out of the list (didn't find item) OR
        // pointer points to the node to be deleted
        
        if (pointer == null){
            // data is not in list
            return null;
        }
        else{
            prev.next = pointer.next;
            return pointer.item;
        }
    }

    public void addAfter(T item, T target){
        Node <T> pointer = front;
        
        while (pointer != null && !pointer.item.equals(target)){
            pointer = pointer.next; // move pointer ahead
        }

        // found target?
        if (pointer == null){
            // target not found
            return;
        }
        else{
            Node <T> n = new Node <T>();
            n.item = item;
            n.next = pointer.next;

            // update the node referred to by pointer to point to new node
            pointer.next = n;
        }

    }

    // client
    public static void main (String[] args) {
        
        // Node containing String
        LinkedList<String> fruits = new LinkedList<>();
        fruits.addToFront("apple");
        fruits.addToFront("pear");
        fruits.addToFront("kiwi");
        fruits.traverse();

        // Node containing integer
        LinkedList<Integer> age = new LinkedList<>();
        age.addToFront(19);
        age.addToFront(18);
        age.addToFront(35);
        age.addToFront(24);
        age.traverse();

    }

}
