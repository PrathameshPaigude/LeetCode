class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0)
            return null;

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (true) {

            int min = Integer.MAX_VALUE;
            int j = -1;

            for (int i = 0; i < lists.length; i++) {

                if (lists[i] != null && lists[i].val < min) {
                    min = lists[i].val;
                    j = i;
                }
            }

            if (j == -1)
                break;

            tail.next = lists[j];
            tail = tail.next;

            lists[j] = lists[j].next;
            tail.next = null;
        }

        return dummy.next;
    }
}