class Solution {

    ListNode ans = null;
    ListNode tail = null;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode l1 = list1;
        ListNode l2 = list2;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                add(l1.val);
                l1 = l1.next;
            } else {
                add(l2.val);
                l2 = l2.next;
            }
        }

        while (l1 != null) {
            add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            add(l2.val);
            l2 = l2.next;
        }

        return ans;
    }

    public void add(int val) {

        ListNode node = new ListNode(val);

        if (ans == null) {
            ans = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = tail.next;
    }
}