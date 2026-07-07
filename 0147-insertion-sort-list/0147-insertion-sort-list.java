class Solution {
    public ListNode insertionSortList(ListNode head) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = head;

        while (temp != null) {

            ListNode front = temp.next;

            ListNode prev = dummy;

            while (prev.next != null && prev.next.val < temp.val) {
                prev = prev.next;
            }

            temp.next = prev.next;
            prev.next = temp;

            temp = front;
        }

        return dummy.next;
    }
}