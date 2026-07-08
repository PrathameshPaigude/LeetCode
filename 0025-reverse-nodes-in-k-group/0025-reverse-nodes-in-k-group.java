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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode temp = head;
        ListNode front = head;

        while( front != null)
        {
            int count = 0;
            ListNode current = front;
            temp = front;

            for( int i = 1; i < k; i++)
            {
                if( temp.next == null) break;
                temp = temp.next;
                count ++;
            }
            if( count == k - 1)
            {
                front = temp.next;
                temp.next = null;
                ans.next = reverse(current);
                while( ans.next != null)
                {
                    ans = ans.next;
                }
            }
            else 
            {
                ans.next = current;
                break;
            } 
              

        }
        return dummy.next;

        
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
