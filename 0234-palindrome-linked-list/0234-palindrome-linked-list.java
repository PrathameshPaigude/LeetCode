class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode temp = slow.next;

        while (temp != null)
        {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        while (prev != null)
        {
            if (prev.val != head.val) return false;

            prev = prev.next;
            head = head.next;
        }

        return true;
    }
}