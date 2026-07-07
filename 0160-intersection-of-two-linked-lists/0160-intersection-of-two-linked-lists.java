/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempa = headA;
        int count1 = 0, count2 = 0;

        while (tempa != null) {
            count1++;
            tempa = tempa.next;
        }

        ListNode tempb = headB;

        while (tempb != null) {
            count2++;
            tempb = tempb.next;
        }

        tempa = headA;
        tempb = headB;

        if (count1 > count2) {
            for (int i = 0; i < count1 - count2; i++) {
                tempa = tempa.next;
            }
        } else {
            for (int i = 0; i < count2 - count1; i++) {
                tempb = tempb.next;
            }
        }

        while (tempa != null && tempb != null) {

            if (tempa == tempb) {
                return tempa;
            }

            tempa = tempa.next;
            tempb = tempb.next;
        }

        return null;
    }
}