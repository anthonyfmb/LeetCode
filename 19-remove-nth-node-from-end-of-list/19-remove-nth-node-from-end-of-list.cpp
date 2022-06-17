/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *pre_head = new ListNode(0, head);
        ListNode *len_ptr = head;
        int length = 0;
        while (len_ptr != NULL) {
            length++;
            len_ptr = len_ptr->next;
        }
        
        ListNode *ptr = pre_head;
        for (int i = 0; i < length - n; i++) {
            ptr = ptr->next;
        }
        ptr->next = ptr->next->next;
        return pre_head->next;
    }
};