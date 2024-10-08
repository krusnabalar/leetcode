import util.ListNode;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0);
        res.next = head;

        ListNode start = res;
        ListNode nAhead = res;
        for (int i = 0; i <= n; i++) {
            nAhead = nAhead.next;
        }

        while (nAhead != null) {
            nAhead = nAhead.next;
            start = start.next;
        }
        start.next = start.next.next;

        return res.next;
    }
}