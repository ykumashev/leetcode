//Given 1->2->3->4->5->6, you should return the list as 2->1->4->3->6->5.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        head.next.next = swapPairs(head.next.next);
        ListNode swap = head.next;
        head.next = head.next.next;
        swap.next = head;
        return swap;
    }
}
