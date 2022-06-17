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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headPtr = new ListNode(0, head);
        ListNode ptr = head;
        int length = 0;
        while (ptr != null) {
            length++;
            ptr = ptr.next;
        }
        
        ListNode ptrTwo = headPtr;
        for (int i = 0; i < length - n; i++) {
            ptrTwo = ptrTwo.next;
        }
        if (ptrTwo.next != null) ptrTwo.next = ptrTwo.next.next;
        return headPtr.next;
    }
}