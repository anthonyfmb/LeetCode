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
    public ListNode oddEvenList(ListNode head) {
        ListNode ptr = head;
        int index = 1;
        ListNode evenPtr = null;
        while (ptr != null) {
            if (index == 2) evenPtr = ptr;

            ListNode next = ptr.next;
            if (ptr.next == null || ptr.next.next == null) {
                if (index % 2 == 1 && index != 1) {
                    ptr.next = evenPtr;
                }
                else {
                    if (ptr.next != null && index != 1) ptr.next = ptr.next.next;
                }
            }
            else {
                ptr.next = ptr.next.next;
            }
            ptr = next;
            index++;
        }
        
        return head;
    }
}