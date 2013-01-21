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
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(head == null) { return null; }
        else if(n == 0) { return head; }
        else if(head.next == null) { return head; }
        
        ListNode current = head;
        ListNode toMove = head;
        
        for(int i=0; i<n-1; i++)
        {
            if(current.next == null) { current = head; }
            else
            {
            current = current.next;
            }
        }

        if(current.next == null) { return head; }
        
             current = current.next;
             toMove = toMove.next;
             ListNode newHead = head;
        
    
             while((current != null) && (current.next != null))
             {
                   current = current.next;
                    toMove = toMove.next;
                    newHead = newHead.next;
             }
            
        
        
        newHead.next = null;
        ListNode toReturn = toMove;
        
        while(toMove.next != null)
        {
            toMove = toMove.next;
        }
        
        toMove.next = head;
       
        
        
        return toReturn;
        
    }
}
