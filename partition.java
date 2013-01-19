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
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(head == null) { return null; }
        
        ListNode lessThanHead = null;
        ListNode lessThanCurrent = null;
        ListNode moreThanHead = null;
        ListNode moreThanCurrent = null;
        
        
        
        while(head != null)
        {
        
            if(head.val < x) {
                if(lessThanHead == null)
                {
                    lessThanHead = head;
                    lessThanCurrent = lessThanHead;
                }
                else
                {
                    lessThanCurrent.next = head;
                    lessThanCurrent = lessThanCurrent.next;
                }
            }
            else
            {
                
                if(moreThanHead == null)
                {
                    moreThanHead = head;
                    moreThanCurrent = moreThanHead;
                }
                else
                {
                    moreThanCurrent.next = head;
                    moreThanCurrent = moreThanCurrent.next;
                }
            }
            
           head = head.next;
            
        }
        
        
        
        
        if(lessThanHead == null) { return moreThanHead; }
        else
        {
            if(moreThanCurrent != null) { moreThanCurrent.next = null; }
            
            lessThanCurrent.next = moreThanHead;
            return lessThanHead;
        }
        
    }
}
