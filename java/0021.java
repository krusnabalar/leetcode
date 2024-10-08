import java.util.*;
import util.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode last = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                last.next = list1;
                list1 = list1.next;
            } else {
                last.next = list2;
                list2 = list2.next;
            }
            last = last.next;
        }

        last.next = list1 == null ? list2 : list1;

        return head.next;
    }
}