public class StringNode {
 
    // instance variables
    public String item;     // data part
    public StringNode next; // link part which points the next node in the LL
                            // the next object is of the same data type (StringNode) as this one
    StringNode() {
        item = null;
        next = null;
    }
}
