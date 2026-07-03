class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode temp = head;
        ListNode first = null;
        ListNode second = head;

        int count = 1;

        while (temp != null) {

            if (count == k) {
                first = temp;
            }

            if (count > k) {
                second = second.next;
            }

            temp = temp.next;
            count++;
        }

        int val = first.val;
        first.val = second.val;
        second.val = val;

        return head;
    }
}