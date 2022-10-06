import java.util.HashMap;
import java.util.Map;

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){ 
            return null;
        }
        Map<Node,Node> map = new HashMap<>();
        Node curr = head;                    
        Node ptr = new Node(curr.val);
        map.put(curr,ptr);
        curr = curr.next;
        Node copy = ptr;                        
        while(curr != null){
            copy.next = new Node(curr.val);
            map.put(curr,copy.next);
            curr = curr.next;
            copy = copy.next;
        }
        curr = head;
        copy = ptr;
        while(curr != null){
            copy.random = map.get(curr.random);
            curr = curr.next;
            copy = copy.next;
        }
        return ptr;
    }
}
