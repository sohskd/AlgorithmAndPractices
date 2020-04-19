package LeetCode;

public class MergeTwoSortedLinkedList {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        mergeTwoLists(l1, l2);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode ans = null;
        ListNode head = ans;

        if (l1 == null && l2 == null)
            return head;

        while (l1 != null && l2 != null) {
            if (head == null) {
                if (l1.val < l2.val) {
                    ans = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    ans = new ListNode(l2.val);
                    l2 = l2.next;
                }

                head = ans;

            } else {
                if (l1.val < l2.val) {
                    ans.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    ans.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
                ans = ans.next;
            }
        }

        if (l1 == null && l2 != null) {

            if (head == null)
                return l2;

            while (l2 != null) {
                ans.next = new ListNode(l2.val);
                l2 = l2.next;
                ans = ans.next;
            }
        }

        if (l1 != null && l2 == null) {

            if (head == null)
                return l1;

            while (l1 != null) {
                ans.next = new ListNode(l1.val);
                l1 = l1.next;
                ans = ans.next;
            }
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}