public class RefresherObjectsReferences {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // primitive variables (primitive data types)
        // int, float, double, char, boolean, long, shot, byte
        int i = 0;

        // reference variables (pointer to an object)
        String s1 = new String("CS112");

        // n1 is a reference to an instance of the StringNode class
        // instance is an object
        StringNode n1 = new StringNode();
        n1.item = new String("first node");
        n1.next = null; // this is the last item in the linked list

        StringNode n2 = new StringNode();
        n2.item = new String("second node");
        n2.next = null;

        // make n1 point(refer to) n2
        n1.next = n2;

        // question: why isn't n1.next = n2.next?
        // n1.next = n2.next;
        // A. n1.next will contain null

        // add another node to the end of the list
        StringNode n3 = new StringNode();
        n3.item = new String ("third node");
        n3.next = null;

        // make n2 point to n3
        n2.next = n3;

        // what happens when n2 points to n3?
        // n2 will point to same StringNode object as n3
        n2 = n3;
    }
}
