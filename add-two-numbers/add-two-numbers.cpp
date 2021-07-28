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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        if(l1 == NULL) return l2;if(l2 == NULL) return l1;
        ListNode res(0);
        ListNode *a = l1, *b = l2, *c = &res;
        int carry = 0;
        while(a != NULL || b != NULL) {
            int i, j;
            if(a != NULL) {
                i = a->val;
                a = a->next;
            }
            else i = 0;
            if(b != NULL) {
                j = b->val;
                b = b->next;
            } 
            else j = 0;
            int sum = i + j + carry;
            c->next = new ListNode(sum % 10);;
            c = c->next;
            carry = sum / 10;
        }
        if(carry > 0) c->next = new ListNode(carry);
        return res.next;
    }
};