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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        ListNode ans = new ListNode(-1);
        ListNode sum = ans;
        while( temp != null && temp.next != null)
        {
            if( temp.val == 0)
            {
                sum.next = temp.next;
                temp = temp.next;
                sum = sum.next;
                while( temp.val != 0)
                {
                    temp = temp.next;
                    sum.val += temp.val;
                }
            }
        }
        sum.next = null;
        return ans.next;
    }
}