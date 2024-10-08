import java.util.*;
import util.ListNode;

class Solution {
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        Set<Integer> uniqueValues = new HashSet<>();
        Set<Integer> repeatingValues = new HashSet<>();

        ListNode secondTraversal = head;
        ListNode result = head;
        while (head != null) {
            if (!uniqueValues.add(head.val))
                repeatingValues.add(head.val);
            head = head.next;
        }
        ListNode prev = null;
        while (secondTraversal != null) {
            if (repeatingValues.contains(secondTraversal.val)) {
                if (prev == null) {
                    result = result.next;
                } else {
                    prev.next = secondTraversal.next;
                }
            } else {
                prev = secondTraversal;
            }
            secondTraversal = secondTraversal.next;
        }
        return result;
    }
}