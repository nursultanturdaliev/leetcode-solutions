/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null) {
            return false;
        }
        
        if(head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        if(slow == head) {
            return true;
        }
        
        while(slow != head) {
            
            if(fast == null && fast.next == null) {
                return false;
            }
            
            if(fast == slow) {
                return true;
            }
            
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        return false;
        
    }
}
