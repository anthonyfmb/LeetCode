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
        HashSet<ListNode> set = new HashSet<>();
        
        while (headA != null || headB != null) {
            if (headA == headB) return headA;
            if (set.contains(headA)) return headA;
            if (set.contains(headB)) return headB;
            System.out.println("H");
            
            if (headA != null) {
                set.add(headA);
                headA = headA.next;
            }
            if (headB != null) {
                set.add(headB);
                headB = headB.next;
            }
        }
        
        return null;
    }
}