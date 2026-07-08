class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] ans = new ListNode[k];

        ListNode temp = head;
        int count = 0;

        while (temp != null)
        {
            temp = temp.next;
            count++;
        }

        int r = count % k;
        int d = count / k;

        temp = head;

        for (int diff = 0; diff < k; diff++)
        {
            ans[diff] = temp;

            int size = d;

            if (diff < r)
            {
                size++;
            }

            for (int i = 1; i < size; i++)
            {
                temp = temp.next;
            }

            if (temp != null)
            {
                ListNode travel = temp.next;
                temp.next = null;
                temp = travel;
            }
        }

        return ans;
    }
}