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
    ListNode* partition(ListNode* head, int x) {
        ListNode smol(0), big(0);
        ListNode *a = &smol, *b = &big;
        while(head != NULL) {
            if(head->val < x) {
                a->next = head;
                a = a->next;
            } else {
                b->next = head;
                b = b->next;
            }
            head = head->next;
        }
        b->next = NULL;
        a->next = big.next;
        
        return smol.next;
    }
};