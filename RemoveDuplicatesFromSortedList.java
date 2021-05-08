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
class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        
        // SORTED Linked List
        // REMOVE DUPLICATES
        
        
        // constraints
        // 1. number of nodes [0, 300]
        // 2. -100 <= Node.val <= 100
        // 3. List is guaranteed to be sorted in ascending order.
        
        
        // Example:
        
        // 1. regular [1,1,2] -> [1,2]
        
        // 2. corner case [] -> []
        // 3. corner case [1] -> [1]
        // 4. regular [1, 1, 1, 1] -> [1]
        
        // 1. []
        if(head == null) {
            return head;
        }
        
        // 2. [1]
        if(head.next == null) {
            
            return head;
        }
        
        
        ListNode first = head;
        ListNode second = first.next;
        while(second != null) {
            
            if(first.val == second.val) {
                first.next = second.next;
                second = second.next;
                
            } else {
                first = first.next;
                second = second.next;
            }
            
        }
        
        return head;
        
    }
}
