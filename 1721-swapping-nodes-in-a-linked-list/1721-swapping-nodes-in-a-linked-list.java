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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        int val1 = -1;
        int val2 = -1;
        while( temp != null)
        {
            count++;
            if( count == k) val1 = temp.val;
            temp = temp.next;
        }
        temp = head;
        int i = 0;
        while( i <= count - k )
        {
            if ( i == count - k)
            {
                val2 = temp.val;
                temp.val = val1; 
            }
            temp = temp.next;
            i++;
        }
        i = 0;
        temp = head;
        while( i < k)
        {
           
            if ( i == k - 1) temp.val = val2;
            temp = temp.next;
            i++; 
        }
        return head;
    }
}