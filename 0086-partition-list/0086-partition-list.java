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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(-1);
        ListNode i = dummy;
        ListNode temp = head;

        while( temp != null)
        {
            if( temp.val < x)
            {
                i.next = new ListNode(temp.val);
                i = i.next;
            }
            temp = temp.next;
        }
        temp = head;
        while ( temp != null)
        {
            if( temp.val >= x )
            {
                i.next = new ListNode(temp.val);
                i = i.next;
            }
            temp = temp.next;
        }
        
        return dummy.next;
        
    }
}