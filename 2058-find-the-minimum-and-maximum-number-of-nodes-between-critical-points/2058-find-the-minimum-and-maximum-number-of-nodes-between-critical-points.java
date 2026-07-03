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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        if(head == null || head.next == null || head.next.next == null ) return ans;

        ListNode prev = head;
        ListNode temp = head.next;
        ListNode front = head.next.next;
        int first = -1;
        int last = -1;
        int count = 2;
        int min = Integer.MAX_VALUE;

        while( front != null)
        {
            if( (temp.val > front.val && temp.val > prev.val) ||  (temp.val < front.val && temp.val < prev.val) )   
            {
                if( first == -1) 
                {
                    first = count;
                    last = count;
                }
                else
                {
                    min = Math.min(min,count - last);
                    last = count;
                }
            }
            count ++;
            prev = prev.next;
            temp = temp.next;
            front = front.next;

        }
        ans[0] = min;
        ans[1] = last - first;

        if( ans[0] == Integer.MAX_VALUE) return new int[] {-1,-1};

        return ans;
    }
}