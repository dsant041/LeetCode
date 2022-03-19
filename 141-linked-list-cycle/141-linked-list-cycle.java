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
        /*
        if (head == null)
            return false;
        
        if (head.next == null)
            return false;
        else if (head.next == head)
            return true;
        */
        ListNode point = head;
        
        
        
       
            
        while (point != null && point.next != null){
            
            head = head.next;
            point = point.next.next;
            
            if (head == point)
                return true;
        
            
        }
        
        return false;
        
    }
}