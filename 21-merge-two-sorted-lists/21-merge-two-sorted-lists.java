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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode firstPtr = list1;
        ListNode secondPtr = list2;
        ListNode head = null;
        ListNode prev = null;
        if (firstPtr.val < secondPtr.val) {
            head = firstPtr;
            prev = head;
            firstPtr = firstPtr.next;
        }
        else {
            head = secondPtr;
            prev = head;
            secondPtr = secondPtr.next;
        }
        
        while (firstPtr != null || secondPtr != null) {
            if (firstPtr == null) {
                prev.next = secondPtr;
                prev = secondPtr;
                secondPtr = secondPtr.next;
            }
            else if (secondPtr == null) {
                prev.next = firstPtr;
                prev = firstPtr;
                firstPtr = firstPtr.next;
            }
            else if (firstPtr.val < secondPtr.val) {
                prev.next = firstPtr;
                prev = firstPtr;
                firstPtr = firstPtr.next;
            }
            else {
                prev.next = secondPtr;
                prev = secondPtr;
                secondPtr = secondPtr.next;
            }
        }
        
        return head;
    }
}