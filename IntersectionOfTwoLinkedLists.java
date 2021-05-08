/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        
        //Notes:
        
        // Given -> heads of two singly linked lists.
        // Return -> node at which two lists intersect.
        // When  -> no intersection -> null
        
        // Guaranteed no circles;
        // Do not modify linked lists.
        
        //Examples:
        
        // [], [] -> null
        // [1], [1] -> 1
        // [1, 2 ,3 ,4], [3, 4, 5, 6, 8] -> 3
        // [1, 2 ,3 ,4], [5, 6, 7, 8, 9] -> null
        // [1], [3] -> null
        
        // algorithm
        
        int listALength = getLength(headA);
        int listBLength = getLength(headB);
        
        int min = listALength < listBLength ? listALength: listBLength;
        int max = listALength > listBLength ? listALength: listBLength;
        
        ListNode longest = listALength > listBLength ? headA: headB;
        ListNode shortest = listBLength < listALength ? headB: headA;
        
        if(listALength == 0){
            return null;
        }        
        
        if(listBLength == 0) {
            return null;
        }
        
        while(max != min) {
            longest = longest.next;
            max--;
        }
        
        
        while(longest != shortest) {
            longest = longest.next;
            shortest = shortest.next;
        }
            
        return longest;
        
    }
    
    private int getLength (ListNode head) {
        ListNode temp = head;
        int length = 0;
        
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        
        return length;
    }
}
