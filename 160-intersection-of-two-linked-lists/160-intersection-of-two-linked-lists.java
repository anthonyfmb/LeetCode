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
        
        ListNode ptrTwo = headB;
        int lengthB = 0;
        while (ptrTwo != null) {
            lengthB++;
            ptrTwo = ptrTwo.next;
        }
        
        if (lengthA > lengthB) {
            int offset = Math.abs(lengthA - lengthB);
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
            int offset = Math.abs(lengthA - lengthB);
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