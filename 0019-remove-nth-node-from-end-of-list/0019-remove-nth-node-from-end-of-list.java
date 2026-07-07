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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while( temp != null)
        {
            temp = temp.next;
            count ++;
        }
        int check = count - n;
        count = 0;
        temp = head;
        if( check == 0) return head.next;
        while( count < check - 1)
        {   
            temp = temp.next;
            count ++;
        }
        if( temp.next == null) return null;
        temp.next = temp.next.next;
        return head;
    }
}