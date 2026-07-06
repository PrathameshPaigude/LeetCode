class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode temp = head;
        ListNode go = head.next;
        ListNode tail = go;

        while (go != null && go.next != null)
        {
            temp.next = go.next;
            temp = temp.next;

            go.next = temp.next;
            go = go.next;
        }

        temp.next = tail;

        return head;
    }
}