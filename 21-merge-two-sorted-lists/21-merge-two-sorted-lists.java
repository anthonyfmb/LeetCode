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

        ListNode head = null;
        ListNode prev = null;
        if (list1.val < list2.val) {
            head = list1;
            prev = head;
            list1 = list1.next;
        }
        else {
            head = list2;
            prev = head;
            list2 = list2.next;
        }
        
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                prev.next = list2;
                prev = list2;
                list2 = list2.next;
            }
            else if (list2 == null) {
                prev.next = list1;
                prev = list1;
                list1 = list1.next;
            }
            else if (list1.val < list2.val) {
                prev.next = list1;
                prev = list1;
                list1 = list1.next;
            }
            else {
                prev.next = list2;
                prev = list2;
                list2 = list2.next;
            }
        }
        
        return head;
    }
}