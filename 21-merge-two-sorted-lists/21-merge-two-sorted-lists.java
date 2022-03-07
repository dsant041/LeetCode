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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode sorted = new ListNode();
        ListNode head = sorted;
        
        ListNode curr1 = list1;
        
        ListNode curr2 = list2;
        
        while (curr1 != null || curr2 != null){
            
            if (curr1 == null){
                ListNode s = new ListNode(curr2.val);
                sorted.next = s;
                curr2 = curr2.next;
            }
            else if (curr2 == null){
                ListNode s = new ListNode(curr1.val);
                sorted.next = s;
                curr1 = curr1.next;
            }
            
            else if (curr1.val < curr2.val){
                ListNode s = new ListNode(curr1.val);
                sorted.next = s;
                curr1 = curr1.next;
            }
            else{
                ListNode s = new ListNode(curr2.val);
                sorted.next = s;
                curr2 = curr2.next;
            }
            
            sorted = sorted.next;
            
        }
        
        return head.next;
        
        
    }
}