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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int index  = 0;
        ListNode l1 = list1;
        ListNode temp = list1;
        ListNode l2 = list1;
        ListNode tail = list2;

        while( index <= b )
        {
            if( index == a - 1) l1 = temp;
            if( index == b) l2 = temp;
            index ++;
            temp = temp.next;
        }

        while( tail.next != null)
        {
            tail = tail.next;
        }

        l1.next = list2;
        tail.next = l2.next;

        return list1;
    }
}