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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        int carry = 0;

        while( l1 != null && l2 != null)
        {
            int val = l1.val + l2.val;
            if( carry == 1)
            {
                val += 1;
                carry --;
                if( val >= 10)
                {
                    val -= 10;
                    carry ++;
                }
            }
            else
            {
                if( val >= 10)
                {
                    val -= 10;
                    carry ++;
                }

            }
            ListNode add = new ListNode(val);
            tail.next = add;
            tail = add;
            l1 = l1.next;
            l2 = l2.next;
            
        }
        while ( l1 != null)
        {
            int val = l1.val;
            if( carry == 1)
            {
                val += 1;
                carry --;
                if( val >= 10)
                {
                    val -= 10;
                    carry ++;
                }
            }
            else
            {
                if( val >= 10)
                {
                    val -= 10;
                    carry ++;
                }
            }
            ListNode add = new ListNode(val);
            tail.next = add;
            tail = add;
            l1 = l1.next;
            
        } 
        while ( l2 != null)
        {
            int val = l2.val;
            if( carry == 1)
            {
                val += 1;
                carry --;
                if( val >= 10)
                {
                    val -= 10;
                    carry ++;
                }
            }
            else
            {
                if( val >= 10)
                {
                    val -= 10;
                    carry ++;
                }
            }
            ListNode add = new ListNode(val);
            tail.next = add;
            tail = add;
            l2 = l2.next;
            
        }    
        if( carry == 1) 
        {
            ListNode add = new ListNode(1);
            tail.next = add;
        }
        return dummy.next; 
        
    }
}