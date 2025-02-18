public class rec3 {

    public static void insertAfter(Node head, String target, String newValue){
        for (Node ptr = head; ptr != null; ptr = ptr.next){
            if (ptr.data == target){
                Node n = new Node(newValue, ptr.next);
                ptr.next = n;
                break;
            }
        }
    }
    
    public static void reverseLL(Node head){
        Node prev = null;
        for (Node ptr = head; ptr != null; ptr = ptr.next){
            ptr.next = prev;
            prev.next = ptr;
        }
    }

}

