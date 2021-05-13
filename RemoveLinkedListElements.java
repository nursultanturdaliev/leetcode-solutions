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
class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null) {
            return head;
        }
        
        if(head.next == null && head.val == val){
            return null;
        }
        
        ListNode current = head;
        ListNode prev = current;
        
        int index = 0;
        
        while(current != null) {

            if(current.val == val) {

                prev.next = current.next;
                current = current.next;
                if(index == 0) {
                    head = current;
                }
            }else {
                prev = current;
                current = current.next;
                index++;
            }
        }
        
        if(head ==null || head.next == null && head.val == val){
            return null;
        }
        
        return head;
    }
}
