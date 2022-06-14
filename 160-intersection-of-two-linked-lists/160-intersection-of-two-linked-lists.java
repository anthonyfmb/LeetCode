/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrOne = headA;
        int lengthA = 0;
        while (ptrOne != null) {
            lengthA++;
            ptrOne = ptrOne.next;
        }
        int lengthB = 0;
        ListNode ptrTwo = headB;
        while (ptrTwo != null) {
            lengthB++;
            ptrTwo = ptrTwo.next;
        }
        
        int offset = Math.abs(lengthA - lengthB);
        
        if (lengthA > lengthB) {
            for (int i = 0; i < offset; i++) {
                headA = headA.next;
            }
            
            while (headA != null) {
                if (headA == headB) return headA;
                headA = headA.next;
                headB = headB.next;
            }
        }
        else {
            for (int i = 0; i < offset; i++) {
                headB = headB.next;
            }
            
            while (headA != null) {
                if (headA == headB) return headA;
                headA = headA.next;
                headB = headB.next;
            }
        }
        
        return null;
    }
}