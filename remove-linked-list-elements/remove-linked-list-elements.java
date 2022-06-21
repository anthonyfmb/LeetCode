/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0, head);
        ListNode ptr = head;
        ListNode prev = newHead;
        while (ptr != null) {
            if (ptr.val == val) {
                prev.next = ptr.next;
                ptr = ptr.next;
            }
            else {
                prev = ptr;
                ptr = ptr.next;
            }
        }
        
        return newHead.next;
    }
}