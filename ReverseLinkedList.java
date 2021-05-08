/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        
        // 1. Singly linked list.
        // 2. Reverse it.
        // 3. Return reversed list.
        
        // Constraints
        
        // Number of nodes [0, 5000]
        // val -5000 <= Node.val <=5000
        
        // Example:
        // Regular [1, 2] -> [2, 1]
        // Edge case min [] -> []
        // Regular [1] -> [1]
        // edge case [1, 1, 1] -> [1, 1, 1]
        
        // question: reversed means only the values are output in the   reverse direction? What if has the same value?
        
        
        if(head == null) {
            return head;
        }
        
        if(head.next == null) {
            return head;
        }
        
        
        Stack<Integer> stack = new Stack<Integer>();
        
        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }
        
        ListNode temp = head;
        while(!stack.isEmpty()) {
                        
            if(head == null){
                head = new ListNode();
                head.val = stack.pop();
                temp = head;
            }else {
                temp.next = new ListNode();
                temp.next.val = stack.pop();
                temp = temp.next;
            }
        }
        
        return head;
        
    }
}
