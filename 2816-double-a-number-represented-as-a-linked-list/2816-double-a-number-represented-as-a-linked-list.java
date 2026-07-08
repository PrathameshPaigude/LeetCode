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
    public ListNode doubleIt(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        ListNode rev = reverse( head);

        while( rev != null || carry != 0 )
        {
            if( rev != null)
            {
            int prod = rev.val * 2 + carry;
            int digit = prod % 10;
            carry = prod / 10;
            temp.next = new ListNode(digit);
            rev = rev.next;

            }
            else
            {
                temp.next = new ListNode(carry);
                carry = 0;
            }
            temp = temp.next;
        }

        ListNode ans = reverse(dummy.next);
        return ans;
        
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode front = temp.next;

            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }
}