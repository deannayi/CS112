/*
 * A class to manipulate a linked list.
 * It allows us to insert elements into the list, remove elements, traverse, etc...
 */

public class StringLL{
    
    private StringNode front; // reference to first node

    /*
     * creating an empty linked list
     */
   public StringLL(){
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

    public void addToFront(String data){
        StringNode oldFront = front;
        front = new StringNode();
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
        StringNode pointer = front; // pointer contains same object location as front
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
    public String removeFront(){
        String item = front.item; // save item
        front = front.next; // make front point to second node
        return item;
    }

    public String remove(String data){
        StringNode pointer = front;
        StringNode prev = null; // prev pointer one node behind pointer
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

    public void addAfter(String item, String target){
        StringNode pointer = front;
        
        while (pointer != null && !pointer.item.equals(target)){
            pointer = pointer.next; // move pointer ahead
        }

        // found target?
        if (pointer == null){
            // target not found
            return;
        }
        else{
            StringNode n = new StringNode();
            n.item = item;
            n.next = pointer.next;

            // update the node referred to by pointer to point to new node
            pointer.next = n;
        }

    }

    // client
    public static void main (String[] args) {
        
        StringLL list = new StringLL();
        list.addToFront("apple");
        list.addToFront("pear");
        list.addToFront("kiwi");
        list.traverse();
        System.out.println("Deleted: " + list.removeFront());
        list.traverse();
        list.addToFront("lime");
        list.addToFront("mango");
        list.addToFront("tomato");
        list.traverse();
        list.remove("pear");
        list.traverse();
        list.addAfter("pineapple", "mango");
        list.traverse();


    }

}