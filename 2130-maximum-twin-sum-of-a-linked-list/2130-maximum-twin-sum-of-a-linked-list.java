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
    public int pairSum(ListNode head) {
        HashMap< Integer, Integer> map = new HashMap<>();
        ListNode temp = head;
        int index = 0;
        while( temp != null)
        {
            map.put(index, temp.val);
            index ++;
            temp = temp.next;
        }
        int sum = Integer.MIN_VALUE;
        int i = 0;
        while( i <= (index - 1) / 2)
        {
            sum = Math.max( sum, map.get(i) + map.get(index-1-i));
            i ++;
        }
        return sum;

        
    }
}