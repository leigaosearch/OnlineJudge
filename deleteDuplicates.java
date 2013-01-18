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
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ListNode current = head;
        ListNode next;
        
        while(current != null)
        {
            next = current.next;
            while((next != null) && (current.val == next.val))
            {
                 next = next.next;
            }
            
            current.next = next;
            current = next;
            
        }
        
        return head;
        
    }
}
