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
    public ListNode rotateRight(ListNode head, int k) {
        if( head == null || head.next == null) return head;
        if( k == 0) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        int count = 0;
        while( temp != null)
        {
            temp = temp.next;
            count ++;
        }
        temp = head;
        if( k >= count)
        {
            k = k % count;;
        }
        if( k == 0) return head;
        while( k > 0)
        {
            fast = fast.next;
            k --;
        }
        while( fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode start = slow.next;
        slow.next = null;
        fast.next = temp;
        return start;
    }
}